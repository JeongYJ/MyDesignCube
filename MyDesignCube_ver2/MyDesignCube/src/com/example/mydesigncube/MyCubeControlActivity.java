package com.example.mydesigncube;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.mycubecontrol.Layer1Fragment;
import com.example.mycubecontrol.Layer2Fragment;
import com.example.mycubecontrol.Layer3Fragment;
import com.example.mycubecontrol.Layer4Fragment;
import com.example.textviewex.R;


public class MyCubeControlActivity extends FragmentActivity implements
		OnClickListener {

	private int numPages = 4; // page 수

	public final static int FRAGMENT_LAYER1 = 0; // ViewPager에서 Fragment의 위치
	public final static int FRAGMENT_LAYER2 = 1;
	public final static int FRAGMENT_LAYER3 = 2;
	public final static int FRAGMENT_LAYER4 = 3;

	public final static int LED_1 = 0;	// LED 위치
	public final static int LED_2 = 1;
	public final static int LED_3 = 2;
	public final static int LED_4 = 3;
	public final static int LED_5 = 4;
	public final static int LED_6 = 5;
	public final static int LED_7 = 6;
	public final static int LED_8 = 7;
	public final static int LED_9 = 8;
	public final static int LED_10 = 9;
	public final static int LED_11 = 10;
	public final static int LED_12 = 11;
	public final static int LED_13 = 12;
	public final static int LED_14 = 13;
	public final static int LED_15 = 14;
	public final static int LED_16 = 15;

	public final static String SERVER_IP_ADDRESS = "54.64.163.110"; // 서버주소
	public final static int SERVER_PORT = 10022; // 포트번호

	private Socket socket = null; // 소켓
	static BufferedReader bufReader; 
	static BufferedWriter bufWriter;
	private String recvData = null;

	ViewPager viewPager;	// viewpager
	Button[] tabButton = new Button[4]; // tab으로 사용할 버튼배열
	Button resetButton;	// Led All Reset 버튼
	Layer1Fragment layer1 = new Layer1Fragment(); // 첫 번쨰 프레그먼트
	Layer2Fragment layer2 = new Layer2Fragment(); // 두 번쨰 프레그먼트
	Layer3Fragment layer3 = new Layer3Fragment(); // 세 번쨰 프레그먼트
	Layer4Fragment layer4 = new Layer4Fragment(); // 네 번쨰 프레그먼트

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mycubecontrol_activity);

		viewPager = (ViewPager) findViewById(R.id.ViewPager); // xml에서 viewpager 가져옴
		viewPager.setAdapter(new pagerAdapter(getSupportFragmentManager())); // pagerAdapter설정
		viewPager.setOffscreenPageLimit(4); // 최대 저장한 페이지수
		viewPager.setCurrentItem(FRAGMENT_LAYER1); // 시작 페이지
		viewPager.setOnPageChangeListener(new OnPageChangeListener() { // 페이지 변화시 텝 이미지 수정
			@Override
			public void onPageSelected(int pos) {
				tabButton[FRAGMENT_LAYER1].setSelected(false);
				tabButton[FRAGMENT_LAYER2].setSelected(false);
				tabButton[FRAGMENT_LAYER3].setSelected(false);
				tabButton[FRAGMENT_LAYER4].setSelected(false);
				switch (pos) {
				case FRAGMENT_LAYER1:
					tabButton[FRAGMENT_LAYER1].setSelected(true);
					break;
				case FRAGMENT_LAYER2:
					tabButton[FRAGMENT_LAYER2].setSelected(true);
					break;
				case FRAGMENT_LAYER3:
					tabButton[FRAGMENT_LAYER3].setSelected(true);
					break;
				case FRAGMENT_LAYER4:
					tabButton[FRAGMENT_LAYER4].setSelected(true);
					break;
				}
			}
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {}
			@Override
			public void onPageScrollStateChanged(int arg0) {}
		});
		
		tabButton[FRAGMENT_LAYER1] = (Button) findViewById(R.id.Layer1); // xml에서 Layer1버튼 가져옴
		tabButton[FRAGMENT_LAYER1].setOnClickListener(this); // 클릭이벤트 추가
		tabButton[FRAGMENT_LAYER1].setSelected(true); // layer1을 선택된 페이지로 설정
		tabButton[FRAGMENT_LAYER2] = (Button) findViewById(R.id.Layer2); // xml에서 Layer2버튼 가져옴
		tabButton[FRAGMENT_LAYER2].setOnClickListener(this); // 클릭이벤트 추가
		tabButton[FRAGMENT_LAYER3] = (Button) findViewById(R.id.Layer3); // xml에서 Layer3버튼 가져옴
		tabButton[FRAGMENT_LAYER3].setOnClickListener(this); // 클릭이벤트 추가
		tabButton[FRAGMENT_LAYER4] = (Button) findViewById(R.id.Layer4); // xml에서 Layer4버튼 가져옴
		tabButton[FRAGMENT_LAYER4].setOnClickListener(this); // 클릭이벤트 추가

		resetButton = (Button) findViewById(R.id.ResetButton); // xml에서 reset버튼 가져옴
		resetButton.setOnClickListener(this); // 클릭 이벤트 추가

		serverConnect(); // 서버연결
	}

	public void serverConnect() {
		try {
			if (android.os.Build.VERSION.SDK_INT > 9) { //SDK 버전을 높을 시 쓰레드 정책 바꿈

				StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
						.permitAll().build();
				StrictMode.setThreadPolicy(policy);
			}
			serverClose(); // 서버 연결 끊음
			socket = new Socket(SERVER_IP_ADDRESS, SERVER_PORT); // 소켓 생성
			bufWriter = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream())); // 쓰기버퍼 생성
			bufReader = new BufferedReader(new InputStreamReader(
					socket.getInputStream())); // 읽기버퍼 생성
			Log.d("connect", socket.toString());
			checkRecv.start();	//
		} catch (Exception e) {

		}
	}

	public void serverClose() {
		try {
			if (socket != null) {
				checkRecv.stop();
				socket.close();
				socket = null;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		serverClose();
		super.onPause();
	}

	public static void serverSend(String loc) {
		try {
			Log.d("send", loc);
			PrintWriter out = new PrintWriter(bufWriter, true);
			out.println(loc);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	Handler receiver = new Handler() {
		public void handleMessage(Message msg) {
			// mTextMessage.setText(mRecvData);
			Log.d("recv", recvData);
		}
	};

	// 서버에서 메시지를 수신하는 쓰레드
	private Thread checkRecv = new Thread() {
		public void run() {
			try {
				while (true) {
					// 입력 스트림에서 메시지를 읽는다
					recvData = bufReader.readLine();
					// 이벤트 핸들러에 이벤트를 전달
					receiver.sendEmptyMessage(0);
				}
			} catch (Exception e) {
				Log.d("tag", "Receive error");
			}
		}
	};

	class pagerAdapter extends FragmentPagerAdapter {
		
		public pagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int pos) {
			switch (pos) {
			case FRAGMENT_LAYER1:
				return layer1;
			case FRAGMENT_LAYER2:
				return layer2;
			case FRAGMENT_LAYER3:
				return layer3;
			case FRAGMENT_LAYER4:
				return layer4;
			}
			return null;
		}

		@Override
		public int getCount() {
			return numPages;
		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.Layer1:
			viewPager.setCurrentItem(FRAGMENT_LAYER1);
			break;
		case R.id.Layer2:
			viewPager.setCurrentItem(FRAGMENT_LAYER2);
			break;
		case R.id.Layer3:
			viewPager.setCurrentItem(FRAGMENT_LAYER3);
			break;
		case R.id.Layer4:
			viewPager.setCurrentItem(FRAGMENT_LAYER4);
			break;
		case R.id.ResetButton:
			ledAllReset();
			break;
		}
	}

	public void ledAllReset(){
		layer1.allReset();
		layer2.allReset();
		layer3.allReset();
		layer4.allReset();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		ledAllReset();
		super.onDestroy();
	}
}
