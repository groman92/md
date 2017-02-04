package com.lasalle.first.part.medialibrary.activity;

import android.os.Bundle;

import com.lasalle.first.part.medialibrary.R;

public class AddActivity extends ToolbarAbstractActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_add);

        //Com és crida? on és fa el onCreate?
        enableToolbarHomebutton();
    }
}
