package com.example.mydesigncube;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.example.event.BackPressButtonActivity;
import com.example.textviewex.R;


public class MainPageActivity extends Activity {
	
	private BackPressButtonActivity bp;
	private Button MyControlCube_btn;
	private Button DesignSample_btn;
	private Button About_btn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
        startActivity(new Intent(this,Splash.class));
		
		initialize(); //?��간이 걸리?�� ?��?�� 처리
		setContentView(R.layout.mainpage_activity);
 		 bp = new BackPressButtonActivity(this);	
		 MyControlCube_btn= (Button)findViewById(R.id.My_Cube_Control_btn);
		 DesignSample_btn=(Button)findViewById(R.id.Design_Sample_btn);
		 About_btn=(Button)findViewById(R.id.About_btn);
		 
		 MyControlCube_btn.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainPageActivity.this, MyCubeControlActivity.class);
			    startActivity(i);
			}
		});
		
		 DesignSample_btn.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
					Intent i = new Intent(MainPageActivity.this, DesignSampleActivity.class);
					startActivity(i);
				}
			});
		 	
		 About_btn.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
					Toast.makeText(getApplicationContext(),"Team. GelLight",Toast.LENGTH_SHORT).show();	               	
				}
			});
	}
	
	private void initialize()
	{
		InitializationRunnable init = new InitializationRunnable();
		new Thread(init).start();
	}
	
	class InitializationRunnable implements Runnable
	{
		public void run()
		{
			//do_someting
		}
	}
		
    @Override
    public void onBackPressed()
    {
		  bp.onBackPressed();	 
    }
	
}
