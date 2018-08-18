package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

/**
 * Created by bandriya on 22-Aug-17.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    int tabCount;
    SimpleFragmentPagerAdapter(FragmentManager fm,int tabCount)
    {
        super(fm);
        this.tabCount= tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                return new NumberFragment();
            case 1:
                return new FamilyFragment();
            case 2:
                return new ColorFragment();
            case 3:
                return new PhrasesFragment();
            default:
                return new NumberFragment();
        }
    }

    @Override
    public int getCount() {
        return tabCount ;
    }
}
