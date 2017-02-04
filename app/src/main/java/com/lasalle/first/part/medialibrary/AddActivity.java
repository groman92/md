package com.lasalle.first.part.medialibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AddActivity extends ToolbarAbstractActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_add);

        //Com és crida? on és fa el onCreate?
        enableToolbarHomebutton();
    }
}
