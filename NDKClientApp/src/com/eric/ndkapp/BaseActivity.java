package com.eric.ndkapp;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public abstract class BaseActivity extends ActionBarActivity implements OnClickListener 
{
	/** IP address. */
	protected EditText ipEdit;

	/** Message edit. */
	protected EditText messageEdit;
	
	protected EditText nickEdit;
	
	/** Port number. */
	protected EditText portEdit;

	/** Start button. */
	protected Button startButton;
	
	/** Stop button. */
	protected Button stopButton;
	
	/** Send Message button. */
	protected Button sendButton;
	
	/** Log scroll. */
	protected ScrollView logScroll;

	/** Log view. */
	protected TextView logView;

	/** Layout ID. */
	private final int layoutID;

	/**
	 * Constructor.
	 * 
	 * @param layoutID
	 *            layout ID.
	 */
	public BaseActivity(int layoutID) 
	{
		this.layoutID = layoutID;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(layoutID);

		portEdit = (EditText) findViewById(R.id.port_edit);		
		startButton = (Button) findViewById(R.id.start_button);
		stopButton = (Button) findViewById(R.id.stop_button);
		sendButton = (Button) findViewById(R.id.send_button);
		logScroll = (ScrollView) findViewById(R.id.log_scroll);
		logView = (TextView) findViewById(R.id.log_view);
		ipEdit = (EditText) findViewById(R.id.ip_edit);
		messageEdit = (EditText) findViewById(R.id.message_edit);
		nickEdit = (EditText) findViewById(R.id.nick_edit);

		startButton.setOnClickListener(this);
		stopButton.setOnClickListener(this);
		sendButton.setOnClickListener(this);	
	}

	@Override
	public void onClick(View view) 
	{		
		if (view == startButton) 
		{
			onStartButtonClicked();
		}
		else if (view == stopButton)
		{
			onStopButtonClicked();
		}
		else if (view == sendButton)
		{
			onSendButtonClicked();
		}
	}

	/**
	 * On start button clicked.
	 */
	protected abstract void onStartButtonClicked();
	
	/**
	 * On stop button clicked.
	 */
	protected abstract void onStopButtonClicked();	
	
	/**
	 * On send message button clicked.
	 */
	protected abstract void onSendButtonClicked();	

	/**
	 * Gets the port number as an integer.
	 * 
	 * @return port number or null.
	 */
	protected Integer getPort() 
	{
		Integer port;

		try 
		{
			port = Integer.valueOf(portEdit.getText().toString());
		} 
		catch (NumberFormatException e) 
		{
			port = null;
		}

		return port;
	}

	/**
	 * Logs the given message.
	 * 
	 * @param message
	 *            log message.
	 */
	protected void logMessage(final String message) 
	{
		runOnUiThread(new Runnable() 
		{
			public void run() 
			{
				logMessageDirect(message);
			}
		});
	}

	/**
	 * Logs given message directly.
	 * 
	 * @param message
	 *            log message.
	 */
	protected void logMessageDirect(final String message) 
	{
		logView.append(message);
		logView.append("\n");
		logScroll.fullScroll(View.FOCUS_DOWN);
	}
	
	/**
	 * Abstract async echo task.
	 */
	protected abstract class BaseTask extends Thread 
	{
		/** Handler object. */
		private final Handler handler;
		
		/** IP address to connect. */
		protected String ip;

		/** Port number. */
		protected int port;

		/** Message text to send. */
		protected String message;
		
		/**
		 * Constructor.
		 */
		public BaseTask() 
		{
			handler = new Handler();
		}
		
		@Override
		public synchronized void start() 
		{
			onPreExecute();			
			super.start();
		}

		@Override
		public void run() 
		{
			onExecute();
			
			handler.post(new Runnable() 
			{
				public void run() 
				{
					onPostExecute();
				}
			});
		}

		/**
		 * On pre execute callback in calling thread.
		 */
		protected abstract void onPreExecute();
		
		/**
		 * On background callback in new thread.
		 */
		protected abstract void onExecute();

		/**
		 * On post execute callback in calling thread.
		 */
		protected abstract void onPostExecute();
	}

	static 
	{
		System.loadLibrary("Chat");
	}
}
