package com.example.latihanberat;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class bangunruangFragment extends Fragment {

    ImageView kubus;
    ImageView balok;
    ImageView limas;
    ImageView tabung;
    ImageView kerucut;
    ImageView bola;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bangunruang, container, false);

        kubus = view.findViewById(R.id.kubus);
        balok = view.findViewById(R.id.balok);
        limas = view.findViewById(R.id.limas);
        tabung = view.findViewById(R.id.tabung);
        kerucut = view.findViewById(R.id.kerucut);
        bola = view.findViewById(R.id.bola);

        kubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), kubus.class);
                startActivity(intent);
            }
        });

        balok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), balok.class);
                startActivity(intent);
            }
        });

        limas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), limas.class);
                startActivity(intent);
            }
        });

        tabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), tabung.class);
                startActivity(intent);
            }
        });

        kerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), kerucut.class);
                startActivity(intent);
            }
        });

        bola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), bola.class);
                startActivity(intent);
            }
        });



        return view;
    }
}
