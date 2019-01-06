package com.example.rebb.streats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;


public class Espana extends AppCompatActivity {

    private Button shakeysMap;
    private Button shakeysMenu;
    private Button amoMap;
    private Button amoMenu;
    private Button jolliMap;
    private Button jolliMenu;
    public RatingBar rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espana);

        rate = (RatingBar) findViewById(R.id.ratingBar);

        shakeysMap = (Button) findViewById(R.id.button1);
        shakeysMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShakeysMap(view);
            }
        });

        shakeysMenu = (Button) findViewById(R.id.button2);
        shakeysMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShakeysMenu(view);
            }
        });

        amoMap = (Button) findViewById(R.id.button4);
        amoMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAmoMap(view);
            }
        });

        amoMenu = (Button) findViewById(R.id.button);
        amoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAmoMenu(view);
            }
        });

        jolliMap = (Button) findViewById(R.id.button3);
        jolliMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJolliMap(view);
            }
        });

        jolliMenu = (Button) findViewById(R.id.button5);
        jolliMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJolliMenu(view);
            }
        });
    }

    public void openShakeysMap (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button1) {
            Uri gmmIntentUri = Uri.parse("geo:14.6079,120.9908?z=18");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
    }

    public void openShakeysMenu (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button2) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.zomato.com/manila/shakeys-bonifacio-global-city-taguig-city/menu"));
            startActivity(intent);
        }
    }

    public void openAmoMap (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button4) {
            Uri gmmIntentUri = Uri.parse("geo:14.6068,120.9897?z=18");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
    }

    public void openAmoMenu (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.zomato.com/manila/amo-yamie-crib-coffee-quiapo-manila/menu"));
            startActivity(intent);
        }
    }

    public void openJolliMap (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button3) {
            Uri gmmIntentUri = Uri.parse("geo:14.6082,120.9914?z=18");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
    }

    public void openJolliMenu (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button5) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.zomato.com/manila/jollibee-intramuros-manila/menu"));
            startActivity(intent);
        }
    }

    public void rateMe(View view){

        Toast.makeText(getApplicationContext(),
                String.valueOf(rate.getRating()), Toast.LENGTH_LONG).show();
    }
}
