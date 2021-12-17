package com.whereismypiece.puzzle.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

public class Global {

    private static final String TAG = "Global";
    private static SharedPreferences JJSharePre;
    public static final String SHARE_NAME = "SHARE_NAME";
    public static final String PURCHASE_STATE = "PURCHASE_STATE";
    public static final String CURRENT_ROWS = "CURRENT_ROWS";
    public static final String CURRENT_COLUMNS = "CURRENT_COLUMNS";

    private static SharedPreferences getJJSharePre(Context context){
        if (JJSharePre == null){
            return JJSharePre = context.getSharedPreferences(SHARE_NAME,Context.MODE_PRIVATE);
        }
        return JJSharePre;
    }

    public static void savePurchaseState(Context context, boolean purchaseState){
        getJJSharePre(context).edit().putBoolean(PURCHASE_STATE,purchaseState).commit();
        Log.d(TAG, "savePurchaseState: "+getPurchaseState(context));
    }

    public static boolean getPurchaseState(Context context){
        return getJJSharePre(context).getBoolean(PURCHASE_STATE,false);
    }

    public static void saveRows(Context context, int rows){
        getJJSharePre(context).edit().putInt(CURRENT_ROWS,rows).commit();
        Log.d(TAG, "savePurchaseState: "+getPurchaseState(context));
    }

    public static int getRows(Context context){
        return getJJSharePre(context).getInt(CURRENT_ROWS,3);
    }

    public static void saveColumns(Context context, int column){
        getJJSharePre(context).edit().putInt(CURRENT_ROWS,column).commit();
        Log.d(TAG, "savePurchaseState: "+getPurchaseState(context));
    }

    public static int getColumns(Context context){
        return getJJSharePre(context).getInt(CURRENT_ROWS,3);
    }

}
