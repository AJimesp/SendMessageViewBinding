package com.antonioje.sendmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.antonioje.sendmessage.model.data.Message;
import com.antonioje.sendmessage.model.data.Person;

public class ViewActivity extends AppCompatActivity {
    private TextView tvUser,tvMessage;
    private  Message message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        tvUser = findViewById(R.id.tvUserInfo);
        tvMessage = findViewById(R.id.tvMessage);
        // 1.Recoger directamente el Bundle del Intent
        Bundle bundle = getIntent().getExtras();
        // 2.Rellenar los TexView con el contenido del Bundle
        //EJEMPLO 1: Con serializable
       /* if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
            message = bundle.getSerializable(Message.KEY,Message.class);
        }
        else{
            message = (Message)bundle.getSerializable(Message.KEY);
        }*/
        // EJEMPLO 2: Recoger el objeto mensaje como parcelable
        message = bundle.getParcelable(Message.KEY);
        inicializeView();
    }
    /**
     * Método que inicializa todas las vistas o widgets de la interfaz o del Layout
     * */
    private void inicializeView() {
        // Código que hemos estudiado en el ejercicio para inicializar la vista
        String userInfo = message.getSender().toString() + " te ha mandado el siguiente mensaje: ";
        tvUser.setText(userInfo);
        tvMessage.setText(message.getContent());
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Se ha iniciado la Activity ViewActivity", Toast.LENGTH_SHORT).show();
    }


}