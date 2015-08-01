package org.rsi.naelin.phytosenseit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends Activity {
    private Button mLaunchCamera;
    
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        // Launch camera
        mLaunchCamera = (Button) findViewById(R.id.launch_camera);
        mLaunchCamera.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
            }    
        });

        
        
        
        
    }
    
}
