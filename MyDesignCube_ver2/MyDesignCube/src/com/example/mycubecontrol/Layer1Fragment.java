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

public class Layer1Fragment extends Fragment implements OnClickListener{
	
	Button layer1LedButton[] = new Button[16];
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
		LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.fragment_layer1, container, false);

		for(int i = 0; i < layer1LedButton.length; i++){
			layer1LedButton[i + MyCubeControlActivity.LED_1] = (Button)layout.findViewById(R.id.Layer1_01 + i);
			layer1LedButton[i + MyCubeControlActivity.LED_1].setOnClickListener(this);
		}
		
		return layout;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.Layer1_01:
			if(isLedOn[0]){
				MyCubeControlActivity.serverSend("1010");
				Log.d("led", "off");
				isLedOn[0] = false;
				layer1LedButton[0].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("1011");
				Log.d("led", "on");
				isLedOn[0] = true;
				layer1LedButton[0].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer1_02: 
			if(isLedOn[1]){
				MyCubeControlActivity.serverSend("1020");
				Log.d("led", "off");
				isLedOn[1] = false;
				layer1LedButton[1].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("1021");
				Log.d("led", "on");
				isLedOn[1] = true;
				layer1LedButton[1].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer1_03: 
			if(isLedOn[2]){
				MyCubeControlActivity.serverSend("1030");
				Log.d("led", "off");
				isLedOn[2] = false;
				layer1LedButton[2].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("1031");
				Log.d("led", "on");
				isLedOn[2] = true;
				layer1LedButton[2].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer1_04:
			if(isLedOn[3]){
				MyCubeControlActivity.serverSend("1040");
				Log.d("led", "off");
				isLedOn[3] = false;
				layer1LedButton[3].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("1041");
				Log.d("led", "on");
				isLedOn[3] = true;
				layer1LedButton[3].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer1_05:
			if(isLedOn[4]){
				MyCubeControlActivity.serverSend("1050");
				Log.d("led", "off");
				isLedOn[4] = false;
				layer1LedButton[4].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("1051");
				Log.d("led", "on");
				isLedOn[4] = true;
				layer1LedButton[4].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer1_06:
			if(isLedOn[5]){
				MyCubeControlActivity.serverSend("1060");
				Log.d("led", "off");
				isLedOn[5] = false;
				layer1LedButton[5].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("1061");
				Log.d("led", "on");
				isLedOn[5] = true;
				layer1LedButton[5].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer1_07:
			if(isLedOn[6]){
				MyCubeControlActivity.serverSend("1070");
				Log.d("led", "off");
				isLedOn[6] = false;
				layer1LedButton[6].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("1071");
				Log.d("led", "on");
				isLedOn[6] = true;
				layer1LedButton[6].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer1_08:
			if(isLedOn[7]){
				MyCubeControlActivity.serverSend("1080");
				Log.d("led", "off");
				isLedOn[7] = false;
				layer1LedButton[7].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("1081");
				Log.d("led", "on");
				isLedOn[7] = true;
				layer1LedButton[7].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer1_09:
			if(isLedOn[8]){
				MyCubeControlActivity.serverSend("1090");
				Log.d("led", "off");
				isLedOn[8] = false;
				layer1LedButton[8].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("1091");
				Log.d("led", "on");
				isLedOn[8] = true;
				layer1LedButton[8].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer1_10:
			if(isLedOn[9]){
				MyCubeControlActivity.serverSend("1100");
				Log.d("led", "off");
				isLedOn[9] = false;
				layer1LedButton[9].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("1101");
				Log.d("led", "on");
				isLedOn[9] = true;
				layer1LedButton[9].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer1_11:
			if(isLedOn[10]){
				MyCubeControlActivity.serverSend("1110");
				Log.d("led", "off");
				isLedOn[10] = false;
				layer1LedButton[10].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("1111");
				Log.d("led", "on");
				isLedOn[10] = true;
				layer1LedButton[10].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer1_12:
			if(isLedOn[11]){
				MyCubeControlActivity.serverSend("1120");
				Log.d("led", "off");
				isLedOn[11] = false;
				layer1LedButton[11].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("1121");
				Log.d("led", "on");
				isLedOn[11] = true;
				layer1LedButton[11].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer1_13:
			if(isLedOn[12]){
				MyCubeControlActivity.serverSend("1130");
				Log.d("led", "off");
				isLedOn[12] = false;
				layer1LedButton[12].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("1131");
				Log.d("led", "on");
				isLedOn[12] = true;
				layer1LedButton[12].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer1_14:
			if(isLedOn[13]){
				MyCubeControlActivity.serverSend("1140");
				Log.d("led", "off");
				isLedOn[13] = false;
				layer1LedButton[13].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("1141");
				Log.d("led", "on");
				isLedOn[13] = true;
				layer1LedButton[13].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer1_15:
			if(isLedOn[14]){
				MyCubeControlActivity.serverSend("1150");
				Log.d("led", "off");
				isLedOn[14] = false;
				layer1LedButton[14].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("1151");
				Log.d("led", "on");
				isLedOn[14] = true;
				layer1LedButton[14].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer1_16:
			if(isLedOn[15]){
				MyCubeControlActivity.serverSend("1160");
				Log.d("led", "off");
				isLedOn[15] = false;
				layer1LedButton[15].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("1161");
				Log.d("led", "on");
				isLedOn[15] = true;
				layer1LedButton[15].setBackgroundResource(R.drawable.led_on);
			}
			break;
		}
	}
	
	public void allReset(){
		for(int i=0; i < isLedOn.length; i++){
			isLedOn[i] = false;
			layer1LedButton[i].setBackgroundResource(R.drawable.led_off);
		}
	}
}

