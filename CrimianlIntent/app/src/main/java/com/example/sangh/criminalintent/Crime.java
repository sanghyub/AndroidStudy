package com.example.sangh.criminalintent;

import java.util.UUID;

/**
 * Created by sangh on 2017-02-05.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(){
        mId=UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
