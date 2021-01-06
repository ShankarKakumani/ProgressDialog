package com.shankar.progress_dialog;

import android.app.Activity;
import android.app.ProgressDialog;

public class pd {

    private static ProgressDialog mProgressDialog;

    public static void showPD(Activity act , String msg)
    {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(act);
            mProgressDialog.setMessage(msg);
            mProgressDialog.setIndeterminate(true);
            mProgressDialog.setCancelable(false);
            mProgressDialog.setCanceledOnTouchOutside(false);
        }
        mProgressDialog.show();
    }

    public static void hidePD()
    {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }

}
