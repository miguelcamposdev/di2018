package com.miguelst.a02_linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnLogin, btnRegister;
    EditText etEmail, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // La siguiente línea debéis tatuarla en
        // vuestro brazo o haceros una camiseta con ella
        // o poner un vinilo en el espejo del cuarto de baño
        // para verla todas las mañanas y cuando yo la vuelva
        // a escribir no se os quede la cara de tonto.
        btnLogin = findViewById(R.id.buttonLogin);
        btnRegister = findViewById(R.id.buttonRegister);
        etEmail = findViewById(R.id.editTextEmail);
        etPassword = findViewById(R.id.editTextPassword);

        // Cambio el texto del botón
        btnLogin.setText("Iniciar sesión");

        // Declaración del método click sobre el botón
        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);

        // Ocultar el toolbar en esta pantalla
        getSupportActionBar().hide();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if(id == R.id.buttonLogin) {
            String email = etEmail.getText().toString();
            String password = etPassword.getText().toString();

            if(email.equals("admin@admin.com")
                    && password.equals("1234")) {
                Toast.makeText(this, "Login OK ;)", Toast.LENGTH_LONG).show();

                // Como el login ha sido correcto, reseteo los EditText de email y password
                etEmail.setText("");
                etPassword.setText("");
            } else {
                etEmail.setError("Email y/o contraseña incorrecto");
            }
        } else {
            // Cualquier botón que no sea el Login.
        }

    }
}
