package com.example.android.sunshine.app;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View baseView = inflater.inflate(R.layout.fragment_detail, container, false);
        String forecast = "";
        Intent receiveIntent = getActivity().getIntent();
        if(receiveIntent != null)
        {
            forecast = receiveIntent.getStringExtra(Intent.EXTRA_TEXT);

        }
        TextView forecastView = (TextView)baseView.findViewById(R.id.forecastDetail);
        forecastView.setText(forecast);
        return baseView;

    }
}
