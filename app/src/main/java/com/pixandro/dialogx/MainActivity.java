package com.pixandro.dialogx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.pixandroid.dialogx.DialogX;
import com.pixandroid.dialogx.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.pixandro.dialogx.R.layout.activity_main);





        // DialogX.dismiss();

    }

    public void onClickM(View view) {
        new DialogX().setTitle("load").show_loading_centre(MainActivity.this);

//        new DialogX()
//                .setTitle("Are you sure?")
//                .setDescription("Please do not close this window if you are not sure.")
//                .setTitleTextColor(R.color.teal_200)
//                .setDescriptionTextColor(R.color.teal_700)
//                .setProgressColorHex(R.color.purple_500)
//                .setNoButtonText("Clear")
//                .setYesButtonText("Continue")
//                .setNoButtonColor(R.color.black)
//                .setNoButtonTextColor(R.color.teal_200)
//                .setYesButtonColor(R.color.teal_200)
//                .setYesButtonTextColor(R.color.black)
//                .disableBackToClose(true)
//                .hideButtonNO(true)
//                .setButtonType(DialogX.SQUARE_BUTTON)
//                .setBackgroundColor(R.color.purple_700)
//                .setYesNoClickListener(new DialogX.DialogXListener() {
//                    @Override
//                    public void onYesClicked() {
//                        DialogX.dismiss();
//                    }
//
//                    @Override
//                    public void onNoClicked() {
//                        DialogX.dismiss();
//                    }
//                })
//                .showBottomYesNoDialog(MainActivity.this, true);
    }
}