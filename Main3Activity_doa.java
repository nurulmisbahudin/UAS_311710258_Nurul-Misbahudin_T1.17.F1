package com.example.uas_nurul_misbahudin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Main3Activity_doa extends AppCompatActivity {

    private ArrayList<String> foto = new ArrayList<>();
    private ArrayList<String> namadoa1 = new ArrayList<>();
    private ArrayList<String> namadoa = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_doa);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter2 adapter = new RecyclerViewAdapter2(foto, namadoa,namadoa1, info, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
    private  void getDataFromInternet(){

        namadoa.add("Doa Makan");
        namadoa1.add("Doa Makan");
        foto.add("https://image.freepik.com/free-vector/illustration-muslim-man_94843-31.jpg");
        info.add("اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّار\nِ\n" +
                "Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar\n\n" +
                "Artinya: \"Ya Allah, berkahilah kami dalam rezeki yang telah Engkau berikan kepada kami dan peliharalah kami dari siksa api neraka\"\n");

        namadoa.add("Doa Buka Puasa");
        namadoa1.add("Doa Buka Puasa");
        foto.add("https://image.freepik.com/free-vector/illustration-muslim-man_94843-31.jpg");
        info.add("اَللّهُمَّ لَكَ صُمْتُ وَبِكَ آمَنْتُ وَعَلَى رِزْقِكَ أَفْطَرْتُ بِرَحْمَتِكَ يَا اَرْحَمَ الرَّحِمِيْنَ\n\n" +
                "Allahumma laka shumtu wa bika amantu wa'ala rizqika afthartu. Birrahmatika yaa arhamar roohimin.\n\n" +
                "Artinya,\n" +
                "Ya Allah karenaMu aku berpuasa, denganMu aku beriman, kepadaMu aku berserah, dan sengan rezekiMu aku berbuka (puasa), dengan rahmatMu, wahai Allah Tuhan Maha Pengasih.\n");

        namadoa.add("Doa Niat Puasa");
        namadoa1.add("Doa Niat Puasa");
        foto.add("https://image.freepik.com/free-vector/illustration-muslim-man_94843-31.jpg");
        info.add("نَوَيْتُ صَوْمَ غَدٍ عَنْ أَدَاءِ فَرْضِ شَهْرِ رَمَضَانِ هذِهِ السَّنَةِ لِلهِ تَعَالَى\n\n" +
                "Nawaitu sauma ghadin an’adai fardi syahri ramadhani hadzihisanati lillahita’ala\n\n" +
                "Saya niat berpuasa esok hari untuk menunaikan fardhu di bulan Ramadhan tahun ini, karena Allah Ta'ala.\n");


        prosesRecyclerViewAdapter();

    }

}