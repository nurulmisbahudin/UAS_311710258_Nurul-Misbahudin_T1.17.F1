package com.example.uas_nurul_misbahudin;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter1 extends RecyclerView.Adapter<RecyclerViewAdapter1.ViewHolder> {


    private ArrayList<String> foto = new ArrayList<>();
    private ArrayList<String> namabulan1 = new ArrayList<>();
    private ArrayList<String> namabulan = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();


    private Context context;

    public RecyclerViewAdapter1(ArrayList<String> foto, ArrayList<String> namabulan1,ArrayList<String> namabulan, ArrayList<String> info, Context context) {
        this.foto = foto;
        this.namabulan = namabulan;
        this.namabulan1 = namabulan1;
        this.info = info;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter1.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent, false);
        RecyclerViewAdapter1.ViewHolder holder = new RecyclerViewAdapter1.ViewHolder(view);



        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter1.ViewHolder holder, final int position) {

        Glide.with(context).asBitmap().load(foto.get(position)).into(holder.imageView);
        holder.textView.setText(namabulan.get(position));



        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(context, namamahasiswa.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context,DetailActivity.class);

                intent.putExtra("foto", foto.get(position));
                intent.putExtra("namabulan1", namabulan1.get(position));
                intent.putExtra("namabulan", namabulan.get(position));
                intent.putExtra("info", info.get(position));


                context.startActivity(intent);


            }
        });

    }

    @Override
    public int getItemCount() {
        return namabulan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        CircleImageView imageView;
        TextView textView;




        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView1);



            constraintLayout = itemView.findViewById(R.id.constrainLayout);
        }
    }

}
