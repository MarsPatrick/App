package com.example.mallacurricular;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        text=(TextView)findViewById(R.id.textView);
        Intent intent=getIntent();
        int x = intent.getIntExtra("numero",0);

        String[] textArray = {"One", "Two", "Three", "Four","Five"};


        for(int i=0;i<x;i++){
            textArray[i]= intent.getStringExtra(Integer.toString(i));
        }


        LinearLayout linearLayout = new LinearLayout(this);
        setContentView(linearLayout);
        linearLayout.setOrientation(LinearLayout.VERTICAL);



        for( int i = 0; i < textArray.length; i++ )
        {
            TextView textView = new TextView(this);
            textView.setText(textArray[i]);
            //cardView.addView(textView);

            //No funciona con cardview
            /*Button button = new Button(this);
            button.setText(textArray[i]);
            cardView.addView(button,i);*/

            CardView cardView = new CardView(this);
            cardView.addView(textView);
            linearLayout.addView(cardView);
        }
    }
}