package com.example.mydesigncube;


import com.example.textviewex.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class DesignSampleActivity extends Activity{

	private Button Sample1;
	private Button Sample2;
	private Button Sample3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.designsample_activity);
	
		Sample1 = (Button)findViewById(R.id.sample1_btn);
		Sample1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(),"Sample1",Toast.LENGTH_SHORT).show();
            }
		});
		
		Sample2 = (Button)findViewById(R.id.sample2_btn);
		Sample2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(),"Sample2",Toast.LENGTH_SHORT).show();
          	}
		});
		
		Sample3 = (Button)findViewById(R.id.sample3_btn);
		Sample3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(),"Sample3",Toast.LENGTH_SHORT).show();
         	}
		});
		
	}
	
}
