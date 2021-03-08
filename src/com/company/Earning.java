package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Earning {
    private String earningTitle;
    private int amount;
    private String date;
    private String earningTag;


    public Earning(String earningTitle, int amount) {

        // Date specifier
        Date currentDate;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");;
        currentDate = new Date();


        this.earningTitle = earningTitle;
        this.amount = amount;
        this.date = formatter.format(currentDate);
        this.earningTag = getEarningTag(earningTitle);
    }

    public String getEarningTag(String input) {

        String myEarningTag = "";

        if(input == "Tution" || input == "tution" || input == "Banani")
            myEarningTag = "Tution";
        else if(input == "Eid" || input == "Salami" || input == "Dadu" || input == "Abbu" || input == "Ammu")
            myEarningTag = "Salami";
        else if(input == "Gift" || input == "gift" )
            myEarningTag = "Gift";
        else if (input == "PM" || input == "Pocket" || input == "Pocket Money")
            myEarningTag = "Pocket Money";
        else if(input == "Scholarship")
            myEarningTag = "Scholarship";
        else
            myEarningTag = "MISC";


        return myEarningTag;
    }

    @Override
    public String toString() {
        return "\nEarning:" +
                "\n Title = '" + earningTitle + '\'' +
                "\n Amount = TK " + amount +
                "\n Date = '" + date + '\'' +
                "\n Tag = '" + earningTag + '\'' +
                "\n" ;
    }
}
