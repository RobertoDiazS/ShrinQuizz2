package com.salazar23gmail.diaz.roberto.shrinquiz2.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.salazar23gmail.diaz.roberto.shrinquiz2.views.CoollFragment;
import com.salazar23gmail.diaz.roberto.shrinquiz2.LuckyFragment;
import com.salazar23gmail.diaz.roberto.shrinquiz2.MatchFragment;
import com.salazar23gmail.diaz.roberto.shrinquiz2.R;

/**
 * Created by Bobby1982 on 02-11-2016.
 */

public class PagerAdapter extends FragmentPagerAdapter{

    private Context context;

    public PagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return CoollFragment.newInstance();
            case 1:
                return LuckyFragment.newInstance();
            case 2:
                return MatchFragment.newInstance();
            default:
                return CoollFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public CharSequence getPageTitle (int position) {
        switch (position) {
            case 0:
                return context.getString (R.string.cool_title);
            case 1:
                return context.getString (R.string.lucky_title);
            case 2:
                return context.getString (R.string.match_title);
            default:
                return context.getString (R.string.cool_title);

        }
    }
}
