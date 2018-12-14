package com.example.asyncexaple;

import android.os.AsyncTask;
import android.util.Log;

public class AsyncTaskClass extends AsyncTask<String, Integer, String> {
	CallbackInterface callbackInterface=null;
	AsyncTaskClass(CallbackInterface cbi)
	{
		callbackInterface=cbi;
	}

	@Override
	protected String doInBackground(String... params) {
		// TODO Auto-generated method stub
		Log.d("Inside Async Task","doInBackground");
		publishProgress(1);
		return null;
	}
	
	@Override
	public void onPreExecute()
	{
		Log.d("Inside Async Task","onPreExecute");
		if(callbackInterface!=null)
		{
			callbackInterface.onPreExecute();
		}
	}
	@Override
	public void onPostExecute(String result)
	{
		Log.d("Inside Async Task","onPostExecute");
		if(callbackInterface!=null)
		{
			callbackInterface.onPostExecute("");
		}
	}
	
	@Override
	public void onProgressUpdate(Integer... vod)
	{
		Log.d("Inside Async Task","onProgressUpdate");
		if(callbackInterface!=null)
		{
			callbackInterface.onProgressUpdate(1);
		}
	}
	
	@Override
	public void onCancelled()
	{
		Log.d("Inside Async Task","onCancelled");
		if(callbackInterface!=null)
		{
			callbackInterface.onCancelled("");
		}
	}
	

}
