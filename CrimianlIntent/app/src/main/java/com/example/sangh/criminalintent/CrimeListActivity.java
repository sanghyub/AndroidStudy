package com.example.sangh.criminalintent;

import android.support.v4.app.Fragment;
import android.test.SingleLaunchActivityTestCase;

/**
 * Created by sangh on 2017-02-07.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
