package com.maximumProblmeUsingGenric;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProblmeTest
{
    MaximumProblme maximumProblme=new MaximumProblme();
    /*Test case for Max Number At First Poistion For Integer*/
    @Test
    public void givenIntegerMaxNumber_WhenAtFirstPoistion_ShouldReturnSameNumber()
    {
        Assert.assertSame(50,maximumProblme.findMaximumNumber(50,20,30));
    }
    /*Test case for Max Number At Second Poistion For Integer*/
    @Test
    public void givenIntegerMaxNumber_WhenAtSecondPoistion_ShouldReturnSameNumber()
    {
        Assert.assertSame(50,maximumProblme.findMaximumNumber(20,50,30));
    }
    /*Test case for Max Number At Third Poistion For Integer*/
    @Test
    public void givenIntegerMaxNumber_WhenAtThirdPoistion_ShouldReturnSameNumber()
    {
        Assert.assertSame(50,maximumProblme.findMaximumNumber(20,30,50));
    }
    /*Test case for Max Number At First Poistion For Float*/
    @Test
    public void givenFloatMaxNumber_WhenAtFirstPoistion_ShouldReturnSameNumber()
    {
        Float Result=maximumProblme.findMaximumNumber(50.4f,20.6f,30.8f);
        Assert.assertEquals(Float.valueOf(50.4f),Result);
    }
    /*Test case for Max Number At Second Poistion For Float*/
    @Test
    public void givenFloatMaxNumber_WhenAtSecondPoistion_ShouldReturnSameNumber()
    {
        Float Result=maximumProblme.findMaximumNumber(20.6f,50.4f,30.8f);
        Assert.assertEquals(Float.valueOf(50.4f),Result);
    }
    /*Test case for Max Number At Third Poistion For Float*/
    @Test
    public void givenFloatMaxNumber_WhenAtThirdPoistion_ShouldReturnSameNumber()
    {
        Float Result=maximumProblme.findMaximumNumber(30.8f,20.6f,50.4f);
        Assert.assertEquals(Float.valueOf(50.4f),Result);
    }


}
