package com.lasalle.first.part.medialibrary;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ToolbarAbstractActivity extends AppCompatActivity {


    protected void onCreate(@Nullable Bundle savedInstanceState, int layoutRecourseId) {
        super.onCreate(savedInstanceState);

        setContentView(layoutRecourseId);

        Toolbar toolbar = (Toolbar) findViewById(R.id.common_toolbar);

        setSupportActionBar(toolbar);

    }

    protected void enableToolbarHomebutton(){
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

