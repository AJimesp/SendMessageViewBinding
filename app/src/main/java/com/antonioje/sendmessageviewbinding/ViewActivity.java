package com.antonioje.sendmessageviewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.antonioje.sendmessageviewbinding.databinding.ActivityViewBinding;
import com.antonioje.sendmessageviewbinding.model.data.Message;

import java.security.PrivateKey;

public class ViewActivity extends AppCompatActivity {
    public static final String TAG = "ViewActivity";
    private ActivityViewBinding binding;
    private Message message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Bundle bundle = getIntent().getExtras();
        message = bundle.getParcelable(Message.KEY);
        inicializeView();
    }
    //region  MÉTODOS DE CICLO DE VIDA
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"ViewActivity -> onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"ViewActivity -> onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"ViewActivity -> onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
        Log.d(TAG,"ViewActivity -> onDestroy");
    }
    //endregion
    /**
     * Método que inicializa todas las vistas o widgets de la interfaz o del Layout
     * */
    private void inicializeView() {
        // Código que hemos estudiado en el ejercicio para inicializar la vista
        String userInfo = message.getSender().toString() + " te ha mandado el siguiente mensaje: ";
        binding.tvUserInfo.setText(userInfo);
        binding.tvMessage.setText(message.getContent());
    }


}