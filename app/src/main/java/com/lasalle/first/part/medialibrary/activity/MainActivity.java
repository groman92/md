package com.lasalle.first.part.medialibrary.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lasalle.first.part.medialibrary.R;

public class MainActivity extends ToolbarAbstractActivity implements View.OnClickListener{

    private Button addButton;
    private Button listButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_main);

        enableToolbarHomebutton();

        addButton = (Button) findViewById(R.id.addButton);
        listButton = (Button) findViewById(R.id.listButton);

        addButton.setOnClickListener(this);
        listButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == addButton.getId())
        {
            Intent intent = new Intent(this, AddActivity.class);
            startActivity(intent);
        }
    }
}
