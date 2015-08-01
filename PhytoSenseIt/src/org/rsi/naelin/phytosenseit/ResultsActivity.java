package org.rsi.naelin.phytosenseit;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultsActivity extends Activity {
	private TextView mHeaderText;
	private ImageView mResultsImage;
	private Button mReadMore;
	private String mUriLink;

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_results);

		String passedArg = getIntent().getExtras().getString("results header");
		mHeaderText = (TextView) findViewById(R.id.header_text);
		mHeaderText.setText(passedArg);

		mResultsImage = (ImageView) findViewById(R.id.results_image);

		if (passedArg.equals("black scurf")) {
			mResultsImage.setImageDrawable(getResources().getDrawable(
					R.drawable.potato_blackscurf_1));
			mUriLink = "http://potatoes.ahdb.org.uk/media-gallery/detail/13214/2636";
		}
		else if (passedArg.equals("common scab")) {
			mResultsImage.setImageDrawable(getResources().getDrawable(
					R.drawable.potato_commonscab_1));
			mUriLink = "http://potatoes.ahdb.org.uk/media-gallery/detail/13214/2638";
		}
		else if (passedArg.equals("silver scurf")) {
			mResultsImage.setImageDrawable(getResources().getDrawable(
					R.drawable.potato_silverscurf_1));
			mUriLink = "http://potatoes.ahdb.org.uk/media-gallery/detail/13214/2657";
		}
		
		mReadMore = (Button) findViewById(R.id.read_more);
		mReadMore.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Uri uri = Uri.parse(mUriLink); // missing 'http://' will cause crashed
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
			}
		});

	}

}