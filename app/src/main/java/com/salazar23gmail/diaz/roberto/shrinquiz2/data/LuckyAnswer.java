package com.salazar23gmail.diaz.roberto.shrinquiz2.data;

import java.util.Date;

/**
 * Created by Bobby1982 on 02-11-2016.
 */

public class LuckyAnswer {

    private boolean day, lucky;

    public boolean isDay () {
        return day;
    }

    public boolean isLucky () {
        return lucky;
    }

    public LuckyAnswer (boolean lucky) {

        this.lucky = lucky;
        day = new LuckyDay ().day ();

    }

    public class LuckyDay {
        private Date date = new Date ();

        public boolean day () {
            int year = date.getYear ();
            int month = date.getMonth ();
            int day = date.getDay ();
            int result = year + month + day;
            if (result % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }

    }
}
