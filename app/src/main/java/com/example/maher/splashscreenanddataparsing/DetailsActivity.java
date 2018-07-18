package com.example.maher.splashscreenanddataparsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgPlace;
    TextView txtName,txtDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgPlace=findViewById(R.id.img_place);
        txtName=findViewById(R.id.txt_name);
        txtDesc=findViewById(R.id.txt_desc);

        String getName=getIntent().getExtras().getString("name");
        if (getName.equals("Saint Martin")){
            txtName.setText("Saint Martin");
            txtDesc.setText(R.string.saint_martin_desc);
            imgPlace.setImageResource(R.drawable.saintmartin);
        }
        else if (getName.equals("Nilachol")){
            txtName.setText("Nilachol");
            txtDesc.setText(R.string.nilachol_desc);
            imgPlace.setImageResource(R.drawable.nilachol);
        }
    }
}
