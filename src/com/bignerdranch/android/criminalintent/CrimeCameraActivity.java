package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by BR026CA on 11/16/2015.
 */
public class CrimeCameraActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeCameraFragment();
    }
}
