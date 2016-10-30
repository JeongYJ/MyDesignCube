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

public class Layer4Fragment extends Fragment implements OnClickListener{
	
	Button layer4LedButton[] = new Button[16];
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
		LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.fragment_layer4, container, false);
		
		for(int i = 0; i < layer4LedButton.length; i++){
			layer4LedButton[i + MyCubeControlActivity.LED_1] = (Button)layout.findViewById(R.id.Layer4_01 + i);
			layer4LedButton[i + MyCubeControlActivity.LED_1].setOnClickListener(this);
		}
		
		return layout;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.Layer4_01:
			if(isLedOn[0]){
				MyCubeControlActivity.serverSend("4010");
				Log.d("led", "off");
				isLedOn[0] = false;
				layer4LedButton[0].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("4011");
				Log.d("led", "on");
				isLedOn[0] = true;
				layer4LedButton[0].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer4_02:
			if(isLedOn[1]){
				MyCubeControlActivity.serverSend("4020");
				Log.d("led", "off");
				isLedOn[1] = false;
				layer4LedButton[1].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("4021");
				Log.d("led", "on");
				isLedOn[1] = true;
				layer4LedButton[1].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer4_03: 
			if(isLedOn[2]){
				MyCubeControlActivity.serverSend("4030");
				Log.d("led", "off");
				isLedOn[2] = false;
				layer4LedButton[2].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("4031");
				Log.d("led", "on");
				isLedOn[2] = true;
				layer4LedButton[2].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer4_04:
			if(isLedOn[3]){
				MyCubeControlActivity.serverSend("4040");
				Log.d("led", "off");
				isLedOn[3] = false;
				layer4LedButton[3].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("4041");
				Log.d("led", "on");
				isLedOn[3] = true;
				layer4LedButton[3].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer4_05:
			if(isLedOn[4]){
				MyCubeControlActivity.serverSend("4050");
				Log.d("led", "off");
				isLedOn[4] = false;
				layer4LedButton[4].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("4051");
				Log.d("led", "on");
				isLedOn[4] = true;
				layer4LedButton[4].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer4_06:
			if(isLedOn[5]){
				MyCubeControlActivity.serverSend("4060");
				Log.d("led", "off");
				isLedOn[5] = false;
				layer4LedButton[5].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("4061");
				Log.d("led", "on");
				isLedOn[5] = true;
				layer4LedButton[5].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer4_07:
			if(isLedOn[6]){
				MyCubeControlActivity.serverSend("4070");
				Log.d("led", "off");
				isLedOn[6] = false;
				layer4LedButton[6].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("4071");
				Log.d("led", "on");
				isLedOn[6] = true;
				layer4LedButton[6].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer4_08:
			if(isLedOn[7]){
				MyCubeControlActivity.serverSend("4080");
				Log.d("led", "off");
				isLedOn[7] = false;
				layer4LedButton[7].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("4081");
				Log.d("led", "on");
				isLedOn[7] = true;
				layer4LedButton[7].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer4_09:
			if(isLedOn[8]){
				MyCubeControlActivity.serverSend("4090");
				Log.d("led", "off");
				isLedOn[8] = false;
				layer4LedButton[8].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("4091");
				Log.d("led", "on");
				isLedOn[8] = true;
				layer4LedButton[8].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer4_10:
			if(isLedOn[9]){
				MyCubeControlActivity.serverSend("4100");
				Log.d("led", "off");
				isLedOn[9] = false;
				layer4LedButton[9].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("4101");
				Log.d("led", "on");
				isLedOn[9] = true;
				layer4LedButton[9].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer4_11:
			if(isLedOn[10]){
				MyCubeControlActivity.serverSend("4110");
				Log.d("led", "off");
				isLedOn[10] = false;
				layer4LedButton[10].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("4111");
				Log.d("led", "on");
				isLedOn[10] = true;
				layer4LedButton[10].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer4_12:
			if(isLedOn[11]){
				MyCubeControlActivity.serverSend("4120");
				Log.d("led", "off");
				isLedOn[11] = false;
				layer4LedButton[11].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("4121");
				Log.d("led", "on");
				isLedOn[11] = true;
				layer4LedButton[11].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer4_13:
			if(isLedOn[12]){
				MyCubeControlActivity.serverSend("4130");
				Log.d("led", "off");
				isLedOn[12] = false;
				layer4LedButton[12].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("4131");
				Log.d("led", "on");
				isLedOn[12] = true;
				layer4LedButton[12].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer4_14:
			if(isLedOn[13]){
				MyCubeControlActivity.serverSend("4140");
				Log.d("led", "off");
				isLedOn[13] = false;
				layer4LedButton[13].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("4141");
				Log.d("led", "on");
				isLedOn[13] = true;
				layer4LedButton[13].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer4_15:
			if(isLedOn[14]){
				MyCubeControlActivity.serverSend("4150");
				Log.d("led", "off");
				isLedOn[14] = false;
				layer4LedButton[14].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("4151");
				Log.d("led", "on");
				isLedOn[14] = true;
				layer4LedButton[14].setBackgroundResource(R.drawable.led_on);
			}
			break;
		case R.id.Layer4_16:
			if(isLedOn[15]){
				MyCubeControlActivity.serverSend("4160");
				Log.d("led", "off");
				isLedOn[15] = false;
				layer4LedButton[15].setBackgroundResource(R.drawable.led_off);
			}
			else{
				MyCubeControlActivity.serverSend("4161");
				Log.d("led", "on");
				isLedOn[15] = true;
				layer4LedButton[15].setBackgroundResource(R.drawable.led_on);
			}
			break;
		}
	}
	
	public void allReset(){
		for(int i=0; i < isLedOn.length; i++){
			isLedOn[i] = false;
			layer4LedButton[i].setBackgroundResource(R.drawable.led_off);
		}
	}
}
