package com.test.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.test.albert.myapplication.R;

import cn.bmob.v3.Bmob;

public class TestActivity extends Activity {
	
	public static String BMOB_API_KEY = "5eb7b9f34bd4f213f1b9da322b9e5f37";
	
	private Button registe_user,registe_shop,edit_user_info,shop_info,login;

	private ButtonListener li;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		Bmob.initialize(getApplicationContext(), BMOB_API_KEY);
		setContentView(R.layout.activity_test);
		
		registe_user = (Button)findViewById(R.id.registe_user);
		registe_shop = (Button)findViewById(R.id.registe_shop);
		edit_user_info = (Button)findViewById(R.id.edit_user_info);
		shop_info = (Button)findViewById(R.id.shop_info);
		login = (Button)findViewById(R.id.login); 
		
		li = new ButtonListener();
		
		registe_user.setOnClickListener(li);
		registe_shop.setOnClickListener(li);
		edit_user_info.setOnClickListener(li);
		shop_info.setOnClickListener(li);
		login.setOnClickListener(li);
	}
	
	class ButtonListener implements OnClickListener
	{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			int id = v.getId();
			switch(id)
			{
			case R.id.registe_shop:
				Intent intent = new Intent(TestActivity.this,RegisterActivity.class);
				startActivity(intent);
				break;
			case R.id.registe_user:
				Intent intent1 = new Intent(TestActivity.this,RegisterUserActivity.class);
				startActivity(intent1);
				break;
			case R.id.edit_user_info:
				Intent intent2 = new Intent(TestActivity.this,EditUserInfoActivity.class);
				startActivity(intent2);
				break;
			case R.id.shop_info:
				Intent intent3 = new Intent(TestActivity.this,ShopInfoActivity.class);
				startActivity(intent3);
				break;
			case R.id.login:
				Intent intent4 = new Intent(TestActivity.this,LoginActivity.class);
				startActivity(intent4);
				break;
			}
		}
		
	}
}
