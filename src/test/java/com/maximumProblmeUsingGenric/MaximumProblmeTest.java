package com.maximumProblmeUsingGenric;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProblmeTest
{
    MaximumProblme maximumProblme=new MaximumProblme();

    /*Test case for Max Number At First Poistion*/
    @Test
    public void givenIntegerMaxNumber_WhenAtFirstPoistion_ShouldReturnSameNumber()
    {
        Assert.assertSame(50,maximumProblme.findMaximumNumber(50,20,30));
    }

    /*Test case for Max Number At Second Poistion*/
    @Test
    public void givenIntegerMaxNumber_WhenAtSecondPoistion_ShouldReturnSameNumber()
    {
        Assert.assertSame(50,maximumProblme.findMaximumNumber(20,50,30));
    }

    /*Test case for Max Number At Third Poistion*/
    @Test
    public void givenIntegerMaxNumber_WhenAtThirdPoistion_ShouldReturnSameNumber()
    {
        Assert.assertSame(50,maximumProblme.findMaximumNumber(20,30,50));
    }
}
