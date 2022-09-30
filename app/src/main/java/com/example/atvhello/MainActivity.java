package com.example.atvhello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView editTextName;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        button = findViewById(R.id.button);
    }
    public void confirmEvent(View view) {
        String Nome = editTextName.getText().toString();
        Intent intent = new Intent(this, TelaHello.class);
        intent.putExtra("name", Nome);
        startActivity(intent);
    }

}