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
                .setTitle("Are you sure?")
                .setDescription("Please do not close this window if you are not sure.")
                .setTitleTextColor(R.color.purple_500)
                .setDescriptionTextColor(R.color.teal_200)
                .setProgressColorHex(R.color.purple_500)
                .setYesNoClickListener(new DialogX.DialogXListener() {
                    @Override
                    public void onYesClicked() {
                        DialogX.dismiss();
                    }

                    @Override
                    public void onNoClicked() {
                        DialogX.dismiss();
                    }
                })
                .showBottomYesNoDialog(MainActivity.this, true);
    }
}