package com.maximumProblmeUsingGenric;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProblmeTest
{
    /*Test case for Max Number At First Poistion For Integer*/
    /// maximumInteger as object of MaximumProblme class
    /// parameterised findMaximum method is called
    /// Compared Result value to expected vaule
    @Test
    public void givenIntegerMaxNumber_WhenAtFirstPoistion_ShouldReturnSameNumber()
    {
        MaximumProblme<Integer> maximumInteger = new MaximumProblme<Integer>();
        Integer Result=maximumInteger.findMaximum(50,20,30);
        Assert.assertEquals(Integer.valueOf(50),Result);
    }
    /*Test case for Max Number At Second Poistion For Integer*/
    @Test
    public void givenIntegerMaxNumber_WhenAtSecondPoistion_ShouldReturnSameNumber()
    {
        MaximumProblme<Integer> maximumInteger = new MaximumProblme<Integer>();
        Integer Result=maximumInteger.findMaximum(20,50,30);
        Assert.assertEquals(Integer.valueOf(50),Result);
    }
    /*Test case for Max Number At Third Poistion For Integer*/
    @Test
    public void givenIntegerMaxNumber_WhenAtThirdPoistion_ShouldReturnSameNumber()
    {
        MaximumProblme<Integer> maximumInteger = new MaximumProblme<Integer>();
        Integer Result=maximumInteger.findMaximum(30,20,50);
        Assert.assertEquals(Integer.valueOf(50),Result);
    }

    /*Test case for Max Number At First Poistion For Float*/
    /// maximumInteger as object of MaximumProblme class
    /// parameterised findMaximum method is called
    /// Compared Result value to expected vaule
    @Test
    public void givenFloatMaxNumber_WhenAtFirstPoistion_ShouldReturnSameNumber()
    {
        MaximumProblme<Float> maximumFloat = new MaximumProblme<Float>();
        Float Result=maximumFloat.findMaximum(50.4f,20.6f,30.8f);
        Assert.assertEquals(Float.valueOf(50.4f),Result);
    }
    /*Test case for Max Number At Second Poistion For Float*/
    @Test
    public void givenFloatMaxNumber_WhenAtSecondPoistion_ShouldReturnSameNumber()
    {
        MaximumProblme<Float> maximumFloat = new MaximumProblme<Float>();
        Float Result=maximumFloat.findMaximum(20.6f,50.4f,30.8f);
        Assert.assertEquals(Float.valueOf(50.4f),Result);
    }
    /*Test case for Max Number At Third Poistion For Float*/
    @Test
    public void givenFloatMaxNumber_WhenAtThirdPoistion_ShouldReturnSameNumber()
    {
        MaximumProblme<Float> maximumFloat = new MaximumProblme<Float>();
        Float Result=maximumFloat.findMaximum(30.8f,20.6f,50.4f);
        Assert.assertEquals(Float.valueOf(50.4f),Result);
    }

    /*Test case for Max Number At First Poistion For String*/
    /// maximumInteger as object of MaximumProblme class
    /// parameterised findMaximum method is called
    /// Compared Result value to expected vaule
    @Test
    public void givenStringMaxString_WhenAtFirstPoistion_ShouldReturnSameString()
    {
        MaximumProblme<String> maximumString = new MaximumProblme<String>();
        String Result =maximumString.findMaximum("xyz","mno","abc");
        Assert.assertEquals("xyz",Result);
    }
    /*Test case for Max Number At Second Poistion For String*/
    @Test
    public void givenStringMaxString_WhenAtSecondPoistion_ShouldReturnSameString()
    {
        MaximumProblme<String> maximumString = new MaximumProblme<String>();
        String Result =maximumString.findMaximum("mno","xyz","abc");
        Assert.assertEquals("xyz",Result);
    }
    /*Test case for Max Number At Second Poistion For String*/
    @Test
    public void givenStringMaxString_WhenAtThirdPoistion_ShouldReturnSameString()
    {
        MaximumProblme<String> maximumString = new MaximumProblme<String>();
        String Result =maximumString.findMaximum("mno","abc","xyz");
        Assert.assertEquals("xyz",Result);
    }

}