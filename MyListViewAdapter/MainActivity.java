package com.example.mylistviewadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private String countryNames[]={
            "delhi",
            "beijing",
            "canada",
            "pakistan"


    };
    private String capitalNames[]={
            "delhi",
            "beijing",
            "canada",
            "pakistan"


    };
    private Integer imageid[]={
            R.drawable.indi,
            R.drawable.chin,
            R.drawable.paki,
            R.drawable.ameri

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setting header
        TextView textView = new TextView(this);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setText("List of Countries");


        ListView listView= findViewById(R.id.listView);
        listView.addHeaderView(textView);

        CountryListAdaptor customCountryList = new CountryListAdaptor(this, countryNames, capitalNames, imageid);
        listView.setAdapter(customCountryList);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(). {
//            @Override
//            public void onItemClick(AdapterView<?> getParent(), View view, int position, long id) {
//                Toast.makeText(getApplicationContext(),"You Selected "+countryNames[position-1]+ " as Country",Toast.LENGTH_SHORT).show();
//
//            }
//
//        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"You Selected "+countryNames[position-1]+ " as Country",Toast.LENGTH_SHORT).show();

            }

        });




    }
}
