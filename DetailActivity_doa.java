package com.example.uas_nurul_misbahudin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity_doa extends AppCompatActivity {

    ImageView imageview;
    TextView doa, info1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_doa);
        imageview = findViewById(R.id.imageviewfoto);
        doa = findViewById(R.id.nama);
        info1 = findViewById(R.id.info);

        getIncomingExtra();

    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("foto") && getIntent().hasExtra("nama_doa1") && getIntent().hasExtra("info")){

            String foto = getIntent().getStringExtra("foto");
            String namadoa1 = getIntent().getStringExtra("nama_doa1");
            String info = getIntent().getStringExtra("info");


            setDataActivity(foto, namadoa1, info);

        }
    }

    private void setDataActivity(String foto, String namadoa1, String info){


        Glide.with(this).asBitmap().load(foto).into(imageview);
        doa.setText(namadoa1);
        info1.setText(info);







    }

}
