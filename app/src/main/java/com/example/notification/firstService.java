package com.example.notification;


import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class firstService extends Service {

    private NotificationManagerCompat notificationManager;


    @Override
    public IBinder onBind(Intent intent) {
        return null;

    }

    @Override
    public void onCreate() {
        super.onCreate();

        notificationManager = NotificationManagerCompat.from(this);


        Notification notification = new NotificationCompat.Builder(this, MainActivity.CHANNEL_1_ID)
                .setSmallIcon(R.drawable.ic_announcement_black_24dp)
                .setContentTitle("aaaa")
                .setContentText("bbbb")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();
        notificationManager.notify(1,notification);



        Toast.makeText(getApplicationContext(),"FIRST SERVICE",Toast.LENGTH_SHORT).show();



        ///////




        //////




    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
