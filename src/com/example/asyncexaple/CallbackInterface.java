package com.example.asyncexaple;

public interface CallbackInterface {
	public void onPreExecute();
	public void onPostExecute(Object resp);
	public void onProgressUpdate(Integer val);
	public void onCancelled(Object resp);
	

}
