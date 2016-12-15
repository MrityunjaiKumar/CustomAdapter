package com.mrityunjai.adapter.custom.customadapter;

/**
 * Created by iota on 12/15/2016.
 */

public class AndroidFlavor {

    private String mVersionName;

    private String mVersionNumber;

    private int mImageResourceId;

    public AndroidFlavor(String vName, String vNumber, int imageResourceId) {
        mVersionNumber = vNumber;
        mVersionName = vName;
        mImageResourceId = imageResourceId;
    }

    public String getVersionName() {
        return mVersionName;
    }

    public String getVersionNumber() {
        return mVersionNumber;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
