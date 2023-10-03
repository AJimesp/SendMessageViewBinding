package com.antonioje.sendmessage;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.antonioje.sendmessage.model.data.Message;
import com.antonioje.sendmessage.model.data.Person;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SendMessageActivity extends AppCompatActivity {
    //OPCIÓN 1: Creo la instancia del listener o delegado
    private SendMessageOnClickListener onClickListener;
    private FloatingActionButton fab;
    private EditText edMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        onClickListener = new SendMessageOnClickListener();
        fab = findViewById(R.id.fab);
        //OPCIÓN 1
        //fab.setOnClickListener(onClickListener);

        //OPCIÓN 2: Clase anónima
/*        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FloatingActionButton fab = (FloatingActionButton)v;
                Toast.makeText(SendMessageActivity.this, "Se crea el texto en la clase anónima. Button" + fab.getId(), Toast.LENGTH_SHORT).show();
            }
        });*/

        //OPCIÓN 3: Expresión Lambda
        fab.setOnClickListener(v -> {
            //Toast.makeText(this, "Se crea el texto en la clase anónima", Toast.LENGTH_SHORT).show();
            edMessage = findViewById(R.id.edMessage);
            Intent intent = new Intent(this,ViewActivity.class);
            Bundle bundle = new Bundle();
            //bundle.putString("user","El usuario Antonio Jiménez Espejo te manda el siguiente mensaje: ");
            Person personE = new Person("Antonio","Jiménez Espejo","55758512X");
            Person personD = new Person("Pablo","López Carrasco","85761232Y");
            Message message = new Message(0,edMessage.getText().toString(),personE,personD);
            bundle.putParcelable(Person.KEY,personE);
            bundle.putSerializable(Message.KEY,message);
            intent.putExtras(bundle);
            startActivity(intent);

        });

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