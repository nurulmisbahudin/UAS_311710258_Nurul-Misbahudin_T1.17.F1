package com.example.uas_nurul_misbahudin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity_bulan extends AppCompatActivity {

    ImageView imageview;
    TextView bulan, info1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imageview = findViewById(R.id.imageviewfoto);
        bulan = findViewById(R.id.namabulan1);
        info1 = findViewById(R.id.info);

        getIncomingExtra();

    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("foto") && getIntent().hasExtra("namabulan1") && getIntent().hasExtra("info")){

            String foto = getIntent().getStringExtra("foto");
            String namabulan1 = getIntent().getStringExtra("namabulan1");
            String info = getIntent().getStringExtra("info");


            setDataActivity(foto, namabulan1, info);

        }
    }

    private void setDataActivity(String foto, String namabulan1, String info){


        Glide.with(this).asBitmap().load(foto).into(imageview);
        bulan.setText(namabulan1);
        info1.setText(info);







    }

}
