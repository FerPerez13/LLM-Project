package com.example.bananasplash.laligamanager;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.ViewManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LeagueHome extends AppCompatActivity {

    private FrameLayout content;
    private LinearLayout home_item;
    private LinearLayout classification_item;
    private LinearLayout results_item;
    private LinearLayout sales_item;
    private LinearLayout draw_item;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        // TODO: Limpiar la pantalla antes de mostrar la siguiente vista del Content

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    getLayoutInflater().inflate(R.layout.home_item, content);
                    return true;
                case R.id.navigation_classification:
                    getLayoutInflater().inflate(R.layout.classification_item, content);
                    return true;
                case R.id.navigation_results:
                    getLayoutInflater().inflate(R.layout.results_item, content);
                    return true;
                case R.id.navigation_sales:
                    getLayoutInflater().inflate(R.layout.sales_item, content);
                    return true;
                case R.id.navigation_draw:
                    getLayoutInflater().inflate(R.layout.draw_item, content);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_league_home);

        content = (FrameLayout) findViewById(R.id.content);
        home_item = (LinearLayout) findViewById(R.id.home_item);
        classification_item = (LinearLayout) findViewById(R.id.classification_item);
        results_item = (LinearLayout) findViewById(R.id.results_item);
        sales_item = (LinearLayout) findViewById(R.id.sales_item);
        draw_item = (LinearLayout) findViewById(R.id.draw_item);

        getLayoutInflater().inflate(R.layout.home_item, content);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
