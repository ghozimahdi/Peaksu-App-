package com.go.peaksu.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.go.peaksu.R;

public class PaneuleungActivity extends AppCompatActivity {
    private final String LOCATION_PATH = "Sundanese.ttf";
    private Typeface face;
    private TextView text;
    private TextView text1;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paneuleung);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Paneuleung");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        this.text = (TextView) findViewById(R.id.text1);
        this.face = Typeface.createFromAsset(getAssets(), "Sundanese.ttf");
        this.text.setTypeface(this.face);
        this.text1 = (TextView) findViewById(R.id.text2);
        this.face = Typeface.createFromAsset(getAssets(), "Sundanese.ttf");
        this.text1.setTypeface(this.face);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return false;
    }
}
