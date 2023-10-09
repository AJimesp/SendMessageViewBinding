package com.antonioje.sendmessageviewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.antonioje.sendmessageviewbinding.databinding.ActivitySendMessageBinding;
import com.antonioje.sendmessageviewbinding.model.data.Message;
import com.antonioje.sendmessageviewbinding.model.data.Person;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SendMessageActivity extends AppCompatActivity {
    private static final String TAG = "SendMessageActivity";
    private ActivitySendMessageBinding binding;
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.menu_aboutus){
                Intent intent = new Intent(this,AboutActivity.class);
                startActivity(intent);
                return true;
        }
        return false;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySendMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.fab.setOnClickListener(v -> {
            sendMessage();
        });
        Log.d(TAG,"SendMessageActivity -> onCreate");
    }
    //region  MÉTODOS DE CICLO DE VIDA
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"SendMessageActivity -> onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"SendMessageActivity -> onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"SendMessageActivity -> onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
        Log.d(TAG,"SendMessageActivity -> onDestroy");
    }
    //endregion
    /**
 * Metodo que construye el mensaje y lo envia a otra Activity
 * */
    private void sendMessage() {
        Intent intent = new Intent(this,ViewActivity.class);
        Bundle bundle = new Bundle();
        Person personE = new Person("Antonio","Jiménez Espejo","55758512X");
        Person personD = new Person("Pablo","López Carrasco","85761232Y");
        Message message = new Message(0,binding.edMessage.getText().toString(),personE,personD);
        bundle.putParcelable(Person.KEY,personE);
        bundle.putSerializable(Message.KEY,message);
        bundle.putParcelable(Message.KEY,message);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}