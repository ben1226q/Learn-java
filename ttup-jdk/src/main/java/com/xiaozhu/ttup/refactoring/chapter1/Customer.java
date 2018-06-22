package com.xiaozhu.ttup.refactoring.chapter1;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector<Rental> _rentals = new Vector<Rental>();

    public Customer(String _name) {
        this._name = _name;
    }
    public void addRental(Rental arg){
        _rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement(){
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        String result = "Rental Record for "+getName()+"\n";

        while (rentals.hasMoreElements()){
            double thisAmout = 0;
            Rental each = rentals.nextElement();
            switch (each.getMovie().getPriceCode()){
                case Movie.REGULAR:
                    thisAmout += 2;
                    if(each.getDayRented()>2){
                        thisAmout += (each.getDayRented()-2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmout += each.getDayRented()*3;
                    break;
                case Movie.CHILDRENS:
                    thisAmout += 1.5;
                    if(each.getDayRented()>3){
                        thisAmout += (each.getDayRented()-3)*1.5;
                    }
            }
            frequentRenterPoints++;
            if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                    each.getDayRented() > 1){
                frequentRenterPoints++;
            }

            result += "\t"+each.getMovie().getTitle()+"\t"+String.valueOf(thisAmout)+"\n";
            totalAmount += thisAmout;
        }

        result+= "Amount owed is "+String.valueOf(totalAmount) + "\n";
        result+="you earned "+String.valueOf(frequentRenterPoints)+" frequent renter points";
        return result;
    }
}
