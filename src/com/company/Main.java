package com.company;

public class Main {

    public static double totalWages(double hrs, double rate){
        double wages;
        if (hrs>40)
        { wages=1.5*rate*(hrs-40) + (1.5*rate*40); }
        else
        { wages=hrs*rate; }
        return wages;
    }

    public static boolean isLeapYear(int year)
    {
        if (year%4==0 && (year%100!=0 || year%400==0))
        { return true; }
        else
        { return false; }
    }

    public static boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2)
    {
        if (year1>year2)
        { return true; }
        else if (month1>month2)
        { return true;}
        else if (day1>day2)
        { return true;}
        else
        { return false; }
    }

    public static bestMatch()
    {}
    public static findBestFit()
    {}


    public static void main(String[] args) {
	// write your code here
    }
}
