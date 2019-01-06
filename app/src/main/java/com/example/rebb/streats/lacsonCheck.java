package com.example.rebb.streats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class lacsonCheck extends AppCompatActivity {

    private CheckBox Vegetable;
    private CheckBox Fruit;
    private CheckBox Grain;
    private CheckBox Meats;
    private Button check;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lacson_check);

        addListenerOnButtonClick();

        next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLacson();
            }
        });
    }

    public void addListenerOnButtonClick() {

        Vegetable=(CheckBox)findViewById(R.id.checkBox);
        Fruit=(CheckBox)findViewById(R.id.checkBox5);
        Grain=(CheckBox)findViewById(R.id.checkBox4);
        Meats=(CheckBox) findViewById(R.id.checkBox3);
        check=(Button) findViewById(R.id.check);

        check.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                StringBuilder result=new StringBuilder();
                result.append("Selected Items:");
                if(Vegetable.isChecked()){
                    result.append("\nSelected Vegetable");
                }
                if(Fruit.isChecked()){
                    result.append("\nSelected Fruit");
                }
                if(Grain.isChecked()){
                    result.append("\nSelected Grain");
                }
                if(Meats.isChecked()){
                    result.append("\nSelected Meats");
                }
                result.append("\nPlease press next");

                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }

        });
    }

    public void openLacson() {
        Intent lacsonIntent = new Intent(this, Lacson.class);
        startActivity(lacsonIntent);
    }
}
