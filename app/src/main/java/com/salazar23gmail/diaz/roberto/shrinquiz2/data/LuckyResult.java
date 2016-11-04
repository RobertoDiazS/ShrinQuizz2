package com.salazar23gmail.diaz.roberto.shrinquiz2.data;

/**
 * Created by Bobby1982 on 02-11-2016.
 */

public class LuckyResult extends LuckyAnswer {


    public LuckyResult (boolean lucky) {

        super (lucky);
    }

    public String result () {
        return lucky () + " " + day ();

    }

    private String lucky () {

        if (isLucky ()) {
            return "Genial!!!!";
        } else {
            return "Animo!!!!";
        }
    }

    private String day () {
        if (isDay ()) {
            return "Es tu dia de suerte!!!";
        } else {
            return "Mañana sera tu dia!!!";
        }
    }


}
