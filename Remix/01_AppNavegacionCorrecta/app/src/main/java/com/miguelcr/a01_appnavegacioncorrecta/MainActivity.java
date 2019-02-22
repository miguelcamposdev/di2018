package com.miguelcr.a01_appnavegacioncorrecta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.miguelcr.a01_appnavegacioncorrecta.ui.DashboardActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        events();
    }

    private void events() {
        btnLogin.setOnClickListener(this);
    }

    private void findViews() {
        btnLogin = findViewById(R.id.buttonLogin);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonLogin:
                doLogin();
                break;
        }
    }

    private void doLogin() {
        // ShardPreferences: token, nombre, email,...

        Intent i = new Intent(this, DashboardActivity.class);

        // putExtra

        startActivity(i);
    }
}
