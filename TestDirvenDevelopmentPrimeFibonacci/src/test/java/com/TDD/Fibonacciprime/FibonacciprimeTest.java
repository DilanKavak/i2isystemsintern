package com.TDD.Fibonacciprime;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciprimeTest {

    private FibonacciVeAsal _fibonacciPrime;

    @BeforeEach
    public void init()
    {
        _fibonacciPrime = new FibonacciVeAsal();
    }

    @Test
    public void isPrimeTest()
    {
        int number = 3;
        assertTrue(_fibonacciPrime.checkIsPrime(number));
    }
    @Test
    public void notPrimeTest()
    {
        int number = 9;
        assertFalse(_fibonacciPrime.checkIsPrime(number));
    }

    @Test
    public void isPrimeAndFibonacciTest()
    {
        int number = 5;
        assertTrue(_fibonacciPrime.checkIsPrimeFibonacci(number, number));
    }

    @Test
    public void isPrimeNotFibonacciTest()
    {
        int number = 11;
        assertFalse(_fibonacciPrime.checkIsPrimeFibonacci(number, number));
    }


    @Test
    public void notPrimeIsFibonacciTest()
    {
        int number = 21;
        assertFalse(_fibonacciPrime.checkIsPrimeFibonacci(number, number));
    }

    @Test
    public void notPrimeNotFibonacciTest()
    {
        int number = 32;
        assertFalse(_fibonacciPrime.checkIsPrimeFibonacci(number, number));
    }




}