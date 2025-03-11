package edu.iu.p466.prime_service.Service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeServiceTest {

    // add a unit test

    PrimeService myprimeService = new PrimeService();

    @Test
    void _45_is_not_prime() {
        int n = 45;
        boolean expected = false;
        boolean actual = myprimeService.isPrime(n);
        assertEquals(expected, actual);
    }


    @Test
    void _2isprime() {
        int n = 2;
        boolean expected = true;
        boolean actual = myprimeService.isPrime(n);
        assertEquals(expected, actual);
    }

}