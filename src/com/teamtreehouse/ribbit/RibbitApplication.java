package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, "EDe7U08YFxps85YNMXCqqgMyvxtSvtreBPJltPDz", "nnofl0M823SqxnDsdQQ0TVWPdVb5RgZZP7UNXido");
	}
}
