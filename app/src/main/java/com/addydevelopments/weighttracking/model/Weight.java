package com.addydevelopments.weighttracking.model;

import java.util.Date;

public class Weight {

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public double getmWeight() {
        return mWeight;
    }

    public void setmWeight(double mWeight) {
        this.mWeight = mWeight;
    }

    //Weight attributes
    private Date mDate;
    private double mWeight;

    public Weight(Date date, double weight) {
        mDate = date;
        mWeight = weight;
    }




}
