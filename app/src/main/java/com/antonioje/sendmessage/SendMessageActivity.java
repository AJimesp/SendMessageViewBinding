package com.antonioje.sendmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SendMessageActivity extends AppCompatActivity {
    //OPCIÓN 1: Creo la instancia del listener o delegado
    private SendMessageOnClickListener onClickListener;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        onClickListener = new SendMessageOnClickListener();
        fab = findViewById(R.id.fab);
        //OPCIÓN 1
        //fab.setOnClickListener(onClickListener);

        //OPCIÓN 2: Clase anónima
       /* fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SendMessageActivity.this, "Se crea el texto en la clase anónima", Toast.LENGTH_SHORT).show();
            }
        });*/

        //OPCIÓN 3: Expresión Lambda
        fab.setOnClickListener(v -> Toast.makeText(this, "Se crea el texto en la clase anónima", Toast.LENGTH_SHORT).show());

    }
    /**
    * OPCIÓN 1: Se crea una clase que implementa la interfaz View.OnClickListener
    * */
    class SendMessageOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(SendMessageActivity.this, "Se ha pulsado sobre el botón enviar", Toast.LENGTH_SHORT).show();
        }
    }
}