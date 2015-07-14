package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Brian Casteel on 6/24/2015.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    private Date mDate;
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    @Override
    public String toString() {
        return mTitle;
    }

    public String getTitle() {
        return mTitle;
    }

    public UUID getId() {
        return mId;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
