package com.example.atvhello;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TelaHello extends AppCompatActivity {
    TextView secondActivityView;
    String Nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        secondActivityView = findViewById(R.id.secondActivityView);
        Nome = getIntent().getStringExtra("name");
        secondActivityView.setText("Oi "+Nome+", Tudo bem?");
    }
}
