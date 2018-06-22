package com.xiaozhu.ttup.refactoring.chapter1;

import org.junit.Test;

public class CustomerTest {

    @Test
    public void testMain() {

        Customer customer = new Customer("asan");
        Movie movie = new Movie("英雄", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 3);
        customer.addRental(rental);

        Movie movie1 = new Movie("小头爸爸", Movie.NEW_RELEASE);
        Rental rental1 = new Rental(movie1, 3);
        customer.addRental(rental1);

        Movie movie2 = new Movie("复仇者联盟", Movie.REGULAR);
        Rental rental2 = new Rental(movie2, 3);
        customer.addRental(rental2);

        System.out.println(customer.statement());

    }
}
