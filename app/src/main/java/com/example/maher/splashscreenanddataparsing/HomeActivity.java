package com.example.maher.splashscreenanddataparsing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button btnSaintMartin,btnNilachol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //button linkup to xml ui
        btnSaintMartin=findViewById(R.id.btn_saintmartin);
        btnNilachol=findViewById(R.id.btn_nilachol);

        btnSaintMartin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name", "Saint Martin");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Saint Martin", Toast.LENGTH_SHORT).show();
            }
        });


        btnNilachol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this, DetailsActivity.class);
                intent.putExtra("name", "Nil achol");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Nil achol", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
