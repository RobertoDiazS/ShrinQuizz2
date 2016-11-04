package com.salazar23gmail.diaz.roberto.shrinquiz2.data;

/**
 * Created by Bobby1982 on 02-11-2016.
 */

public class CoolResult extends CoolAnswer {


    public CoolResult (String user, boolean party, int drinks) {

        super (user, party, drinks);
    }

    public String result () {
        return getUser () + " " + party () + " " + drinks ();
    }


    private String party () {
        if (isParty ()) {
            return "Terrible reventaoooo!!!";
        } else {
            return "Ñoño reservado...";
        }
    }

    private String drinks () {
        if (getDrinks () <= 4) {
            return "niñita..";
        } else if (getDrinks () >= 5 && getDrinks () <= 8) {
            return "wena Sureño??";
        } else {
            return "Vikingaso!!!!";
        }

    }
}
