package com.infynity.smu.toastmasterstk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class CounterActivity extends Activity implements OnClickListener{
	TextView ah_count; 
	TextView um_count; 
	TextView so_count; 
	TextView wotd_count;
	Activity currentAct = this;
	
	
	
@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.counter);
	View ahhctr_button = this.findViewById(R.id.AhhCounter);
	ahhctr_button.setOnClickListener(this);
	View umctr_button = this.findViewById(R.id.UmCounter);
	umctr_button.setOnClickListener(this);
	View wotdctr_button = this.findViewById(R.id.WOTDCounter);
	wotdctr_button.setOnClickListener(this);
	View soctr_button = this.findViewById(R.id.BridgeWordCounter);
	soctr_button.setOnClickListener(this);
	View results_button = this.findViewById(R.id.results);
	results_button.setOnClickListener(this);
	
	
	ah_count = (TextView) this.findViewById(R.id.AhCount);
	ah_count.setText(""+"0");
	um_count = (TextView) this.findViewById(R.id.UmCount);
	um_count.setText(""+"0");
	so_count = (TextView) this.findViewById(R.id.SoCount);
	so_count.setText(""+"0");
	wotd_count = (TextView) this.findViewById(R.id.WOTDCount);
	wotd_count.setText(""+"0");
	
	
	
}

//@Override
public void onClick(android.view.View v) {
	// TODO Auto-generated method stub
	String text;
	int num;
	switch (v.getId()) {
	case R.id.AhhCounter:
		text = ah_count.getText().toString();
		num = Integer.parseInt(text);
		num = num+1;
		ah_count.setText(""+String.valueOf(num));
		break;
	case R.id.UmCounter:
		text = um_count.getText().toString();
		num = Integer.parseInt(text);
		num = num+1;
		um_count.setText(""+String.valueOf(num));
		break;
	case R.id.WOTDCounter:
		text = wotd_count.getText().toString();
		num = Integer.parseInt(text);
		num = num+1;
		wotd_count.setText(""+String.valueOf(num));
		break;
	case R.id.BridgeWordCounter:
		text = so_count.getText().toString();
		num = Integer.parseInt(text);
		num = num+1;
		so_count.setText(""+String.valueOf(num));
		break;
	case R.id.results:
		String so_text = so_count.getText().toString();
		String wotd_text = wotd_count.getText().toString();
		String um_text = um_count.getText().toString();
		String ah_text = ah_count.getText().toString();
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Results!");
		builder.setMessage("You finished with "+ ah_text +" \"ah(s)\", " + um_text + " \"um(s)\", " + so_text + " \"so(s)\" and used the word of the day "+ wotd_text + " time(s)! \n\nWould you like to exit the Counter?")
		       .setCancelable(false)
		       .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
		           public void onClick(DialogInterface dialog, int id) {
		                currentAct.finish();
		           }
		       })
		       .setNegativeButton("No", new DialogInterface.OnClickListener() {
		           public void onClick(DialogInterface dialog, int id) {
		                dialog.cancel();
		           }
		       });
		AlertDialog alert = builder.create();
		alert.show();
		break;
	
}}
}
