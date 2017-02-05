package com.lasalle.first.part.medialibrary.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;


import com.lasalle.first.part.medialibrary.R;
import com.lasalle.first.part.medialibrary.adapter.AddItemTabLayoutAdapter;

public class AddActivity extends ToolbarAbstractActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_add);


        //TODO: que torni enrere..
        enableToolbarHomebutton();

        TabLayout tabLayout = (TabLayout) findViewById(R.id.activity_add_item_tablayout);
        ViewPager viewPager = (ViewPager) findViewById(R.id.activity_add_item_view_pager);

        viewPager.setAdapter(new AddItemTabLayoutAdapter(getSupportFragmentManager(), this));
        tabLayout.setupWithViewPager(viewPager);

    }
}
