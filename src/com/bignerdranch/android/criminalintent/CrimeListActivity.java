package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;


/**
 * Created by Brian Casteel on 7/3/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
