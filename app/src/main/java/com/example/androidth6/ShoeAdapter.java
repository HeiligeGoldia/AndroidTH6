package com.example.androidth6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ShoeAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Shoe> shoeList;

    public ShoeAdapter(Context context, int layout, List<Shoe> shoeList) {
        this.context = context;
        this.layout = layout;
        this.shoeList = shoeList;
    }

    @Override
    public int getCount() {
        return shoeList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        TextView txtName = (TextView) view.findViewById(R.id.txtName);
        ImageView imgPicture = (ImageView) view.findViewById(R.id.imageshoe1);

        Shoe shoe = shoeList.get(i);
        txtName.setText(shoe.getName());
        imgPicture.setImageResource(shoe.getPicture());

        return view;
    }
}
