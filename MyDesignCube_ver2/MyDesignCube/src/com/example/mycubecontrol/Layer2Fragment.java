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

public class Layer2Fragment extends Fragment implements OnClickListener{
	
	Button layer2LedButton[] = new Button[16];
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
		LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.fragment_layer2, container, false);
		
		for(int i = 0; i < layer2LedButton.length; i++){
			layer2LedButton[i + MyCubeControlActivity.LED_1] = (Button)layout.findViewById(R.id.Layer2_01 + i);
			layer2LedButton[i + MyCubeControlActivity.LED_1].setOnClickListener(this);
		}
		
		return layout;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.Layer2_01:
			if(isLedOn[0]){
				MyCubeControlActivity.serverSend("2010");
				Log.d("led", "off");
				isLedOn[0] = false;
				layer2LedButton[0].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("2011");
				Log.d("led", "on");
				isLedOn[0] = true;
				layer2LedButton[0].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer2_02: 
			if(isLedOn[1]){
				MyCubeControlActivity.serverSend("2020");
				Log.d("led", "off");
				isLedOn[1] = false;
				layer2LedButton[1].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("2021");
				Log.d("led", "on");
				isLedOn[1] = true;
				layer2LedButton[1].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer2_03: 
			if(isLedOn[2]){
				MyCubeControlActivity.serverSend("2030");
				Log.d("led", "off");
				isLedOn[2] = false;
				layer2LedButton[2].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("2031");
				Log.d("led", "on");
				isLedOn[2] = true;
				layer2LedButton[2].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer2_04:
			if(isLedOn[3]){
				MyCubeControlActivity.serverSend("2040");
				Log.d("led", "off");
				isLedOn[3] = false;
				layer2LedButton[3].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("2041");
				Log.d("led", "on");
				isLedOn[3] = true;
				layer2LedButton[3].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer2_05:
			if(isLedOn[4]){
				MyCubeControlActivity.serverSend("2050");
				Log.d("led", "off");
				isLedOn[4] = false;
				layer2LedButton[4].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("2051");
				Log.d("led", "on");
				isLedOn[4] = true;
				layer2LedButton[4].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer2_06:
			if(isLedOn[5]){
				MyCubeControlActivity.serverSend("2060");
				Log.d("led", "off");
				isLedOn[5] = false;
				layer2LedButton[5].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("2061");
				Log.d("led", "on");
				isLedOn[5] = true;
				layer2LedButton[5].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer2_07:
			if(isLedOn[6]){
				MyCubeControlActivity.serverSend("2070");
				Log.d("led", "off");
				isLedOn[6] = false;
				layer2LedButton[6].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("2071");
				Log.d("led", "on");
				isLedOn[6] = true;
				layer2LedButton[6].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer2_08:
			if(isLedOn[7]){
				MyCubeControlActivity.serverSend("2080");
				Log.d("led", "off");
				isLedOn[7] = false;
				layer2LedButton[7].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("2081");
				Log.d("led", "on");
				isLedOn[7] = true;
				layer2LedButton[7].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer2_09:
			if(isLedOn[8]){
				MyCubeControlActivity.serverSend("2090");
				Log.d("led", "off");
				isLedOn[8] = false;
				layer2LedButton[8].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("2091");
				Log.d("led", "on");
				isLedOn[8] = true;
				layer2LedButton[8].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer2_10:
			if(isLedOn[9]){
				MyCubeControlActivity.serverSend("2000");
				Log.d("led", "off");
				isLedOn[9] = false;
				layer2LedButton[9].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("2001");
				Log.d("led", "on");
				isLedOn[9] = true;
				layer2LedButton[9].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer2_11:
			if(isLedOn[10]){
				MyCubeControlActivity.serverSend("2010");
				Log.d("led", "off");
				isLedOn[10] = false;
				layer2LedButton[10].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("2011");
				Log.d("led", "on");
				isLedOn[10] = true;
				layer2LedButton[10].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer2_12:
			if(isLedOn[11]){
				MyCubeControlActivity.serverSend("2020");
				Log.d("led", "off");
				isLedOn[11] = false;
				layer2LedButton[11].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("2021");
				Log.d("led", "on");
				isLedOn[11] = true;
				layer2LedButton[11].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer2_13:
			if(isLedOn[12]){
				MyCubeControlActivity.serverSend("2030");
				Log.d("led", "off");
				isLedOn[12] = false;
				layer2LedButton[12].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("2031");
				Log.d("led", "on");
				isLedOn[12] = true;
				layer2LedButton[12].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer2_14:
			if(isLedOn[13]){
				MyCubeControlActivity.serverSend("2040");
				Log.d("led", "off");
				isLedOn[13] = false;
				layer2LedButton[13].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("2041");
				Log.d("led", "on");
				isLedOn[13] = true;
				layer2LedButton[13].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer2_15:
			if(isLedOn[14]){
				MyCubeControlActivity.serverSend("2050");
				Log.d("led", "off");
				isLedOn[14] = false;
				layer2LedButton[14].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("2051");
				Log.d("led", "on");
				isLedOn[14] = true;
				layer2LedButton[14].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer2_16:
			if(isLedOn[15]){
				MyCubeControlActivity.serverSend("2060");
				Log.d("led", "off");
				isLedOn[15] = false;
				layer2LedButton[15].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("2061");
				Log.d("led", "on");
				isLedOn[15] = true;
				layer2LedButton[15].setBackgroundResource(R.drawable.led_on);
			}
			break;
		} 
	}
	
	public void allReset(){
		for(int i=0; i < isLedOn.length; i++){
			isLedOn[i] = false;
			layer2LedButton[i].setBackgroundResource(R.drawable.led_off);
		}
	}
}
