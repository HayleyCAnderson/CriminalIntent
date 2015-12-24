package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by handerson on 11/10/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
