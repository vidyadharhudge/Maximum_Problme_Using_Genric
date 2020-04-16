package com.maximumProblmeUsingGenric;

public class ProgramMain
{
    /* Main Methode */
    public static void main(String[] args)
    {
        System.out.println("Welcome To Maximum Program Using Genric");
        /* To Create Instance Of Genric Class */
        MaximumProblme<Integer> maximumInteger = new MaximumProblme<Integer>();
        /* Generic parameterised method calling */
        maximumInteger.findMaximum(50, 20, 30);
        /* To Create Instance Of Genric Class */
        MaximumProblme<Float> maximumFloat = new MaximumProblme<Float>();
        /* Generic parameterised method calling */
        maximumFloat.findMaximum(50.4f,20.6f,30.8f);
        /* To Create Instance Of Genric Class */
        MaximumProblme<String> maximumString = new MaximumProblme<String>();
        /* Generic parameterised method calling */
        maximumString.findMaximum("abc","mno","xyz");

    }
}
