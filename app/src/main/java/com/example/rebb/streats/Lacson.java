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

public class Lacson extends AppCompatActivity {

    private Button jackMap;
    private Button jackMenu;
    private Button yellowMap;
    private Button yellowMenu;
    private Button pizzaMap;
    private Button pizzaMenu;
    public RatingBar rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lacson);

        rate = (RatingBar) findViewById(R.id.ratingBar4);

        jackMap = (Button) findViewById(R.id.button7);
        jackMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJackMap(view);
            }
        });

        jackMenu = (Button) findViewById(R.id.button6);
        jackMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJackMenu(view);
            }
        });

        yellowMap = (Button) findViewById(R.id.button9);
        yellowMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openYellowMap(view);
            }
        });

        yellowMenu = (Button) findViewById(R.id.button8);
        yellowMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openYellowMenu(view);
            }
        });

        pizzaMap = (Button) findViewById(R.id.button11);
        pizzaMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPizzaMap(view);
            }
        });

        pizzaMenu = (Button) findViewById(R.id.button10);
        pizzaMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPizzaMenu(view);
            }
        });
    }

    public void openJackMap (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button7) {
            Uri gmmIntentUri = Uri.parse("geo:14.6129,120.9912?z=18");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
    }

    public void openJackMenu (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button6) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.zomato.com/manila/jackos-burger-house-sampaloc-manila"));
            startActivity(intent);
        }
    }

    public void openYellowMap (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button9) {
            Uri gmmIntentUri = Uri.parse("geo:14.6123,120.9905?z=18");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
    }

    public void openYellowMenu (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button8) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.zomato.com/manila/yellow-cab-pizza-co-mall-of-asia-complex-pasay-city/menu"));
            startActivity(intent);
        }
    }

    public void openPizzaMap (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button11) {
            Uri gmmIntentUri = Uri.parse("geo:14.6105,120.9923?z=18");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
    }

    public void openPizzaMenu (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button10) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.zomato.com/manila/pizza-hut-bangkal-makati-city/menu"));
            startActivity(intent);
        }
    }

    public void rateMe(View view){

        Toast.makeText(getApplicationContext(),
                String.valueOf(rate.getRating()), Toast.LENGTH_LONG).show();
    }
}
