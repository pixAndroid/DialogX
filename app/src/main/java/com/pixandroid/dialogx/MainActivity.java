package com.pixandroid.dialogx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        // DialogX.dismiss();

    }

    public void onClickM(View view) {

        new DialogX()
                .setTitle("Processing ..")
                .setDescription("Please do not close this window")
                .setTitleTextColor(R.color.purple_500)
                .setDescriptionTextColor(R.color.teal_200)
                .setProgressColorHex(R.color.purple_500)
                .showBottomLoading(MainActivity.this, true);
    }
}