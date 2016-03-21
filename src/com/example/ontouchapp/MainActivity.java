package com.example.ontouchapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;


public class MainActivity extends Activity implements OnTouchListener{
    
	TextView txt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		txt = (TextView)findViewById(R.id.txtID);
		txt.setOnTouchListener(this);
	}

	@SuppressLint("ClickableViewAccessibility")
	@Override
	public boolean onTouch(View v, MotionEvent me){ 
		switch(me.getAction())
		{
		case MotionEvent.ACTION_DOWN:
		{   
			txt.setText("Você de ter activado um evento de toque");
		     break;
		}
		case MotionEvent.ACTION_MOVE:
		{
			txt.setText("Você fez um movimento com o dedo");
		     break;
		}
		case MotionEvent.ACTION_UP:
		{
			txt.setText("você retriado tela dedo");
		     break;
		}
		
		}
			
		return false;
	}
	
}
