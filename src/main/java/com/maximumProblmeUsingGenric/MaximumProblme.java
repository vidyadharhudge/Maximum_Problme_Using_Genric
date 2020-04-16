package com.maximumProblmeUsingGenric;

public class MaximumProblme
{
    /* Methode For findMaxNumber And Passing Parameter For Integer*/
    public Integer findMaximumNumber(Integer firstNumber,Integer secondNumber,Integer thirdNumber)
    {
        Integer maximumValue=firstNumber;
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
    /* Methode For findMaxString And Passing Parameter For String*/
    public String findMaximumString(String firstString,String secondString,String thirdString)
    {
        String maximumValue=firstString;
        /* Using CompareTo For Maximum String */
        if (maximumValue.compareTo(secondString)<0)
        {
            maximumValue=secondString;
        }
        if (maximumValue.compareTo(thirdString)<0)
        {
            maximumValue=thirdString;
        }
        return maximumValue;
    }

}
