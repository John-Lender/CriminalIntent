package com.bignerdranch.android.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

public class MainActivity extends SingleFragmentActivity {

    private static final String EXTRA_CRIME_ID = "com.bignerdranch.android.criminalintent.crime_id";

    public static Intent newIntent(Context packegeContext, UUID id){
        Intent intent = new Intent(packegeContext, MainActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, id);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        UUID id = (UUID)getIntent().getSerializableExtra(EXTRA_CRIME_ID);
        return CrimeFragment.newInstance(id);
    }
}
