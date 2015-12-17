package com.example.android.sunshine.app;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);
        Activity activity = getActivity();
        if(activity.getIntent() != null && activity.getIntent().getExtras() != null){
            String data = getActivity().getIntent().getExtras().getString(Intent.EXTRA_TEXT);
            TextView textview = (TextView) rootView.findViewById(R.id.detail_text);
            textview.setText(data);
        }else{
            Toast.makeText(getActivity(),"error reading data",Toast.LENGTH_SHORT).show();
        }
        return rootView;
    }
}
