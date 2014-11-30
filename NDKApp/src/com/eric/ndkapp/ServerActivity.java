package com.eric.ndkapp;

import android.os.Bundle;
import android.widget.EditText;


public class ServerActivity extends BaseActivity {
	/**
	 * Constructor.
	 */
	public ServerActivity() {
		super(R.layout.activity_server);
	}
	
	protected void onStartButtonClicked() 
	{
		String ip = ipEdit.getText().toString();
		Integer port = getPort();
		String nick = nickEdit.getText().toString();
		String message = nick + ": " + messageEdit.getText().toString();

		if (ip.length() != 0 && port != null && message.length() != 0)
		{
			StartServerTask startServerTask = new StartServerTask(ip, port, message);
			startServerTask.start();	
		}
	}

	@Override
	protected void onStopButtonClicked() 
	{
		String ip = ipEdit.getText().toString();
		Integer port = getPort();
		String nick = nickEdit.getText().toString();
		String message = nick + ": " + messageEdit.getText().toString();

		if (ip.length() != 0 && port != null && message.length() != 0)
		{
			StopServerTask stopServerTask = new StopServerTask(ip, port, message);
			stopServerTask.start();	
		}
	}
	
	@Override
	protected void onSendButtonClicked() 
	{
		String ip = ipEdit.getText().toString();
		Integer port = getPort();
		String nick = nickEdit.getText().toString();
		String message = nick + ": " + messageEdit.getText().toString();

		if (ip.length() != 0 && port != null && message.length() != 0)
		{
			SendServerTask sendServerTask = new SendServerTask(ip, port, message);
			sendServerTask.start();	
		}		
	}

	/**
	 * Starts the TCP server on the given port.
	 * 
	 * @param port
	 *            port number.
	 * @throws Exception
	 */
	private native void nativeStartServer(String ip, int port, String message) 
			throws Exception;
	
	private native void nativeStopServer(String ip, int port, String message) 
			throws Exception;

	private native void nativeSendServer(String ip, int port, String message) 
			throws Exception;
	

	/**
	 * Server task.
	 */
	private class StartServerTask extends BaseTask {
		
		/**
		 * Constructor.
		 * 
		 * @param port
		 *            port number.
		 */
		public StartServerTask(String ip, int port, String message)
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
				nativeStartServer(ip, port, message);
			} 
			catch (Exception e) 
			{
				logMessage(e.getMessage());
			}
		}
		
		@Override
		protected void onPostExecute() 
		{
		}		
	}
	
	private class StopServerTask extends BaseTask {
		
		/**
		 * Constructor.
		 * 
		 * @param port
		 *            port number.
		 */
		public StopServerTask(String ip, int port, String message)
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
				nativeStopServer(ip, port, message);
			} 
			catch (Exception e) 
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
	private class SendServerTask extends BaseTask {
		
		/**
		 * Constructor.
		 * 
		 * @param port
		 *            port number.
		 */
		public SendServerTask(String ip, int port, String message)
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
				nativeSendServer(ip, port, message);
			} 
			catch (Exception e) 
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
