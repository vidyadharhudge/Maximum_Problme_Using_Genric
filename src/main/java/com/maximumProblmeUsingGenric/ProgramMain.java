package com.maximumProblmeUsingGenric;

public class ProgramMain
{
    /* Main Methode */
    public static void main(String[] args)
    {
        System.out.println("Welcome To Maximum Program Using Genric");
        MaximumProblme<Integer> maximumInteger = new MaximumProblme<Integer>(50, 20, 30);
        MaximumProblme<Float> maximumFloat = new MaximumProblme<Float>(50.4f,20.6f,30.8f);
        MaximumProblme<String> maximumString = new MaximumProblme<String>("abc","mno","xyz");

    }
}
