package com.example.program1;

//import com.example.calculatorprogram.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	TextView tv;
	Button add,sub,mul,div;
	EditText num1,num2;
	String operator="";
	private String oper;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		num1=(EditText) findViewById(R.id.edittext1);
		num2=(EditText) findViewById(R.id.edittext2);
		tv=(TextView) findViewById(R.id.textView1);
		Button add=(Button) findViewById(R.id.button1);
		
		
		Button sub=(Button) findViewById(R.id.button2);
		Button mul=(Button) findViewById(R.id.button3);
		Button div=(Button) findViewById(R.id.button4);
		add.setOnClickListener(this);
		//add.setOnClickListener(new OnClickListener) ;
	
			sub.setOnClickListener(this) ;
			
				mul.setOnClickListener(this);
				div.setOnClickListener(this);
				
	}
			public void onClick(View v){
				float num1=0;
				float num2=0;
				float answer=0;
			//TextUtils.isEmpty(str)
		num1=Float.parseFloat(num1.getText().toString());
		num2=Float.parseFloat(num2.getText().toString());
				
				switch(v.getId()){
		case R.id.button1:
			 oper = "+";
			answer=num1+num2;
			break;
			
		case R.id.button2:
			oper="-";
			answer=num1-num2;
			break;
		case R.id.button3:
			oper="*";
			answer=num1*num2;
			break;
			
		case R.id.button4:
			oper="/";
			break;
		}
			tv.setText(num1 + "" +oper + "" +num2 + "=" +answer);			
		}}
	