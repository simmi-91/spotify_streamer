package com.elinsimenstad.spotify_streamer;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // fetch data to print out
        String[] data = {
                "Mon 6/23 - Sunny - 31/17",
                "Tue 6/24 - Foggy - 21/8",
                "Wed 6/25 - Cloudy - 22/17",
                "Thurs 6/26 - Rainy - 18/11",
                "Fri 6/27 - Foggy - 21/10",
                "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
                "Sun 6/29 - Sunny - 20/7"
        };
        List<String> weekForecast = new ArrayList<>( Arrays.asList(data) );

        //ArrayAdapter<String> test = getActivity(). //(R.layout.list_item, R.id.list_item_textview, weekForecast);0
        ArrayAdapter<String> mListAdapter =
                new ArrayAdapter<>(
                    // the current context
                    getActivity(),
                    // ID of the list item layout
                    R.layout.list_item,
                    // ID of the textview to populate
                    R.id.list_item_textview,
                    // data
                    data);
        // find listview and set to adapter
        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mListAdapter);

        return rootView;
    }
}

