package com.example.bananasplash.laligamanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        // LOGIN CON CORREO Y CONTRASEÑA
        Button confirmationButton = (Button)findViewById(R.id.confirmation);
        confirmationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: Leer los datos y confirmar que coinciden las contraseñas y insertar en BBDD
                finish();
            }
        });

        // CANCELAR Y CERRAR VENTANA
        Button cancelButton = (Button)findViewById(R.id.cancel);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
