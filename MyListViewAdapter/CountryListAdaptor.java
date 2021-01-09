package com.example.mylistviewadapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryListAdaptor extends ArrayAdapter {
    private String[] countryNames;
    private String[] cityNames;
    private Integer[] imageid;
    private Activity context;


    public CountryListAdaptor(Activity context, String[] countryNames, String[] cityNames, Integer[] imageid) {
        super(context, R.layout.list_item, countryNames);
        this.context = context;
        this.countryNames = countryNames;
        this.cityNames = cityNames;
        this.imageid = imageid;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;

//        load on scrolling
        LayoutInflater inflater = context.getLayoutInflater();
        if(convertView==null)
            row = inflater.inflate(R.layout.list_item, null, true);
        TextView textViewCountry = (TextView) row.findViewById(R.id.textViewCountry);
        TextView textViewCity = (TextView) row.findViewById(R.id.textViewCity);
        ImageView imageFlag = (ImageView) row.findViewById(R.id.imageViewFlag);

        textViewCountry.setText(countryNames[position]);
        textViewCity.setText(cityNames[position]);
        imageFlag.setImageResource(imageid[position]);
        return row;
    }
}
