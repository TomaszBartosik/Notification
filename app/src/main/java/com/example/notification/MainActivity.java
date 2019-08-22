package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String CHANNEL_1_ID = "channel1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createNotificationChanels();
    }

    private void createNotificationChanels(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel1 = new NotificationChannel(
                    CHANNEL_1_ID,
                    "Channel 1",
                    NotificationManager.IMPORTANCE_HIGH
            );
            channel1.setDescription("This is channel 1");

            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel1);

        }

    }

    private void setNotificationDelegate(String delegate){


    }



    public void service1(View view) {
        Intent i = new Intent(this, firstService.class);
        startService(i);
    }

    public void service2(View view) {
        Intent i = new Intent(this, secondService.class);
        startService(i);
    }

    public void service3(View view) {
        Intent i = new Intent(this, firstService.class);
        Intent j = new Intent(this, secondService.class);

        stopService(i);
        stopService(j);
    }
}
