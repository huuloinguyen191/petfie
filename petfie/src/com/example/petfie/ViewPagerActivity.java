package com.example.petfie;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import com.exmple.petfie.fragment.FragmentA;
import com.exmple.petfie.fragment.FragmentB;
import com.exmple.petfie.fragment.FragmentC;
import com.exmple.petfie.fragment.FragmentD;



public class ViewPagerActivity extends FragmentActivity {
	
	private static final int NUM_PAGES = 4;	
	private ViewPager mPager;
	private PagerAdapter mPagerAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewpager_layout);

		mPager = (ViewPager) findViewById(R.id.view_pager);
		mPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
		mPager.setAdapter(mPagerAdapter);
	}

	private class ViewPagerAdapter extends FragmentStatePagerAdapter {
		public ViewPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
		
			switch (position) {
			case 0:
				
				Fragment fragmentA = new FragmentA();
				Bundle bundle = new Bundle();
				bundle.putString("test", "test");
				fragmentA.setArguments(bundle);
				return fragmentA;
			case 1:
				
				Fragment fragmentB = new FragmentB();
				return fragmentB;

			case 2:
			
				Fragment fragmentC = new FragmentC();
				return fragmentC;
				
			case 3:
				
				Fragment fragmentD = new FragmentD();
				return fragmentD;
				
			default:
				break;
			}
			return null;
		}

		@Override
		public int getCount() {
			return NUM_PAGES;
		}
	}

	@Override
	public void onBackPressed() {
		if (mPager.getCurrentItem() == 0) {
			super.onBackPressed();
		} else {
			mPager.setCurrentItem(mPager.getCurrentItem() - 1);
		}
	}

}
