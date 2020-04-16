package com.maximumProblmeUsingGenric;

public class MaximumProblme
{
    /* Methode For findMaxNumber And Passing Parameter*/
    public Integer findMaximumNumber(Integer firstNumber,Integer secondNumber,Integer thirdNumber)
    {
        Integer maximum=firstNumber;
        /* Using CompareTo For Maximum Number */
        if (maximum.compareTo(secondNumber)<0)
        {
            maximum=secondNumber;
        }
        if (maximum.compareTo(thirdNumber)<0)
        {
            maximum=thirdNumber;
        }
        return maximum;
    }
}
