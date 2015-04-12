package com.noptech.android.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ForecastFragment extends Fragment {

    public ForecastFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        List<String> entries = new ArrayList<String>();
        entries.add("Today - Sunny - 10/15");
        entries.add("Tomorrow - Sunny - 10/15");
        entries.add("Thursday - Sunny - 10/15");
        entries.add("Friday - Sunny - 10/15");
        entries.add("Saturday - Sunny - 10/15");
        entries.add("Sunday - Sunny - 10/15");
        entries.add("Monday - Sunny - 10/15");
        entries.add("Tuesday - Sunny - 10/15");
        entries.add("Wednesday - Sunny - 10/15");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, entries);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(adapter);


        return rootView;
    }
}