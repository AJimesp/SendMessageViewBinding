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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        tvUser = findViewById(R.id.tvUserInfo);
        tvMessage = findViewById(R.id.tvMessage);
        // 1.Recoger directamente el Intent y el Bundle
        Bundle bundle = getIntent().getExtras();
        // 2.Rellenar los TexView con el contenido del Bundle
        Person person = bundle.getParcelable(Person.KEY);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
            Message message = bundle.getSerializable(Message.KEY,Message.class);
        }
        tvUser.setText(person.toString());
        tvMessage.setText(bundle.getString("message"));
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Se ha iniciado la Activity ViewActivity", Toast.LENGTH_SHORT).show();
    }
}