package br.ufjf.dcc196.igorknop.meustarter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.usage.UsageEvents;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String msg = "Olá mundo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicaBotaoMsg(View origem) {
        msg += "o";
        TextView textViewMsg = findViewById(R.id.textViewMsg);
        textViewMsg.setText(msg);
        textViewMsg.setTextSize(36);
    }
}