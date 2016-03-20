package com.infynity.smu.toastmasterstk;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;

public class WOTDActivity extends Activity implements OnClickListener {
@Override

public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.wotd);
	View b1 = this.findViewById(R.id.wotd_button1);
	b1.setOnClickListener(this);
	View b2 = this.findViewById(R.id.wotd_button2);
	b2.setOnClickListener(this);
	View b3 = this.findViewById(R.id.wotd_button3);
	b3.setOnClickListener(this);
	View b4 = this.findViewById(R.id.wotd_button4);
	b4.setOnClickListener(this);
	View b5 = this.findViewById(R.id.wotd_button5);
	b5.setOnClickListener(this);
	
}
/*
public void onClick(android.view.View v) {
	// TODO Auto-generated method stub
	Uri uri;
	Intent intent;
	switch (v.getId()) {
	case R.id.wotd_button1:
		Intent e = new Intent(this, WebViewer.class);
			startActivity(e);

		break;
	case R.id.wotd_button2:
		 uri = Uri.parse("http://m.dictionary.com/wordofthedayhome");
		 intent = new Intent(Intent.ACTION_VIEW, uri);
		 startActivity(intent);
		break;
	case R.id.wotd_button3:
		 uri = Uri.parse("http://www.merriam-webster.com/word-of-the-day/");
		 intent = new Intent(Intent.ACTION_VIEW, uri);
		 startActivity(intent);
		break;
	case R.id.wotd_button4:
		 uri = Uri.parse("http://www.quotationspage.com/wotd.html");
		 intent = new Intent(Intent.ACTION_VIEW, uri);
		 startActivity(intent);
		break;
	case R.id.wotd_button5:
		 uri = Uri.parse("http://www.urbandictionary.com");
		 intent = new Intent(Intent.ACTION_VIEW, uri);
		 startActivity(intent);
		break;
	case R.id.button_exit:
		finish();
	}
}
*/
public void onClick(android.view.View v) {
	// TODO Auto-generated method stub
	Uri uri;
	Intent intent;
	WebView myView = (WebView) findViewById(R.id.webView1);
	switch (v.getId()) {
	case R.id.wotd_button1:
		myView.loadUrl("http://www.vocabula.com/feature/definitions.aspx");
		break;
	case R.id.wotd_button2:
		myView.loadUrl("http://m.dictionary.com/wordofthedayhome");
		break;
	case R.id.wotd_button3:
		myView.loadUrl("http://www.merriam-webster.com/word-of-the-day/");
		break;
	case R.id.wotd_button4:
		myView.loadUrl("http://www.quotationspage.com/wotd.html");
		break;
	case R.id.wotd_button5:
		myView.loadUrl("http://www.urbandictionary.com");
		break;
	
}
}
}