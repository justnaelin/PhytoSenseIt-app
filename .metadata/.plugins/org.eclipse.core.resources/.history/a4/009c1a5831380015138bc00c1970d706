package org.rsi.naelin.phytosenseit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NoResultsActivity extends Activity {
	private Button mReturnHomeButton;
	
	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_results);
		
		mReturnHomeButton = (Button) findViewById(R.id.return_home);
		mReturnHomeButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(NoResultsActivity.this, HomeActivity.class));
			}
		});
	}

}
