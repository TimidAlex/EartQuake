/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<EarthQuake>  earthquakes = new ArrayList<EarthQuake>();
        earthquakes.add(new EarthQuake("San Francisco", "5.1", "10-03-2016"));
        earthquakes.add(new EarthQuake("London", "3.1", "12-05-2017"));
        earthquakes.add(new EarthQuake("Tokyo", "6.0", "11-11-11"));
        earthquakes.add(new EarthQuake("Mexico City","4.1", "10-09-12"));
        earthquakes.add(new EarthQuake("Moscow", "2.1", "05-05-2005"));
        earthquakes.add(new EarthQuake("Rio de Janeiro","5.0", "03-03-2003"));
        earthquakes.add(new EarthQuake("Paris", "3.3", "03-05-2013"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);


        EarthQuakeAdapter adapter = new EarthQuakeAdapter(this, earthquakes);


        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }


}
