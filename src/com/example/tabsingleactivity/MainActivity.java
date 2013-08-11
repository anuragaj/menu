package com.example.tabsingleactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		TabHost th=(TabHost)findViewById(R.id.tabhost);
		th.setup();
		
		TabSpec specs;
		
		specs=th.newTabSpec("tag1");
		specs.setContent(R.id.tab1);
		specs.setIndicator("ALL");
		th.addTab(specs);
		
		specs=th.newTabSpec("tag2");
		specs.setContent(R.id.tab2);
		specs.setIndicator("OFFER");
		th.addTab(specs);
		
		
		specs=th.newTabSpec("tag3");
		specs.setContent(R.id.tab3);
		specs.setIndicator("HIGHEST Rated");
		th.addTab(specs);
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
