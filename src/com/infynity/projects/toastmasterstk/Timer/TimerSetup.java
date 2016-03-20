package com.infynity.smu.toastmasterstk.Timer;


import com.infynity.smu.toastmasterstk.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;


public class TimerSetup extends Activity implements OnClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.timersetup);
		View startButton = this.findViewById(R.id.startTimer);
		startButton.setOnClickListener(this);
		((EditText) this.findViewById(R.id.SpeechTime)).setText("5");
		((EditText) this.findViewById(R.id.NumParts)).setText("1");
		((EditText) this.findViewById(R.id.GreenTime)).setText("4");
		((EditText) this.findViewById(R.id.YellowTime)).setText("2");
		((EditText) this.findViewById(R.id.RedTime)).setText("1");
	};
	


	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.startTimer:
			
			Intent intent = new Intent(this, StandupTimer.class);
			generateExtras(intent);
			startActivity(intent);
			
		}
	}



	private void generateExtras(Intent intent) {
		// TODO Auto-generated method stub
		String speechtime = ((EditText) this.findViewById(R.id.SpeechTime)).getText()
				.toString();
		String numparts = ((EditText) this.findViewById(R.id.NumParts)).getText()
				.toString();
		String greentime = ((EditText) this.findViewById(R.id.GreenTime)).getText()
				.toString();
		String yellowtime = ((EditText) this.findViewById(R.id.YellowTime)).getText()
				.toString();
		String redtime = ((EditText) this.findViewById(R.id.RedTime)).getText()
				.toString();

		
		intent.putExtra("meetingLength", Integer.parseInt(speechtime));
		intent.putExtra("numParticipants", Integer.parseInt(numparts));
		intent.putExtra("greenWarningTime", Integer.parseInt(greentime)*60);
		intent.putExtra("yellowWarningTime", Integer.parseInt(yellowtime)*60);
		intent.putExtra("redWarningTime", Integer.parseInt(redtime)*60);

	}
}