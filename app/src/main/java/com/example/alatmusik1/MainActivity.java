package com.example.alatmusik1;



import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Tab1.OnFragmentInteractionListener, Tab2.OnFragmentInteractionListener,Tab3.OnFragmentInteractionListener,
Tab4.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myPagerAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.violin);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_tiup50);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_petik50);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_pukul50);


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
