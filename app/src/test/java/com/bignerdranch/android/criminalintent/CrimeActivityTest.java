package com.bignerdranch.android.criminalintent;

import android.os.Build;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Hayley on 11/23/15.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.KITKAT)
public class CrimeActivityTest {
    private CrimeActivity mCrimeActivity;

    @Before
    public void setUp() throws Exception {
        ActivityController<CrimeActivity> mActivityController =
                Robolectric.buildActivity(CrimeActivity.class);
        mActivityController.create().start().resume().visible();
        mCrimeActivity = mActivityController.get();
    }

    @Test
    public void shouldHaveTitleField() throws Exception {
        EditText titleField = (EditText) mCrimeActivity.findViewById(R.id.crime_title);
        Assert.assertNotNull(titleField);
    }

    @Test
    public void shouldHaveDateButtonWithCorrectDate() throws Exception {
        Button dateButton = (Button) mCrimeActivity.findViewById(R.id.crime_date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, MMM d", Locale.US);
        String formattedDate = simpleDateFormat.format(new Date());

        Assert.assertNotNull(dateButton);
        Assert.assertEquals(formattedDate, dateButton.getText());
        Assert.assertFalse(dateButton.isEnabled());
    }

    @Test
    public void shouldHaveSolvedCheckbox() throws Exception {
        CheckBox solvedCheckbox = (CheckBox) mCrimeActivity.findViewById(R.id.crime_solved);
        Assert.assertNotNull(solvedCheckbox);
    }
}
