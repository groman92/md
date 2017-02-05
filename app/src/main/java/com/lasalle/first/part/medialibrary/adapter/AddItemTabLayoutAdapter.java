package com.lasalle.first.part.medialibrary.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;

import com.lasalle.first.part.medialibrary.fragment.AddMovieFragment;
import com.lasalle.first.part.medialibrary.fragment.AddTvshowFragment;

public class AddItemTabLayoutAdapter extends FragmentPagerAdapter {

    private final static int TV_SHOWS_TAB_POSITION = 0;
    private final static int MOVIE_TAB_POSITION = 1;
    private final static int NUMBER_OF_TABS = 2;

    private AppCompatActivity activity;

    public AddItemTabLayoutAdapter(FragmentManager fm, AppCompatActivity owner) {
        super(fm);
        //
        this.activity = owner;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == TV_SHOWS_TAB_POSITION)
        {
            return AddTvshowFragment.newInstance();
        }
        else if(position == MOVIE_TAB_POSITION)
        {
            return AddMovieFragment.newInstance();
        }
        throw new RuntimeException("Tab not found");
    }

    @Override
    public int getCount() {
        return NUMBER_OF_TABS;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == TV_SHOWS_TAB_POSITION)
        {
            return "TV SHOW";
        }
        else if(position == MOVIE_TAB_POSITION)
        {
            return "MOVIES";
        }

        return super.getPageTitle(position);
    }
}
