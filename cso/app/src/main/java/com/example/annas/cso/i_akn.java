package com.example.annas.cso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class i_akn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_akn);
    }

    public void home(View view) {
        Intent intent = new Intent(i_akn.this, menu_utama.class);
        startActivity(intent);
    }

    public void berlangsung(View view) {
        Intent intent = new Intent(i_akn.this, berlgsg.class);
        startActivity(intent);
    }
}
