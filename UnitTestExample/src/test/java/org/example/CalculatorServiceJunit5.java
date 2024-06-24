package org.example;

import org.junit.jupiter.api.*;

public class CalculatorServiceJunit5 {

    @BeforeAll
    public static void before()
    {
        System.out.println("\nrun before all test case");
    }

    @BeforeEach
    public void beforeEach()
    {
        System.out.println("\nexcute before each test case");
    }

    @AfterEach
    @DisplayName("This is custom name of test case")
    public void AfterEach()
    {
        System.out.println("\nexcute After each test case");
    }

    @Test
    @Disabled //disable any test case
    public void addTwoNumTest()
    {
        int result = CalculatorService.addTwoNum(12,45);
        int expected = 60;
        Assertions.assertNotEquals(expected,result,"Test case");
    }

    @Test
    public void sumAnyNumTest(){
        int result = CalculatorService.sumAnyNum(2,4,6,9);
        int expected = 60;
        Assertions.assertNotEquals(expected,result);
    }

    @AfterAll
    public static void mymethod()
    {
        System.out.println("\nrun after all test case");
    }


}
