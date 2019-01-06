package com.example.rebb.streats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import java.util.Map;


public class Dapitan extends AppCompatActivity {

    private Button dimsumMap;
    private Button dimsumMenu;
    private Button kfcMap;
    private Button kfcMenu;
    private Button jolliMap;
    private Button jolliMenu;
    public RatingBar rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dapitan);

        rate = (RatingBar) findViewById(R.id.ratingBar7);

        dimsumMap = (Button) findViewById(R.id.button13);
        dimsumMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDimsumMap(view);
            }
        });

        dimsumMenu = (Button) findViewById(R.id.button12);
        dimsumMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDimsumMenu(view);
            }
        });

        kfcMap = (Button) findViewById(R.id.button15);
        kfcMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKfcMap(view);
            }
        });

        kfcMenu = (Button) findViewById(R.id.button14);
        kfcMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKfcMenu(view);
            }
        });

        jolliMap = (Button) findViewById(R.id.button17);
        jolliMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJolliMap(view);
            }
        });

        jolliMenu = (Button) findViewById(R.id.button16);
        jolliMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJolliMenu(view);
            }
        });
    }

    public void openDimsumMap (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button13) {
            Uri gmmIntentUri = Uri.parse("geo:14.6121,120.9873?z=18");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
    }

    public void openDimsumMenu (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button12) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.zomato.com/manila/dimsum-treats-sampaloc-manila"));
            startActivity(intent);
        }
    }

    public void openKfcMap (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button15) {
            Uri gmmIntentUri = Uri.parse("geo:14.6121,120.9885?z=18");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
    }

    public void openKfcMenu (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button14) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.zomato.com/manila/kfc-ermita-manila/menu"));
            startActivity(intent);
        }
    }

    public void openJolliMap (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button17) {
            Uri gmmIntentUri = Uri.parse("geo:14.6128,120.9894?z=18");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
    }

    public void openJolliMenu (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button16) {
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
