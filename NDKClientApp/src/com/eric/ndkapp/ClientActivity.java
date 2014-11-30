package com.eric.ndkapp;

import android.os.Bundle;
import android.widget.EditText;

public class ClientActivity extends BaseActivity
{
	/**
	 * Constructor.
	 */
	public ClientActivity()
	{
		super(R.layout.activity_client);
	}	
	protected void onStartButtonClicked()
	{
		String ip = ipEdit.getText().toString();
		Integer port = getPort();
		String nick = nickEdit.getText().toString();
		String message = nick + ": " + messageEdit.getText().toString();

		if ((0 != ip.length()) && (port != null) && (0 != message.length()))
		{
			StartClientTask startClientTask = new StartClientTask(ip, port, message);
			startClientTask.start();
		}
	}

	@Override
	protected void onStopButtonClicked() {
		String ip = ipEdit.getText().toString();
		Integer port = getPort();
		String nick = nickEdit.getText().toString();
		String message = nick + ": " + messageEdit.getText().toString();

		if ((0 != ip.length()) && (port != null) && (0 != message.length()))
		{
			StopClientTask stopClientTask = new StopClientTask(ip, port, message);
			stopClientTask.start();
		}		
	}
	
	@Override
	protected void onSendButtonClicked() {
		String ip = ipEdit.getText().toString();
		Integer port = getPort();
		String nick = nickEdit.getText().toString();
		String message = nick + ": " + messageEdit.getText().toString();

		if ((0 != ip.length()) && (port != null) && (0 != message.length()))
		{
			SendClientTask sendClientTask = new SendClientTask(ip, port, message);
			sendClientTask.start();
		}		
	}

	private native void nativeStartClient(String ip, int port, String message)
			throws Exception;
	
	private native void nativeStopClient(String ip, int port, String message)
			throws Exception;

	private native void nativeSendClient(String ip, int port, String message)
			throws Exception;


	/**
	 * Client task.
	 */
	private class StartClientTask extends BaseTask
	{
		/**
		 * Constructor.
		 * 
		 * @param ip
		 *            IP address to connect.
		 * @param port
		 *            port number to connect.
		 * @param message
		 *            message text to send.
		 */
		public StartClientTask(String ip, int port, String message)
		{
			this.ip = ip;
			this.port = port;
			this.message = message;
		}

		@Override
		protected void onPreExecute() 
		{
			startButton.setEnabled(false);
			stopButton.setEnabled(true);
			sendButton.setEnabled(true);
			logView.setText("");
		}
		
		@Override
		protected void onExecute()
		{
			try
			{
				nativeStartClient(ip, port, message);
			} 
			catch (Throwable e)
			{
				logMessage(e.getMessage());
			}
		}
		
		@Override
		protected void onPostExecute() 
		{
		}		
	}
	
	private class StopClientTask extends BaseTask
	{
		/**
		 * Constructor.
		 * 
		 * @param ip
		 *            IP address to connect.
		 * @param port
		 *            port number to connect.
		 * @param message
		 *            message text to send.
		 */
		public StopClientTask(String ip, int port, String message)
		{
			this.ip = ip;
			this.port = port;
			this.message = message;
		}

		@Override
		protected void onPreExecute() 
		{
		}
		
		@Override
		protected void onExecute()
		{
			try
			{
				nativeStopClient(ip, port, message);
			} 
			catch (Throwable e)
			{
				logMessage(e.getMessage());
			}
		}
		
		@Override
		protected void onPostExecute() 
		{
			startButton.setEnabled(true);
			stopButton.setEnabled(false);
			sendButton.setEnabled(false);
			logView.setText("");
		}		
	}	
	
	private class SendClientTask extends BaseTask
	{
		/**
		 * Constructor.
		 * 
		 * @param ip
		 *            IP address to connect.
		 * @param port
		 *            port number to connect.
		 * @param message
		 *            message text to send.
		 */
		public SendClientTask(String ip, int port, String message)
		{
			this.ip = ip;
			this.port = port;
			this.message = message;
		}

		@Override
		protected void onPreExecute() 
		{
		}
		
		@Override
		protected void onExecute()
		{
			try
			{
				nativeSendClient(ip, port, message);
			} 
			catch (Throwable e)
			{
				logMessage(e.getMessage());
			}
		}
		
		@Override
		protected void onPostExecute() 
		{
		}		
	}
}
