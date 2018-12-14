package com.example.asyncexaple;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity implements CallbackInterface {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d("Inside Main Activity","MainActivity onCreate");
		AsyncTaskClass asyncTaskClass=new AsyncTaskClass(this);
		asyncTaskClass.execute();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onPreExecute() {
		// TODO Auto-generated method stub
		Log.d("Inside Main Activity","MainActivity onPreExecute");
		
	}

	@Override
	public void onPostExecute(Object resp) {
		// TODO Auto-generated method stub
		Log.d("Inside Main Activity","MainActivity onPostExecute");
		
	}

	@Override
	public void onProgressUpdate(Integer val) {
		// TODO Auto-generated method stub
		Log.d("Inside Main Activity","MainActivity onProgressUpdate");
		
	}

	@Override
	public void onCancelled(Object resp) {
		// TODO Auto-generated method stub
		Log.d("Inside Main Activity","MainActivity onCancelled");
		
	}
}
