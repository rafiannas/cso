package com.example.annas.cso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class berlgsg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berlgsg);
        ImageButton home = findViewById(R.id.home);
        ImageButton user = findViewById(R.id.user);
        ImageButton history = findViewById(R.id.history);

        home.setOnClickListener(new View.OnClickListener(){
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(berlgsg.this, menu_utama.class);
                                        startActivity(intent);

                                    }
                                }

        );

        user.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent intent = new Intent(berlgsg.this, i_akn.class);
                startActivity(intent);
            }
                                }


        );

        history.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(berlgsg.this, history.class);
                startActivity(intent);
            }
                                   }

        );
    }
}
