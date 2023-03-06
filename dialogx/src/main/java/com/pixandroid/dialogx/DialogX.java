package com.pixandroid.dialogx;


import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;


/********************************************
 *     Created by DailyCoding on 27-May-22.  *
 ********************************************/

public class DialogX {
    private static final String TAG = "ProcessingDialog";

    private String title;
    private String description;
    private int progress_color;
    private int titleTextColor;
    private int descriptionTextColor;
    private int iconDrawable;
    private DialogXListener listener;

    private static Dialog mProgressDialog;

    public DialogX setTitle(String title) {
        this.title = title;
        return this;
    }

    public DialogX setIconDrawable(int iconDrawable) {
        this.iconDrawable = iconDrawable;
        return this;
    }

    public DialogX setYesNoClickListener(DialogXListener listener) {
        this.listener = listener;
        return this;
    }

    public DialogX setTitleTextColor(int titleTextColor) {
        this.titleTextColor = titleTextColor;
        return this;

    }

    public DialogX setDescriptionTextColor(int descriptionTextColor) {
        this.descriptionTextColor = descriptionTextColor;
        return this;
    }

    public DialogX setDescription(String description) {
        this.description = description;
        return this;
    }

    public DialogX setProgressColorHex(int color) {
        this.progress_color = color;
        return this;
    }

    public DialogX showBottomLoading(Context mContext, boolean visible) {
        if (visible){
            showBottomLoading(mContext);
        } else {
            dismiss();
        }
        return this;
    }

    public DialogX showMiddleLoading(Context mContext, boolean visible) {
        if (visible){
            showMiddleLoading(mContext);
        } else {
            dismiss();
        }
        return this;
    }

    public DialogX showBottomYesNoDialog(Context mContext, boolean visible) {
        if (visible){
            showBottomYesNoDialog(mContext);
        } else {
            dismiss();
        }
        return this;
    }

    public static void dismiss() {
        try {
            mProgressDialog.dismiss();
        }catch (Exception e){
            Log.e(TAG, "dismiss: "+ e.getMessage() );
        }
    }

    private void showBottomLoading(Context context){
        mProgressDialog = new Dialog(context);
        mProgressDialog.setContentView(R.layout.dialog_bottom_loading);

        mProgressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialogInterface) {

            }
        });
        TextView txt_title = mProgressDialog.findViewById(R.id.txt_title);
        TextView txt_description = mProgressDialog.findViewById(R.id.txt_description);
        ProgressBar progress_circular = mProgressDialog.findViewById(R.id.progress_circular);

        if (titleTextColor != 0) {
            txt_title.setTextColor(titleTextColor);
        }

        if (descriptionTextColor != 0) {
            txt_description.setTextColor(descriptionTextColor);
        }

        if (title != null) {
            txt_title.setText(title);
        }

        if (description != null) {
            txt_description.setText(description);
        }

        if (progress_color != 0) {
            String hex = "#" + Integer.toHexString(context.getResources().getColor(progress_color));
            progress_circular.getIndeterminateDrawable().setColorFilter(Color.parseColor(hex), PorterDuff.Mode.SRC_IN);
        }

        Window window = mProgressDialog.getWindow();
        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.bg_bottom_dialog));
        window.setGravity(Gravity.BOTTOM);
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(mProgressDialog.getWindow().getAttributes());
        lp.windowAnimations = R.style.SlideBottomDialogAnimation;
        mProgressDialog.getWindow().setAttributes(lp);
        mProgressDialog.setCancelable(false);
        mProgressDialog.show();
    }

    private void showMiddleLoading(Context context){
        mProgressDialog = new Dialog(context);
        mProgressDialog.setContentView(R.layout.dialog_middle_loading);

        mProgressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialogInterface) {

            }
        });
        TextView txt_title = mProgressDialog.findViewById(R.id.txt_title);
        TextView txt_description = mProgressDialog.findViewById(R.id.txt_description);
        ProgressBar progress_circular = mProgressDialog.findViewById(R.id.progress_circular);

        if (titleTextColor != 0) {
            txt_title.setTextColor(titleTextColor);
        }

        if (descriptionTextColor != 0) {
            txt_description.setTextColor(descriptionTextColor);
        }

        if (title != null) {
            txt_title.setText(title);
        }

        if (description != null) {
            txt_description.setText(description);
        }

        if (progress_color != 0) {
            String hex = "#" + Integer.toHexString(context.getResources().getColor(progress_color));
            progress_circular.getIndeterminateDrawable().setColorFilter(Color.parseColor(hex), PorterDuff.Mode.SRC_IN);
        }

        Window window = mProgressDialog.getWindow();
        window.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.bg_middle_loading));
        window.setGravity(Gravity.CENTER);
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(mProgressDialog.getWindow().getAttributes());
        lp.windowAnimations = R.style.FadeMiddleDialogAnimation;
        mProgressDialog.getWindow().setAttributes(lp);
        mProgressDialog.setCancelable(false);
        mProgressDialog.show();
    }

    private void showBottomYesNoDialog(Context context){
        mProgressDialog = new Dialog(context);
        mProgressDialog.setContentView(R.layout.dialog_yes_no);

        mProgressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialogInterface) {

            }
        });
        Button btn_no = mProgressDialog.findViewById(R.id.btn_no);
        Button btn_yes = mProgressDialog.findViewById(R.id.btn_yes);
        TextView txt_title = mProgressDialog.findViewById(R.id.txt_title);
        TextView txt_description = mProgressDialog.findViewById(R.id.txt_description);
        ImageView img_icon = mProgressDialog.findViewById(R.id.img_icon);

        if (titleTextColor != 0) {
            txt_title.setTextColor(titleTextColor);
        }

        if (descriptionTextColor != 0) {
            txt_description.setTextColor(descriptionTextColor);
        }

        if (title != null) {
            txt_title.setText(title);
        }

        if (description != null) {
            txt_description.setText(description);
        }

        if (iconDrawable != 0) {
            img_icon.setImageResource(iconDrawable);
        }

        btn_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onYesClicked();

            }
        });

        btn_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onNoClicked();
            }
        });

        Window window = mProgressDialog.getWindow();
        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.bg_bottom_dialog));
        window.setGravity(Gravity.BOTTOM);
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(mProgressDialog.getWindow().getAttributes());
        lp.windowAnimations = R.style.SlideBottomDialogAnimation;
        mProgressDialog.getWindow().setAttributes(lp);
        mProgressDialog.setCancelable(true);
        mProgressDialog.show();
    }

    public interface DialogXListener{
        void onYesClicked();
        void onNoClicked();
    }
}
