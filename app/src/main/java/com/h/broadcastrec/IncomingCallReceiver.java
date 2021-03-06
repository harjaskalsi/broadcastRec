package com.h.broadcastrec;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class IncomingCallReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
       try
       { String state=intent.getStringExtra(TelephonyManager.EXTRA_STATE);

        if(state.equals(TelephonyManager.EXTRA_STATE_RINGING))
        {
            Toast.makeText(context, "PHONE IS RINGING", Toast.LENGTH_LONG).show();

        }

        if(state.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)){
            Toast.makeText(context, "CALL RECEIVED", Toast.LENGTH_LONG).show();

        }

        if(state.equals(TelephonyManager.EXTRA_STATE_IDLE)){
            Toast.makeText(context, "PHONE IS IDLE", Toast.LENGTH_LONG).show();

        }
    }
    catch (Exception e){
       e.printStackTrace();}
    }


}
