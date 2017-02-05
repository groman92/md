package com.lasalle.first.part.medialibrary.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lasalle.first.part.medialibrary.R;



public class AddTvshowFragment extends Fragment {


    public AddTvshowFragment() {
        // Required empty public constructor
    }

    public static AddTvshowFragment newInstance() {

        AddTvshowFragment fragment = new AddTvshowFragment();

        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_tvshow, container, false);
    }



}
