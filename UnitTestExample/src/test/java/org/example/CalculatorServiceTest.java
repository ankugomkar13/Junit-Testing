//package org.example;
//
//import org.junit.*;
//
//public class CalculatorServiceTest {
//
//
//    @BeforeClass
//    public static void mymethod()
//    {
//        System.out.println("This method is excuted before the test case");
//    }
//
////test the test cases
//    @Test
//    public void addTwoNumTest()
//    {
//        int result = CalculatorService.addTwoNum(12,45);
//        int expected = 60;
//        Assert.assertNotEquals(expected,result);
//    }
//
//    @Test
//    public void sumAnyNumTest(){
//        int result = CalculatorService.sumAnyNum(2,4,6,9);
//        int expected = 60;
//        Assert.assertNotEquals(expected,result);
//    }
//
//    @AfterClass
//    public static void cleanup()
//    {
//        System.out.println("This method is excuted After the test case");
//    }
//
//    @Before
//    public void beforeEachTestCase()
//    {
//        System.out.println("This method is excuted before each test case");
//    }
//
//}
