package com.hy.powerplatform.my_utils.utils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2018/5/23.
 */

public class ActivityCollector extends Activity {
    private static List<Activity> activities=new ArrayList<Activity>() ;


    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static void finidhAll() {
        for(Activity activity:activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}