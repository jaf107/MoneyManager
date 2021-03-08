package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here
//        MoneyManagerTool moneyManagerTool = new MoneyManagerTool();

        Earning myFirstEarning = new Earning("Dadu", 500);
        Earning myFirstEarning1 = new Earning("Tution", 8000);
        Earning myFirstEarning2 = new Earning("Eid", 1000);


        Spending myFirstSpending = new Spending("Air Dots" , 1500);
        Spending myFirstSpending1 = new Spending("Rickshaw" , 10);
        Spending myFirstSpending2 = new Spending("Gift" , 650);

        Account myAccount = new Account("Mahin", 30000);

        myAccount.addEarning(myFirstEarning);
        myAccount.addEarning(myFirstEarning1);
        myAccount.addEarning(myFirstEarning2);

        myAccount.addSpending(myFirstSpending);
        myAccount.addSpending(myFirstSpending1);
        myAccount.addSpending(myFirstSpending2);

        System.out.println(myAccount.toString());


    }
}
