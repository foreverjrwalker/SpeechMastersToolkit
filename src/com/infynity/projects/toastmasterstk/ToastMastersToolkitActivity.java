package com.infynity.smu.toastmasterstk;

/**
 * Toastmaster's Toollkit
 * 
 * This is the main class for the launching of the Toastmaster Toolkit activities.
 * 
 * @author Michael Slaughter
 */
import java.io.Serializable;
import java.util.Scanner;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ToastMastersToolkitActivity extends Activity implements OnClickListener {
	/** Called when the activity is first created. */
	public Button generate, read, about, exit;


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		View agenda_button = this.findViewById(R.id.button_agenda);
		agenda_button.setOnClickListener(this);
		View about_button = this.findViewById(R.id.button_about);
		about_button.setOnClickListener(this);
		View timer_button = this.findViewById(R.id.button_timer);
		timer_button.setOnClickListener(this);
		View counter_button = this.findViewById(R.id.button_counter);
		counter_button.setOnClickListener(this);
		View topics_button = this.findViewById(R.id.button_topics);
		topics_button.setOnClickListener(this);
		View wotd_button = this.findViewById(R.id.button_wotd);
		wotd_button.setOnClickListener(this);
		View exit_button = this.findViewById(R.id.button_exit);
		exit_button.setOnClickListener(this);
	}
	/*
	
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		if (requestCode == 0){
			if (resultCode == RESULT_OK){
				String contents = data.getStringExtra("SCAN_RESULT").substring(8);
				String info[] = new String[5];
				Scanner scan = new Scanner(contents);
				scan.useDelimiter(";");
				String anything = "";
				
				for(int i = 0; i < 5; i++){
					String next = scan.next().substring(2);
					info[i] = next;
					System.out.print("info: "+info[i]);
					anything += next + " "; 	
				}
				Toast.makeText(getApplicationContext(), anything, Toast.LENGTH_LONG).show();
				//Right here is where I am sending my code to data.php in order to write into the data base
				
				MyDataSender mds = new MyDataSender("Admin",info[0],info[1],info[3], info[4],info[2]);
				mds.sendData();
				Intent i = new Intent(this, ContactManager.class);
				i.putExtra(ContactManager.PAYLOAD, info);
		        startActivity(i);
				//Right here is where I need to send to my PHP website
				//Then I need to add the info to the contact list
			}
		}
	}*/

	
	//@Override
	public void onClick(android.view.View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button_agenda:
			 Uri uri = Uri.parse("file://mnt/sdcard/Documents/TMAgenda.pdf");
			 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
			 startActivity(intent);

			break;
		case R.id.button_counter:
			Intent b = new Intent(this, CounterActivity.class);
			startActivity(b);
			break;
		case R.id.button_topics:
			Intent d = new Intent(this, HumoristActivity.class);
			startActivity(d);
			break;
		case R.id.button_timer:
			Intent c = new Intent(this, com.infynity.smu.toastmasterstk.Timer.TimerSetup.class);
			startActivity(c);
			break;
		case R.id.button_wotd:
			Intent f = new Intent(this, WOTDActivity.class);
			startActivity(f);
			break;
		case R.id.button_about:
			Intent e = new Intent(this, AboutActivity.class);
			startActivity(e);
			break;
		case R.id.button_exit:
			finish();
			

	}
		

}
}