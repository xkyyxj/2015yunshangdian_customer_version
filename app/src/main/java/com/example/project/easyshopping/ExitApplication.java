package com.example.project.easyshopping;
import java.util.LinkedList;
import java.util.List;

import android.app.Activity;
import android.app.Application;
import android.util.Log;
public class ExitApplication extends Application {

 private List<Activity> activityList=new LinkedList<Activity>();

private static ExitApplication instance;
private ExitApplication()
{
}
 //鍗曚緥妯″紡涓幏鍙栧敮涓?殑ExitApplication 瀹炰緥
public static ExitApplication getInstance()
{
	if(null == instance)
 {
 instance = new ExitApplication();
 }
 return instance;

 }
 //娣诲姞Activity 鍒板鍣ㄤ腑
 public void addActivity(Activity activity)
 {
	 boolean flag=false;
	 for(Activity activity1:activityList)
	 {
		 if( activity1.getClass().equals(activity.getClass()))
				 {
			       flag=true;
			       activity1=activity;
				 }
	 }
	 if(!flag)
        activityList.add(activity);
 }
 //閬嶅巻鎵?湁Activity 骞秄inish
 public void exit()
 {
 for(Activity activity:activityList)
 {
 activity.finish();
 }
 System.exit(0);
 }
 }