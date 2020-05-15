package com.maximumProblmeUsingGenric;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProblmeTest
{
   /* Testing Integer Value For Maximum */
    @Test
    public void givenIntegerMaxNumber_WhenAtFirstPoistion_ThenShouldReturnExpectedNumber()
    {
       Integer expected = 50;
       MaximumProblme<Integer> maximumInteger = new MaximumProblme<Integer>(50, 20, 30);
       Assert.assertEquals(expected,maximumInteger.output);
    }
    /* Testing Integer Value For Maximum */
    @Test
    public void givenIntegerMaxNumber_WhenAtSecondPoistion_ThenShouldReturnExpectedNumber()
    {
        Integer expected = 50;
        MaximumProblme<Integer> maximumInteger = new MaximumProblme<Integer>(20, 50, 30);
        Assert.assertEquals(expected,maximumInteger.output);
    }

    /* Testing Integer Value For Maximum */
    @Test
    public void givenIntegerMaxNumber_WhenAtThirdPoistion_ThenShouldReturnExpectedNumber()
    {
        Integer expected = 50;
        MaximumProblme<Integer> maximumInteger = new MaximumProblme<Integer>(20, 30, 50);
        Assert.assertEquals(expected,maximumInteger.output);
    }
    /* Testing Float Value For Maximum */
    @Test
    public void givenFloatMaxNumber_WhenAtFirstPoistion_ThenShouldReturnExpectedNumber()
    {
        Float expected = 50.4f;
        MaximumProblme<Float> maximumFloat = new MaximumProblme<Float>(50.4f,20.6f,30.8f);
        Assert.assertEquals(expected,maximumFloat.output);
    }
    /* Testing Float Value For Maximum */
    @Test
    public void givenFloatMaxNumber_WhenAtSecondPoistion_ThenShouldReturnExpectedNumber()
    {
        Float expected = 50.4f;
        MaximumProblme<Float> maximumFloat = new MaximumProblme<Float>(20.6f,50.4f,30.8f);
        Assert.assertEquals(expected,maximumFloat.output);
    }
    /* Testing Float Value For Maximum */
    @Test
    public void givenFloatMaxNumber_WhenAtThirdPoistion_ThenShouldReturnExpectedNumber()
    {
        Float expected = 50.4f;
        MaximumProblme<Float> maximumFloat = new MaximumProblme<Float>(20.6f,30.8f,50.4f);
        Assert.assertEquals(expected,maximumFloat.output);
    }
    /* Testing String and find For Maximum String */
    @Test
    public void givenStringMaxString_WhenAtFirstPoistion_ThenShouldReturnExpectedString()
    {
        String expected = "xyz";
        MaximumProblme<String>maximumString = new MaximumProblme<String>("xyz","mno","abc");
        Assert.assertEquals(expected,maximumString.output);
    }
    /* Testing String and find For Maximum String */
    @Test
    public void givenStringMaxString_WhenAtSecondPoistion_ThenShouldReturnExpectedString()
    {
        String expected = "xyz";
        MaximumProblme<String>maximumString = new MaximumProblme<String>("abc","xyz","mno");
        Assert.assertEquals(expected,maximumString.output);
    }
    /* Testing String and find For Maximum String */
    @Test
    public void givenStringMaxString_WhenAtAnyPoistion_ThenShouldReturnExpectedString()
    {
        String expected = "xyz";
        MaximumProblme<String>maximumString = new MaximumProblme<String>("abc","mno","xyz");
        Assert.assertEquals(expected,maximumString.output);
    }


}