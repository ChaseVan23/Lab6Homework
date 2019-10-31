/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chasec
 */
public class Month {

    int monthNumber;

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {

        if (monthNumber < 1 || monthNumber > 12) {
            this.monthNumber = 1;
        } else {
            this.monthNumber = monthNumber;
        }

    }

    String arr[] = new String[]{"January", "February", "March", "April", "May", "June", "July",
         "August", "Spetember", "October", "November",
         "December"};

    public Month() {
        monthNumber = 1;
    }

    public Month(int numberOfMonth) {

        if (numberOfMonth < 1 || numberOfMonth > 12) {
            monthNumber = 1;
        } else {
            monthNumber = numberOfMonth;
        }

    }

    public Month(String name) {

        if (name.equalsIgnoreCase("January")) {
            monthNumber = 1;
        } else if (name.equalsIgnoreCase("February")) {
            monthNumber = 2;
        } else if (name.equalsIgnoreCase("March")) {
            monthNumber = 3;
        } else if (name.equalsIgnoreCase("April")) {
            monthNumber = 4;
        } else if (name.equalsIgnoreCase("May")) {
            monthNumber = 5;
        } else if (name.equalsIgnoreCase("June")) {
            monthNumber = 6;
        } else if (name.equalsIgnoreCase("July")) {
            monthNumber = 7;
        } else if (name.equalsIgnoreCase("August")) {
            monthNumber = 8;
        } else if (name.equalsIgnoreCase("September")) {
            monthNumber = 9;
        } else if (name.equalsIgnoreCase("October")) {
            monthNumber = 10;
        } else if (name.equalsIgnoreCase("November")) {
            monthNumber = 11;
        } else if (name.equalsIgnoreCase("December")) {
            monthNumber = 12;
        }

    }

    public String getMonthName(int number) {

        if (number > 0 && number < 12) {
            return arr[number - 1];
        }

        return null;

    }

    public String toString() {

        return getMonthName(this.monthNumber);

    }

    public boolean equals(Month m) {

        if (m == this) {
            return true;
        }
        if (!(m instanceof Month)) {
            return false;
        }

        Month c = (Month) m;

        return monthNumber == c.monthNumber;

    }

    public boolean greaterThan(Month m) {

        Month c = (Month) m;

        return monthNumber > c.monthNumber;

    }

    public boolean lessThan(Month m) {

        Month c = (Month) m;

        return monthNumber < c.monthNumber;

    }
}
