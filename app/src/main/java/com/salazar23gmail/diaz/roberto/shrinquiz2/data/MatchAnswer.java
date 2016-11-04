package com.salazar23gmail.diaz.roberto.shrinquiz2.data;

import android.content.Context;

/**
 * Created by Bobby1982 on 02-11-2016.
 */

public class MatchAnswer {

    private String name, loverName, quarter;
    private Context context;

    public MatchAnswer (String name, String loverName, String quarter, Context context) {
        this.name = name;
        this.loverName = loverName;
        this.quarter = quarter;
        this.context = context;
    }

    public String getName () {
        return name;
    }

    public String getLoverName () {
        return loverName;
    }

    public String getQuarter () {
        return quarter;
    }

    public Context getContext () {
        return context;
    }
}
