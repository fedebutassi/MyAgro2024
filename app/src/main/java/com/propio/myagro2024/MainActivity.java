package com.propio.myagro2024;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Fix the typo
        Button botonIngresar = findViewById(R.id.button);


        botonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irAPantallaInicio(); // Call the method to navigate to the new screen
            }
        });

        // New Button Functionality
        Button botonForgotPass = findViewById(R.id.button3);
        botonForgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irAForgotPassword(); // Call the method to navigate to forgot password screen
            }
        });

        Button botonRegistro = findViewById(R.id.button2);
        botonRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irRegistro(); // Call the method to navigate to forgot password screen
            }
        });
    }


    public void irAPantallaInicio() {
        Intent intent = new Intent(this, barranavegacion.class);
        startActivity(intent);
    }

    public void irRegistro(){
        Intent intent = new Intent(this,formRegistro.class);
        startActivity(intent);
    }
    public void irAForgotPassword() {
        Intent intent = new Intent(this, forgotPassword.class);
        startActivity(intent);
    }


}