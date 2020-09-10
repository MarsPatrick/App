package com.example.mallacurricular;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText texto;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto=(EditText)findViewById(R.id.texto);
        boton=(Button)findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Enviar(view);
            }
        });
    }

    //probando webhook

    public void Enviar(View view){
        Intent i = new Intent(this,MainActivity2.class);
        i.putExtra("1",texto.getText().toString());
        i.putExtra("numero",5);
        startActivity(i);
    }
}