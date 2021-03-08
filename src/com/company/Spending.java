package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Spending {

    private String spendingTitle;
    private int amount;
    private String date;
    private String spendingTag;

    public Spending(String spendingTitle, int amount) {

        Date currentDate;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");;
        currentDate = new Date();

        this.spendingTitle = spendingTitle;
        this.amount = amount;
        this.date = formatter.format(currentDate);
        this.spendingTag = getSpendingTag(spendingTitle);
    }

    private String getSpendingTag(String spendingTitle) {
        String spendingTag = "";

        if(spendingTitle == "Rickshaw" || spendingTitle == "CNG" || spendingTitle == "Bus" || spendingTitle == "Uber")
            spendingTag = "Transport";
        else if(spendingTitle == "Burger" || spendingTitle == "Pizza" || spendingTitle == "Lunch" || spendingTitle == "Breakfast" || spendingTitle == "Snack" || spendingTitle == "Outing")
            spendingTag = "Food";
        else if(spendingTitle == "Gift")
            spendingTag = "Gift";
        else if(spendingTitle == "Books" || spendingTitle == "Copies" || spendingTitle == "Pen" || spendingTitle == "Pencils")
            spendingTag = "Education";
        else if(spendingTitle == "Home")
            spendingTag = "Home";
        else
            spendingTag = "MISC";


        return spendingTag;
    }



    @Override
    public String toString() {
        return "\nSpending:" +
                "\n Title = '" + spendingTitle + '\'' +
                "\n Amount = TK " + amount +
                "\n Date = '" + date + '\'' +
                "\n Tag = '" + spendingTag + '\'' +
                "\n" ;
    }
}
