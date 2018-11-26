package com.xiaozhu.ttup.refactoring.chapter1;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    private Price _price;

    public Movie(String _title, int _priceCode) {
        this._title = _title;
//        this._priceCode = _priceCode;
        setPriceCode(_priceCode);
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch (arg){
            case Movie.REGULAR:
                _price = new RegularPrice();
                break;
            case Movie.NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            case Movie.CHILDRENS:
                _price = new ChildrenPrice();
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    public double getCharge(int dayRented) {
        return _price.getCharge(dayRented);
    }

    public int getFrequentRenterPoints(int dayRented) {
        return _price.getFrequentRenterPoints(dayRented);
    }
}
