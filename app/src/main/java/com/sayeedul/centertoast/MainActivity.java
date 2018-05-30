package com.sayeedul.centertoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Toast toast = Toast.makeText(MainActivity.this,"ON CREATE at Centre !!! ", Toast.LENGTH_SHORT);
       toast.setGravity(Gravity.CENTER, 0, 0);
       toast.show();

    }
}
