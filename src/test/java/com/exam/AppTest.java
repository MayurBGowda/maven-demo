package com.exam;

import org.junit.Test;
import org.junit.Assert;

public class AppTest 
{
    @Test   // ✅ THIS WAS MISSING
    public void testApp()
    {
        Assert.assertEquals(11, App.add(5,6));
    }
}
