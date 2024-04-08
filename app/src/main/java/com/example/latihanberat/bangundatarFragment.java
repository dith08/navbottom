package com.example.latihanberat;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class bangundatarFragment extends Fragment {

    ImageView persegi;
    ImageView persegipanjang;
    ImageView segitiga;
    ImageView trapesium;
    ImageView jajargenjang;
    ImageView lingkaran;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_bangundatar,container,false);

       persegi = view.findViewById(R.id.persegi);
       persegipanjang = view.findViewById(R.id.persegipanjang);
       segitiga = view.findViewById(R.id.segitiga);
       trapesium = view.findViewById(R.id.trapesium);
       jajargenjang = view.findViewById(R.id.jajargenjang);
       lingkaran = view.findViewById(R.id.lingkaran);

       persegi.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick (View v){
               Intent intent=new Intent(getActivity(),persegi.class);
               startActivity(intent);
           }
       });

       persegipanjang.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick (View v){
               Intent intent=new Intent(getActivity(),persegipanjang.class);
               startActivity(intent);
           }
       });

       segitiga.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick (View v){
               Intent intent=new Intent(getActivity(),segitiga.class);
               startActivity(intent);
           }
       });

       trapesium.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick (View v){
               Intent intent=new Intent(getActivity(),trapesium.class);
               startActivity(intent);
           }
       });

       jajargenjang.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick (View v){
               Intent intent=new Intent(getActivity(),jajargenjang.class);
               startActivity(intent);
           }
       });

       lingkaran.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick (View v){
               Intent intent=new Intent(getActivity(),lingkaran.class);
               startActivity(intent);
           }
       });

       return view;
    }
}