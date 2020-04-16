package com.maximumProblmeUsingGenric;

public class MaximumProblme<T extends Comparable<T>>
{

    public T findMaximum(T data1, T data2, T data3)
    {
        T maximumValue=data1;
        /* Using CompareTo For Maximum Number */
        if (maximumValue.compareTo(data2)<0)
        {
            maximumValue=data2;
        }
        if (maximumValue.compareTo(data3)<0)
        {
            maximumValue=data3;
        }
        return maximumValue;

    }


}
