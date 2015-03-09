package com.exmple.petfie.fragment;

import com.example.petfie.Login;
import com.example.petfie.R;
import com.example.petfie.Signup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class FragmentC extends Fragment implements OnClickListener {
	
	private TextView tvFC;
	Button btn1,btn2,btn3;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// get parameter.
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragmentc_layout, container, false);
		tvFC = (TextView) v.findViewById(R.id.tvFC);
		btn1 = (Button) v.findViewById(R.id.button1);
		btn2 = (Button) v.findViewById(R.id.button2);
		btn3 = (Button) v.findViewById(R.id.button3);
		
		btn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getActivity(),Signup.class);
				startActivity(intent);
			}
			
		});
		
		btn2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getActivity(),Login.class);
				startActivity(intent);
			}
			
		});
		
		btn3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getActivity(),Signup.class);
				startActivity(intent);
			}
			
		});
		
		return v;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.tvFC:
			break;

		default:
			break;
		}
	}

}
