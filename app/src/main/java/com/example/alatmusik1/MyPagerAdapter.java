package com.example.alatmusik1;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.ContextCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    public MyPagerAdapter(FragmentManager fm){
        super(fm);

    }
    @Override    public Fragment getItem(int position) {
        switch (position){
            case 0: return new Tab1();
            case 1: return new Tab2();
            case 2: return new Tab3();
            case 3: return new Tab4();
        }
        return null;

    }
    @Override
    public int getCount() {
        return 4;
    }
    @Override    public CharSequence getPageTitle(int position) { switch (position){
        case 0: return "GESEK";
        case 1: return "TIUP";
        case 2: return "PETIK";
        case 3: return "PUKUL";
        default: return null;
    }
    }
}
