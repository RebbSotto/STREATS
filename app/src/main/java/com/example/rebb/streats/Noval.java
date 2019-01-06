package com.example.rebb.streats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Noval extends AppCompatActivity {

    private Button dcreamMap;
    private Button dcreamMenu;
    private Button chunMap;
    private Button chunMenu;
    private Button cowMap;
    private Button cowMenu;
    public RatingBar rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noval);

        rate = (RatingBar) findViewById(R.id.ratingBar);

        dcreamMap = (Button) findViewById(R.id.button19);
        dcreamMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDcreamMap(view);
            }
        });

        dcreamMenu = (Button) findViewById(R.id.button18);
        dcreamMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDcreamMenu(view);
            }
        });

        chunMap = (Button) findViewById(R.id.button21);
        chunMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openChunMap(view);
            }
        });

        chunMenu = (Button) findViewById(R.id.button20);
        chunMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openChunMenu(view);
            }
        });

        cowMap = (Button) findViewById(R.id.button23);
        cowMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCowMap(view);
            }
        });

        cowMenu = (Button) findViewById(R.id.button22);
        cowMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCowMenu(view);
            }
        });
    }

    public void openDcreamMap (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button19) {
            Uri gmmIntentUri = Uri.parse("geo:14.6070,120.9890?z=18");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
    }

    public void openDcreamMenu (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button18) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.zomato.com/manila/dcream-sampaloc-manila/menu"));
            startActivity(intent);
        }
    }

    public void openChunMap (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button21) {
            Uri gmmIntentUri = Uri.parse("geo:14.6088,120.9864?z=18");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
    }

    public void openChunMenu (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button20) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.zomato.com/manila/chun-chon-sampaloc-manila"));
            startActivity(intent);
        }
    }

    public void openCowMap (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button23) {
            Uri gmmIntentUri = Uri.parse("geo:14.6070,120.9890?z=18");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
    }

    public void openCowMenu (View view) {
        Intent intent = null;

        if(view.getId()==R.id.button22) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.zomato.com/manila/cow-wow-sausage-haus-sampaloc-manila"));
            startActivity(intent);
        }
    }

    public void rateMe(View view){

        Toast.makeText(getApplicationContext(),
                String.valueOf(rate.getRating()), Toast.LENGTH_LONG).show();
    }
}
