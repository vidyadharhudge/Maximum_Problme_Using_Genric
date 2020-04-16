package com.maximumProblmeUsingGenric;

public class MaximumProblme
{
    /* Methode For findMaxNumber And Passing Parameter For Integer*/
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
    /* Methode For findMaxNumber And Passing Parameter For Float*/
    public Float findMaximumNumber(Float firstNumber,Float secondNumber,Float thirdNumber)
    {
        Float maximumValue=firstNumber;
        /* Using CompareTo For Maximum Number */
        if (maximumValue.compareTo(secondNumber)<0)
        {
            maximumValue=secondNumber;
        }
        if (maximumValue.compareTo(thirdNumber)<0)
        {
            maximumValue=thirdNumber;
        }
        return maximumValue;
    }

}
