package br.ufjf.dcc196.igorknop.meustarter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.usage.UsageEvents;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextStarter;
    private EditText editTextName;
    private TextView textViewMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextStarter = findViewById(R.id.editTextStarter);
        editTextName = findViewById(R.id.editTextTextPersonName);
        textViewMsg = findViewById(R.id.textViewMsg);
    }

    public void clicaBotaoMsg(View origem) {
        String nameTxt = editTextName.getText().toString();
        String starterTxt = editTextStarter.getText().toString();
        String msg = String.format("Olá seu nome é %s e seu starter é %s", nameTxt, starterTxt);
        textViewMsg.setText(msg);
        textViewMsg.setTextSize(36);

    }
}