package com.example.rebb.streats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    private Button espana;
    private Button dapitan;
    private Button lacson;
    private Button noval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        espana = (Button) findViewById(R.id.espana);
        espana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEspana();
            }
        });

        dapitan = (Button) findViewById(R.id.dapitan);
        dapitan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDapitan();
            }
        });

        lacson = (Button) findViewById(R.id.lacson);
        lacson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                openLacson();
            }
        });

        noval = (Button) findViewById(R.id.noval);
        noval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                openNoval();
            }
        });
    }

    public void openEspana() {
        Intent espanaIntent = new Intent(this, Espana.class);
        startActivity(espanaIntent);
    }

    public void openDapitan() {
        Intent dapitanIntent = new Intent(this, Dapitan.class);
        startActivity(dapitanIntent);
    }

    public void openLacson() {
        Intent lacsonIntent = new Intent(this, Lacson.class);
        startActivity(lacsonIntent);
    }

    public void openNoval() {
        Intent novalIntent = new Intent(this, Noval.class);
        startActivity(novalIntent);
    }
}
