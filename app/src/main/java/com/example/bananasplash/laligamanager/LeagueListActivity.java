package com.example.bananasplash.laligamanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bananasplash.laligamanager.agregates.League;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LeagueListActivity extends AppCompatActivity {

    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference ref = database.getReference("leagues");

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Read the database
        League league = new League();

        //ref.addListenerForSingleValueEvent();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_league_list);

        //TODO: Hay que leer la BBDD crear un boton con cada uno de las ligas en las que se perticipa

        // SELECCIONAR LIGA Y PASAR AL MENÚ DE LA LIGA
        Button ligaButton = (Button)findViewById(R.id.ligaButton);
        ligaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LeagueListActivity.this, LeagueHome.class);
                startActivity(intent);
            }
        });

    }
}
