package hust.soict.globalict.aims.utils;

import java.util.Scanner;

public class MyDate {
    private int day;
    private String sDay = "";
    private int month;
    private String sMonth ="";
    private int year;
    private String sYear = "";

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) return;
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) return;
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MyDate() {
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        if (this.month == 1) this.sMonth = "January";
        if (this.month == 2) this.sMonth = "February";
        if (this.month == 3) this.sMonth = "March";
        if (this.month == 4) this.sMonth = "April";
        if (this.month == 5) this.sMonth = "May";
        if (this.month == 6) this.sMonth = "June";
        if (this.month == 7) this.sMonth = "July";
        if (this.month == 8) this.sMonth = "August";
        if (this.month == 9) this.sMonth = "September";
        if (this.month == 10) this.sMonth = "October";
        if (this.month == 11) this.sMonth = "November";
        if (this.month == 12) this.sMonth = "December";

        this.sDay= Integer.toString(day);

        this.sYear= Integer.toString(year);
    }

    public MyDate(String parameter){
        String[] words = parameter.split("\\s");
        this.sMonth= new String(words[0]);
        if (words[0].equals("January")) this.month = 1;
        if (words[0].equals("February")) this.month = 2;
        if (words[0].equals("March")) this.month = 3;
        if (words[0].equals("April")) this.month = 4;
        if (words[0].equals("May")) this.month = 5;
        if (words[0].equals("June")) this.month = 6;
        if (words[0].equals("July")) this.month = 7;
        if (words[0].equals("August")) this.month = 8;
        if (words[0].equals("September")) this.month = 9;
        if (words[0].equals("October")) this.month = 10;
        if (words[0].equals("November")) this.month = 11;
        if (words[0].equals("December")) this.month = 12;

        this.sDay= new String(words[1]);
        if(words[1].length() == 4) words[1] = words[1].substring(0, 2);
        else words[1] = words[1].substring(0, 1);
        this.day = Integer.parseInt(words[1]);

        this.sYear= new String(words[2]);
        this.year = Integer.parseInt(words[2]);
    }

    public MyDate(String day, String month, String year) {
        this.sMonth= new String(month);
    }

    public void accept(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a date(String): ");
        String parameter = keyboard.nextLine();
        String[] words = parameter.split("\\s");
        this.sMonth= new String(words[0]);
        if (words[0].equals("January")) this.month = 1;
        if (words[0].equals("February")) this.month = 2;
        if (words[0].equals("March")) this.month = 3;
        if (words[0].equals("April")) this.month = 4;
        if (words[0].equals("May")) this.month = 5;
        if (words[0].equals("June")) this.month = 6;
        if (words[0].equals("July")) this.month = 7;
        if (words[0].equals("August")) this.month = 8;
        if (words[0].equals("September")) this.month = 9;
        if (words[0].equals("October")) this.month = 10;
        if (words[0].equals("November")) this.month = 11;
        if (words[0].equals("December")) this.month = 12;

        this.sDay= new String(words[1]);
        if(words[1].length() == 3) words[1] = "0" + words[1];
        words[1] = words[1].substring(0, 2);
        this.day = Integer.parseInt(words[1]);

        this.sYear = new String(words[2]);
        this.year = Integer.parseInt(words[2]);
    }

    public void print(){
        System.out.println("1. yyyy-MM-dd");
        System.out.println("2. d/M/yyyy");
        System.out.println("3. dd-MMM-yyyy");
        System.out.println("4. MMM d yyyy");
        System.out.println("5. mm-dd-yyyy");
        System.out.print("Choose format of date: ");
        Scanner keyboard = new Scanner(System.in);
        int choose = keyboard.nextInt();
        String month = (this.month >= 10) ? Integer.toString(this.month) : ("0" + this.month);
        String day = (this.day >= 10) ? Integer.toString(this.day) : ("0" + this.day);
        switch(choose){
            case 1:
                System.out.println("Date: " + this.year + "-" + month + "-" + day );
                break;
            case 2:
                System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year );
                break;
            case 3:
                System.out.println("Date: " + this.day + "-" + (this.sMonth).substring(0, 3) + "-" + this.year );
                break;
            case 4:
                System.out.println("Date: " + (this.sMonth).substring(0, 3) + this.day + "-" + this.year );
                break;
            case 5:
                System.out.println("Date: " + month + "-" + day + "-" + this.year );
                break;
            default:
                break;
        }
        // System.out.println("Ngay " + this.day + " thang " + this.month + " nam " + this.year);
        //System.out.println(this.sMonth + " " + this.sDay + " " + this.sYear);
    }
}