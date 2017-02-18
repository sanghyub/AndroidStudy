package com.example.sangh.criminalintent.database;

/**
 * Created by sangh on 2017-02-18.
 */

public class CrimeDbSchema {
    public static final class CrimeTable{
        public static final String NAME = "crimes";

        public static final class Cols{
            public static final String UUID ="uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED ="solved";
        }

    }
}
