package com.example.sangh.criminalintent.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.example.sangh.criminalintent.Crime;

import java.util.Date;
import java.util.UUID;

import static com.example.sangh.criminalintent.database.CrimeDbSchema.*;

/**
 * Created by sangh on 2017-02-18.
 */

public class CrimeCursorWrapper extends CursorWrapper{
    public CrimeCursorWrapper(Cursor cursor){
        super(cursor);
    }

    public Crime getCrime(){
        String uuidString =getString(getColumnIndex(CrimeTable.Cols.UUID));
        String title = getString(getColumnIndex(CrimeTable.Cols.TITLE));
        long date = getLong(getColumnIndex(CrimeTable.Cols.SOLVED));
        int isSolved = getInt(getColumnIndex(CrimeTable.Cols.SOLVED));

        Crime crime = new Crime(UUID.fromString(uuidString));
        crime.setTitle(title);
        crime.setDate(new Date(date));
        crime.setSolved(isSolved!=0);

        return crime;
    }
}
