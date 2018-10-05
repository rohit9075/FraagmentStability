package com.rohit.fragmentstability;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 *
 * Author : Sriyank Siddhartha
 *
 * 		Module 9: Providing stability to Fragment on Screen Rotation
 *
 * 		"AFTER" Demo Project
 *
 * */
public class MainActivity extends AppCompatActivity {

	private static final String TAG = MainActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
}
