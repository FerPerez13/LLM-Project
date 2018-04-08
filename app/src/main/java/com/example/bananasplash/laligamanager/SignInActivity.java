package com.example.bananasplash.laligamanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bananasplash.laligamanager.agregates.User;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignInActivity extends AppCompatActivity {

    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference ref = database.getReference("users");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Button confirmationButton = findViewById(R.id.confirmation);

        confirmationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText email = findViewById(R.id.newMail);
                EditText user = findViewById(R.id.newUser);
                EditText pass = findViewById(R.id.newPassword);
                EditText pass2 = findViewById(R.id.rNewPassword);

                String emailText = email.getText().toString();
                String userText = user.getText().toString();
                String passText = pass.getText().toString();
                String pass2Text = pass2.getText().toString();

                if(passText.equals(pass2Text)) {
                    User user1  = new User(userText, emailText, passText);
                    ref.child(userText).setValue(user1);
                    Toast.makeText(SignInActivity.this, "Usuario creado correctamente", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    Toast.makeText(SignInActivity.this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
                }
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
