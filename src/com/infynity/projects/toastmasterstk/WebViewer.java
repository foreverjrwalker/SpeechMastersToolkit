package com.infynity.smu.toastmasterstk;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewer extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Bundle myBundle = this.getIntent().getExtras();
		String url = (String) myBundle.get("TargetSite");
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		WebView webview = new WebView(this);
		this.setContentView(webview);
		webview.loadUrl(url);

	}
}
