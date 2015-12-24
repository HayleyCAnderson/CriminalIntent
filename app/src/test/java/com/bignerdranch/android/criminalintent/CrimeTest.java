package com.bignerdranch.android.criminalintent;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Hayley on 11/23/15.
 */
public class CrimeTest {
    private Crime mCrime;

    @Before
    public void setUp() throws Exception {
        mCrime = new Crime();
    }

    @Test
    public void shouldReturnId() throws Exception {
        Assert.assertNotNull(mCrime.getId());
    }

    @Test
    public void shouldReturnCorrectTitle() throws Exception {
        String crimeTitle = "Mess in kitchen";
        mCrime.setTitle(crimeTitle);
        Assert.assertEquals(crimeTitle, mCrime.getTitle());
    }

    @Test
    public void shouldReturnCorrectDefaultDate() throws Exception {
        Date crimeDate = new Date();
        Assert.assertEquals(crimeDate, mCrime.getDate());
    }

    @Test
    public void shouldReturnCorrectSetDate() throws Exception {
        Date crimeDate = new Date(2015, 12, 12);
        mCrime.setDate(crimeDate);
        Assert.assertEquals(crimeDate, mCrime.getDate());
    }

    @Test
    public void shouldReturnCorrectSolvedBoolean() throws Exception {
        mCrime.setSolved(true);
        Assert.assertEquals(true, mCrime.isSolved());
    }
}
