package com.visionstech.listview;


class People {
    private String mFirstname;
    private String mLastname;
    private int imageResourceId = NO_IMAGE_RESOURCE;
    private static final int NO_IMAGE_RESOURCE = -1;

    public People(String mFirstname, String mLastname, int imageResourceId) {
        this.mFirstname = mFirstname;
        this.mLastname = mLastname;
        this.imageResourceId = imageResourceId;
    }

    public People(String mFirstname, String mLastname) {
        this.mFirstname = mFirstname;
        this.mLastname = mLastname;
    }

    public String getmFirstname() {
        return mFirstname;
    }

    public String getmLastname() {
        return mLastname;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public Boolean hasImage(){
        return imageResourceId != NO_IMAGE_RESOURCE;
    }
}
