package org.shujito.simplenotes;

import android.app.Application;
import android.util.Log;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.Configuration;

public class SimpleNotesApplication extends Application
{
	public static final String TAG = SimpleNotesApplication.class.getSimpleName();
	
	@Override
	public void onCreate()
	{
		super.onCreate();
		Log.e(TAG, "Log my cat, now.");
		Configuration configuration = new Configuration.Builder(this)
			.setDatabaseName(this.getPackageName())
			.setDatabaseVersion(1)
			.create();
		ActiveAndroid.initialize(configuration);
	}
}
