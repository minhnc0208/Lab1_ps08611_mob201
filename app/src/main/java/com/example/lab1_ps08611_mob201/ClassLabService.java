package com.example.lab1_ps08611_mob201;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

public class ClassLabService extends Service {
    public ClassLabService() {
    }


    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Hien thi thong bao khi kich hoat Service
        Toast.makeText(this, "new Service was Started", Toast.LENGTH_SHORT).show();
        // Lay bundle tu Intent
        Bundle b = intent.getBundleExtra("Student");
        // lay gia tri tu bundle
        int StuID = b.getInt("StuID");
        String StuName = b.getString("StuName");
        String Class = b.getString("Class");
        // Hien thi ket qua len man hinh
        String content = "Them sinh vien thanh cong.\n Thong tin sinh vien: \n Sinh vien: " +"\n"+ StuID + " - \r" + StuName;
        content += "\nLop: " + Class;
        Toast.makeText(this, content, Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
