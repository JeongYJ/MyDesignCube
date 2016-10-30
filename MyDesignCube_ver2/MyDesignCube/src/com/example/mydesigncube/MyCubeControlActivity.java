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

	private int numPages = 4; // page ��

	public final static int FRAGMENT_LAYER1 = 0; // ViewPager���� Fragment�� ��ġ
	public final static int FRAGMENT_LAYER2 = 1;
	public final static int FRAGMENT_LAYER3 = 2;
	public final static int FRAGMENT_LAYER4 = 3;

	public final static int LED_1 = 0;	// LED ��ġ
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

	public final static String SERVER_IP_ADDRESS = "54.64.163.110"; // �����ּ�
	public final static int SERVER_PORT = 10022; // ��Ʈ��ȣ

	private Socket socket = null; // ����
	static BufferedReader bufReader; 
	static BufferedWriter bufWriter;
	private String recvData = null;

	ViewPager viewPager;	// viewpager
	Button[] tabButton = new Button[4]; // tab���� ����� ��ư�迭
	Button resetButton;	// Led All Reset ��ư
	Layer1Fragment layer1 = new Layer1Fragment(); // ù ���� �����׸�Ʈ
	Layer2Fragment layer2 = new Layer2Fragment(); // �� ���� �����׸�Ʈ
	Layer3Fragment layer3 = new Layer3Fragment(); // �� ���� �����׸�Ʈ
	Layer4Fragment layer4 = new Layer4Fragment(); // �� ���� �����׸�Ʈ

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mycubecontrol_activity);

		viewPager = (ViewPager) findViewById(R.id.ViewPager); // xml���� viewpager ������
		viewPager.setAdapter(new pagerAdapter(getSupportFragmentManager())); // pagerAdapter����
		viewPager.setOffscreenPageLimit(4); // �ִ� ������ ��������
		viewPager.setCurrentItem(FRAGMENT_LAYER1); // ���� ������
		viewPager.setOnPageChangeListener(new OnPageChangeListener() { // ������ ��ȭ�� �� �̹��� ����
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
		
		tabButton[FRAGMENT_LAYER1] = (Button) findViewById(R.id.Layer1); // xml���� Layer1��ư ������
		tabButton[FRAGMENT_LAYER1].setOnClickListener(this); // Ŭ���̺�Ʈ �߰�
		tabButton[FRAGMENT_LAYER1].setSelected(true); // layer1�� ���õ� �������� ����
		tabButton[FRAGMENT_LAYER2] = (Button) findViewById(R.id.Layer2); // xml���� Layer2��ư ������
		tabButton[FRAGMENT_LAYER2].setOnClickListener(this); // Ŭ���̺�Ʈ �߰�
		tabButton[FRAGMENT_LAYER3] = (Button) findViewById(R.id.Layer3); // xml���� Layer3��ư ������
		tabButton[FRAGMENT_LAYER3].setOnClickListener(this); // Ŭ���̺�Ʈ �߰�
		tabButton[FRAGMENT_LAYER4] = (Button) findViewById(R.id.Layer4); // xml���� Layer4��ư ������
		tabButton[FRAGMENT_LAYER4].setOnClickListener(this); // Ŭ���̺�Ʈ �߰�

		resetButton = (Button) findViewById(R.id.ResetButton); // xml���� reset��ư ������
		resetButton.setOnClickListener(this); // Ŭ�� �̺�Ʈ �߰�

		serverConnect(); // ��������
	}

	public void serverConnect() {
		try {
			if (android.os.Build.VERSION.SDK_INT > 9) { //SDK ������ ���� �� ������ ��å �ٲ�

				StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
						.permitAll().build();
				StrictMode.setThreadPolicy(policy);
			}
			serverClose(); // ���� ���� ����
			socket = new Socket(SERVER_IP_ADDRESS, SERVER_PORT); // ���� ����
			bufWriter = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream())); // ������� ����
			bufReader = new BufferedReader(new InputStreamReader(
					socket.getInputStream())); // �б���� ����
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

	// �������� �޽����� �����ϴ� ������
	private Thread checkRecv = new Thread() {
		public void run() {
			try {
				while (true) {
					// �Է� ��Ʈ������ �޽����� �д´�
					recvData = bufReader.readLine();
					// �̺�Ʈ �ڵ鷯�� �̺�Ʈ�� ����
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
