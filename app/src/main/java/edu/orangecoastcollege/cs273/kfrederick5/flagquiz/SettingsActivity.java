package edu.orangecoastcollege.cs273.kfrederick5.flagquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * SettingsActivity is the activity to display a SettingsActivityFragment
 * on a landscape-oriented tablet.
 */
public class SettingsActivity extends AppCompatActivity {
    //infiltrates the GUI, displays Toolbar and adds "up" button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
