package com.infynity.smu.toastmasterstk;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;

public class HumoristActivity extends Activity implements OnClickListener {
@Override

public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.humorist);
	View b1 = this.findViewById(R.id.humor_button1);
	b1.setOnClickListener(this);
	View b2 = this.findViewById(R.id.humor_button2);
	b2.setOnClickListener(this);
	View b3 = this.findViewById(R.id.humor_button3);
	b3.setOnClickListener(this);
	View b4 = this.findViewById(R.id.humor_button4);
	b4.setOnClickListener(this);
	View b5 = this.findViewById(R.id.humor_button5);
	b5.setOnClickListener(this);
	
}

public void onClick(android.view.View v) {
	// TODO Auto-generated method stub

	WebView myView = (WebView) findViewById(R.id.webView2);
	switch (v.getId()) {
	case R.id.humor_button1:
		myView.loadUrl("http://www.jokes-best.com/random-jokes.php");
		break;
	case R.id.humor_button2:
		myView.loadUrl("http://www.ajokeaday.com/ChisteAlAzar.asp?");
		break;
	case R.id.humor_button3:
		myView.loadUrl("http://www.randomfunnyquotes.com/random");
		break;
	case R.id.humor_button4:
		myView.loadUrl("http://www.punoftheday.com/cgi-bin/randompun.pl");
		break;
	case R.id.humor_button5:
		myView.loadUrl("http://www.quotationspage.com/random.php3");
		break;
	
}
}
}