package com.ricardo.haldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.time.LocalDate;

import hsae.hardware.hello_hidl.V1_0.IHello;

public class MainActivity extends AppCompatActivity {
    IHello hello;
    public  static String TAG = "Hello";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    hello = IHello.getService();

                    if (hello != null) {
                        Log.d(TAG, "testApp:==========" + hello.toString());
                        String result= hello.getHelloString("sdfsf");
                        Log.d(TAG, result);
                        textView.setText(result);
//                textView.setText(result);
                    }else{
                        Log.d(TAG, "helloApp:==========" + "null");
                        textView.setText("helloApp:========== null");
                    }
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        });



    }
}