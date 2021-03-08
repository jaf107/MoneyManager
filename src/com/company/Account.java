package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    private static String NID;
    private int ID;
    private String birthday;
    private String dateOfCreation;
    private int totalAmount;

    private String password;

    public static int AccountID = 100;

    ArrayList<Spending> spendings;
    ArrayList<Earning> earnings;


    MoneyBag moneyBag;
//    Spending[] spendings;
//    Earning[] earnings;

    public Account(String name, int totalAmount) {

        Date currentDate;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");;
        currentDate = new Date();
        this.dateOfCreation = formatter.format(currentDate);

        this.name = name;
        this.totalAmount = totalAmount;
        this.ID = AccountID;
        AccountID++;

        this.earnings = new ArrayList<>();
        this.spendings = new ArrayList<>();
    }

    void addEarning(Earning earning)
    {
        this.earnings.add(earning);
    }

    void addSpending(Spending spending)
    {
        this.spendings.add(spending);
    }



    void updateTotalAccount()
    {

    }



    @Override
    public String toString() {
        return "Account:" +
                "\n Name = '" + name + '\'' +
                ",\n ID = " + ID +
//                ",\n Birthday = '" + birthday + '\'' +
                ",\n DateOfCreation = '" + dateOfCreation + '\'' +
                ",\n TotalAmount = " + totalAmount +
                ",\n\n\n Spendings :\n " + spendings +
                ",\n\n\n Earnings :\n " + earnings + "\n"
//                ",\n MoneyBag = " + moneyBag +
                ;
    }
}
