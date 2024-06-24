package org.example;

public class CalculatorService {
    public static int addTwoNum(int a,int b)
    {
        return a+b;
    }
    public static int product(int a,int b)
    {
        return a*b;
    }
    public static float divide(int a,int b)
    {
        return a/b;
    }
    public static int sumAnyNum(int... number)
    {
        int s = 0;
        for(int n:number)
        {
            s+=n;
        }
        return s;
    }

}
