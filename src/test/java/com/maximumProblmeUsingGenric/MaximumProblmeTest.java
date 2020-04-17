package com.maximumProblmeUsingGenric;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProblmeTest
{
   /* Testing Integer Value For Maximum */
    @Test
    public void maximumTestForInteger()
    {
        Integer expected = 50;
        MaximumProblme<Integer> maximumInteger = new MaximumProblme<Integer>(20, 50, 30);
        Assert.assertEquals(expected,maximumInteger.output);

    }
    /* Testing Float Value For Maximum */
    @Test
    public void maximumTestForFloat()
    {
        Float expected = 50.4f;
        MaximumProblme<Float> maximumFloat = new MaximumProblme<Float>(50.4f,20.6f,30.8f);
        Assert.assertEquals(expected,maximumFloat.output);

    }
    /* Testing String and find For Maximum String */
      @Test
    public void maximumTestForString()
    {
        String expected = "xyz";
        MaximumProblme<String>maximumString = new MaximumProblme<String>("abc","mno","xyz");
        Assert.assertEquals(expected,maximumString.output);

    }

}