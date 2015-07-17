package com.bignerdranch.android.criminalintent;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

/**
 * Created by Brian Casteel on 7/16/2015.
 */
public class DatePickerFragment extends android.support.v4.app.DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                .setTitle(R.string.date_picker_title)
                .setPositiveButton(android.R.string.ok, null)
                .create();
    }
}
