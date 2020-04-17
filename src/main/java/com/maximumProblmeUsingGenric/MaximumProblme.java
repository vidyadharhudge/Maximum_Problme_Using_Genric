package com.maximumProblmeUsingGenric;
import java.util.Arrays;
import java.util.Collections;

public class MaximumProblme<T extends Comparable<T>>
{
    public T output;
    private T data1;
    private T data2;
    private T data3;
    /* Parameterized Constructor */
    public MaximumProblme(T data1, T data2, T data3)
    {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        output=findMaximum(data1, data2, data3);
    }
    /* Print The Maximum Value Among Three Value */
    public static <T extends Comparable<T>> T findMaximum(T data1, T data2, T data3, T... optionalArguments)
    {
        T maximumValue=data1;
        /* Using CompareTo For Maximum Among Two Number */
        if (maximumValue.compareTo(data2)<0)
        {
            maximumValue=data2;
        }
        if (maximumValue.compareTo(data3)<0)
        {
            maximumValue=data3;
        }
        /* Sorting Logic */
        if (optionalArguments.length!=0)
        {
            Arrays.sort(optionalArguments);
            if (maximumValue.compareTo(optionalArguments[0])<0)
            {
                maximumValue=optionalArguments[0];
            }
        }
        printMaximum(maximumValue);
        return maximumValue;
    }
    /* Print The Maximum Value Of Integer,Float,String */
    public static<T extends Comparable<T>> void printMaximum(T maximumValue)
    {
        System.out.println("Maximum value is : " +maximumValue);
    }
}
