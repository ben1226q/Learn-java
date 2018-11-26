package com.xiaozhu.ttup.refactoring.chapter1;

public abstract class Price {
    abstract int getPriceCode();
    abstract double getCharge(int dayRented);
    public int getFrequentRenterPoints(int dayRented) {
        return 1;
    }
}

class ChildrenPrice extends Price{
    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }
    public double getCharge(int dayRented) {
        double result = 1.5;
        if(dayRented>3){
            result += (dayRented-3)*1.5;
        }
        return result;
    }
}

class NewReleasePrice extends Price{
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getCharge(int dayRented) {
        return dayRented*3;
    }
    public int getFrequentRenterPoints(int dayRented) {
        return dayRented>1 ? 2: 1;
    }
}

class RegularPrice extends Price{

    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    public double getCharge(int dayRented) {
        double result = 2;
        if(dayRented>2){
            result += (dayRented-2) * 1.5;
        }
        return result;
    }
}


