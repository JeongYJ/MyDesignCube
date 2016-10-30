package com.example.mycubecontrol;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.mydesigncube.MyCubeControlActivity;
import com.example.textviewex.R;

public class Layer3Fragment extends Fragment implements OnClickListener{

	Button layer3LedButton[] = new Button[16];
	boolean isLedOn[] = new boolean[16];
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.fragment_layer3, container, false);
		
		for(int i = 0; i < layer3LedButton.length; i++){
			layer3LedButton[i + MyCubeControlActivity.LED_1] = (Button)layout.findViewById(R.id.Layer3_01 + i);
			layer3LedButton[i + MyCubeControlActivity.LED_1].setOnClickListener(this);
		}
		return layout;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.Layer3_01:
			if(isLedOn[0]){
				MyCubeControlActivity.serverSend("3010");
				Log.d("led", "off");
				isLedOn[0] = false;
				layer3LedButton[0].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("3011");
				Log.d("led", "on");
				isLedOn[0] = true;
				layer3LedButton[0].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer3_02:
			if(isLedOn[1]){
				MyCubeControlActivity.serverSend("3020");
				Log.d("led", "off");
				isLedOn[1] = false;
				layer3LedButton[1].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("3021");
				Log.d("led", "on");
				isLedOn[1] = true;
				layer3LedButton[1].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer3_03: 
			if(isLedOn[2]){
				MyCubeControlActivity.serverSend("3030");
				Log.d("led", "off");
				isLedOn[2] = false;
				layer3LedButton[2].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("3031");
				Log.d("led", "on");
				isLedOn[2] = true;
				layer3LedButton[2].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer3_04:
			if(isLedOn[3]){
				MyCubeControlActivity.serverSend("3040");
				Log.d("led", "off");
				isLedOn[3] = false;
				layer3LedButton[3].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("3041");
				Log.d("led", "on");
				isLedOn[3] = true;
				layer3LedButton[3].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer3_05:
			if(isLedOn[4]){
				MyCubeControlActivity.serverSend("3050");
				Log.d("led", "off");
				isLedOn[4] = false;
				layer3LedButton[4].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("3051");
				Log.d("led", "on");
				isLedOn[4] = true;
				layer3LedButton[4].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer3_06:
			if(isLedOn[5]){
				MyCubeControlActivity.serverSend("3060");
				Log.d("led", "off");
				isLedOn[5] = false;
				layer3LedButton[5].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("3061");
				Log.d("led", "on");
				isLedOn[5] = true;
				layer3LedButton[5].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer3_07:
			if(isLedOn[6]){
				MyCubeControlActivity.serverSend("3070");
				Log.d("led", "off");
				isLedOn[6] = false;
				layer3LedButton[6].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("3071");
				Log.d("led", "on");
				isLedOn[6] = true;
				layer3LedButton[6].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer3_08:
			if(isLedOn[7]){
				MyCubeControlActivity.serverSend("3080");
				Log.d("led", "off");
				isLedOn[7] = false;
				layer3LedButton[7].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("3081");
				Log.d("led", "on");
				isLedOn[7] = true;
				layer3LedButton[7].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer3_09:
			if(isLedOn[8]){
				MyCubeControlActivity.serverSend("3090");
				Log.d("led", "off");
				isLedOn[8] = false;
				layer3LedButton[8].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("3091");
				Log.d("led", "on");
				isLedOn[8] = true;
				layer3LedButton[8].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer3_10:
			if(isLedOn[9]){
				MyCubeControlActivity.serverSend("3100");
				Log.d("led", "off");
				isLedOn[9] = false;
				layer3LedButton[9].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("3101");
				Log.d("led", "on");
				isLedOn[9] = true;
				layer3LedButton[9].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer3_11:
			if(isLedOn[10]){
				MyCubeControlActivity.serverSend("3110");
				Log.d("led", "off");
				isLedOn[10] = false;
				layer3LedButton[10].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("3111");
				Log.d("led", "on");
				isLedOn[10] = true;
				layer3LedButton[10].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer3_12:
			if(isLedOn[11]){
				MyCubeControlActivity.serverSend("3120");
				Log.d("led", "off");
				isLedOn[11] = false;
				layer3LedButton[11].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("3121");
				Log.d("led", "on");
				isLedOn[11] = true;
				layer3LedButton[11].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer3_13:
			if(isLedOn[12]){
				MyCubeControlActivity.serverSend("3130");
				Log.d("led", "off");
				isLedOn[12] = false;
				layer3LedButton[12].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("3131");
				Log.d("led", "on");
				isLedOn[12] = true;
				layer3LedButton[12].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer3_14:
			if(isLedOn[13]){
				MyCubeControlActivity.serverSend("3140");
				Log.d("led", "off");
				isLedOn[13] = false;
				layer3LedButton[13].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("3141");
				Log.d("led", "on");
				isLedOn[13] = true;
				layer3LedButton[13].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer3_15:
			if(isLedOn[14]){
				MyCubeControlActivity.serverSend("3150");
				Log.d("led", "off");
				isLedOn[14] = false;
				layer3LedButton[14].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("3151");
				Log.d("led", "on");
				isLedOn[14] = true;
				layer3LedButton[14].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer3_16:
			if(isLedOn[15]){
				MyCubeControlActivity.serverSend("3160");
				Log.d("led", "off");
				isLedOn[15] = false;
				layer3LedButton[15].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("3161");
				Log.d("led", "on");
				isLedOn[15] = true;
				layer3LedButton[15].setBackgroundResource(R.drawable.led_on);
			}
			break;
		} 
	}
	
	public void allReset(){
		for(int i=0; i < isLedOn.length; i++){
			isLedOn[i] = false;
			layer3LedButton[i].setBackgroundResource(R.drawable.led_off);
		}
	}
}

