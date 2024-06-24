package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AssertionExampkle {
    //Assertion it means validating the result of excepted and actual
    //Assertion is a class present in jupiter.api package

    @Test
    public void TestingMethod()
    {
        System.out.println("Testing SOme Method");
//        int actual =24;
//        int expected = 45;
//        Assertions.assertEquals(expected,actual);

//        int expected[] = {12,34,56,78};
//        int actual[] = {12,34,56,78};
//        Assertions.assertArrayEquals(expected,actual);

//        String name = new String("Rahul");
//        String expexted = new String("Rahul");
//        Assertions.assertSame(expexted,name);             ///....it check the refernce variable is same or not
//         Assertions.assertEquals(expexted,name);   //it check the object value is same or not


        //assertNull(excepted,actual)
        //assertNotNull(excepted,actual)

        //boolean check
//        boolean expected =  true;
//        Assertions.assertTrue(expected);
//      Assertion.assertFalse   for checking false value

        //For COllection Iteration checking
//        List<Integer> list1 = Arrays.asList(1,5,6,7,8,9);
//        List<Integer> list2 = Arrays.asList(1,5,6,7,8,9);
//
//        Assertions.assertIterableEquals(list1,list2);

        //Assertion throw
        Assertions.assertThrows(RuntimeException.class,()->{
            throw new RuntimeException("this is testing exception");
        });

    }
}
