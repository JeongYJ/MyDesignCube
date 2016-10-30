package com.example.event;

import android.app.Activity;
import android.widget.Toast;

public class BackPressButtonActivity {
//뒤로가기 버튼 2회 누를 시 종료 (한 번 클릭한 뒤 2초가 지나면 꺼지지 않음)
	
        private long backKeyPressedTime = 0;
        private Toast toast;
        private Activity activity;

       public BackPressButtonActivity(Activity activity) {
                      this.activity = activity;
        }

         public void onBackPressed() {
                       if (isAfter2Seconds()) { //맨 처음 & 2초가 지났을 경우
                               backKeyPressedTime = System.currentTimeMillis(); 
                               // 현재시간을 다시 초기화
                               toast = Toast.makeText(activity, "\'뒤로\'버튼을 한번 더 누르시면 종료됩니다.", Toast.LENGTH_SHORT);
                               toast.show();
                                return;
                      }
                      if (isBefore2Seconds()) { //2초가 지나지 않았을 경우
                                programShutdown(); //프로그램을 종료시킨다.
                                toast.cancel();
                      }
         }

          private Boolean isAfter2Seconds() {
                  return System.currentTimeMillis() > backKeyPressedTime + 2000;
                                 // 2초 지났을 경우
         }  

          private Boolean isBefore2Seconds() {
                  return System.currentTimeMillis() <= backKeyPressedTime + 2000;
                                 // 2초가 지나지 않았을 경우
         }

          private void programShutdown() {
                         activity .moveTaskToBack(true);
                         activity .finish();
                         android.os.Process.killProcess(android.os.Process.myPid());
                         System.exit(0);
         }

}
