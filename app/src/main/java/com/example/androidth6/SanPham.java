package com.example.androidth6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class SanPham extends Fragment {

    ImageButton btnminus;
    ImageButton btnplus;
    TextView txtquantity;

    public SanPham() {

    }

    @Override
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container,
                             @Nullable  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_san_pham, container, false);

        btnminus = view.findViewById(R.id.btnm);
        btnplus = view.findViewById(R.id.btnp);
        txtquantity = view.findViewById(R.id.quantity);

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ssl = txtquantity.getText().toString();
                int isl = Integer.parseInt(ssl);
                int slm = isl-1;
                txtquantity.setText(String.valueOf(slm));
            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ssl = txtquantity.getText().toString();
                int isl = Integer.parseInt(ssl);
                int slp = isl+1;
                txtquantity.setText(String.valueOf(slp));
            }
        });

        return view;
    }
}