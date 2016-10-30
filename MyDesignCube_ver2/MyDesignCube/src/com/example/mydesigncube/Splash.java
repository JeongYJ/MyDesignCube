package com.example.mydesigncube;

import com.example.textviewex.R;

import android.app.*;
import android.os.*;

public class Splash extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.splash);
         
	        initialize();
	}
	
	private void initialize()
	{
		Handler hd = new Handler()
		{
	      @Override
		  public void handleMessage(Message msg)
			{
				finish(); 
			}
		};
       hd.sendEmptyMessageDelayed(0, 3000); 	
	}

}