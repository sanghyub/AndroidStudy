package com.example.sangh.geoquiz;

/**
 * Created by sangh on 2017-02-02.
 */

public class Question {
    private int mTextResId;
    private boolean True;

    public Question(int textResId, boolean aTrue) {
        mTextResId = textResId;
        True = aTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return True;
    }

    public void setTrue(boolean aTrue) {
        True = aTrue;
    }
}
