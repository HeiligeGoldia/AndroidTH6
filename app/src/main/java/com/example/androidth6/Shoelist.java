package com.example.androidth6;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Shoelist extends Fragment {

    ListView listViewShoe;
    ShoeAdapter shoeAdap;
    ArrayList<Shoe> shoeArr;

    public Shoelist() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_shoelist, container, false);

        shoeArr = new ArrayList<>();

        shoeArr.add(new Shoe("Nike shoes-discount 50%", R.drawable.shoes_1));
        shoeArr.add(new Shoe("Adidas shoes-discount 80%", R.drawable.shoes_2));
        shoeArr.add(new Shoe("Nike bicycle-discount 30%", R.drawable.shoes_3));
        shoeArr.add(new Shoe("Yonex shoes-discount 50%", R.drawable.shoes_4));
        shoeArr.add(new Shoe("Victor shoes-discount 50%", R.drawable.shoes_5));
        shoeArr.add(new Shoe("Lining shoes-discount 50%", R.drawable.shoes_6));
        shoeArr.add(new Shoe("Binh Minh shoes-discount 50%", R.drawable.shoes_7));

        listViewShoe = (ListView) view.findViewById(R.id.shoelistview);
        listViewShoe.setAdapter(new ShoeAdapter(this, R.layout.fragment_shoelist, shoeArr));

        return view;
    }
}