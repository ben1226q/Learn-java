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
        Enumeration<Rental> rentals = _rentals.elements();
        String result = "Rental Record for "+getName()+"\n";
        while (rentals.hasMoreElements()){
            Rental each = rentals.nextElement();
            result += "\t"+each.getMovie().getTitle()+"\t"+String.valueOf(each.getCharge())+"\n";
        }
        result+= "Amount owed is "+String.valueOf(getTotalCharge()) + "\n";
        result+="you earned "+String.valueOf(getTotalFrequesntRenterPoints())+" frequent renter points";
        return result;
        
    }

    private int getTotalFrequesntRenterPoints() {
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        while (rentals.hasMoreElements()){
            Rental each = rentals.nextElement();
            frequentRenterPoints += each.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    private double getTotalCharge() {
        Enumeration<Rental> rentals = _rentals.elements();
        double result = 0;
        while (rentals.hasMoreElements()){
            Rental each = rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

}
