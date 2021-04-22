package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lvModule;
    TextView tvYear;
//    ImageView ivModule;
    ArrayList<Module> module;
    ArrayAdapter aa;
    String year = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lvModule = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);
//        ivModule = (ImageView) findViewById(R.id.imageViewModule);

        lvModule = (ListView) this.findViewById(R.id.lvModules);
        module = new ArrayList<>();



        Intent i = getIntent();
        year = i.getStringExtra("year");
        tvYear.setText(year);
        Toast.makeText(this, year, Toast.LENGTH_SHORT).show();

        if (year.equals("Year 1")) {
            module.add(new Module("A113", false));
            module.add(new Module("C105", true));
            module.add(new Module("C109", true));
            module.add(new Module("G101", false));
            module.add(new Module("C207", true));
            module.add(new Module("C208", true));
            module.add(new Module("C227", false));
            module.add(new Module("C294", false));
//            Module selectedModule = module.get(position);
//            tvModuleCode.setText(module.getModule);
            Toast.makeText(this, module.get(0).getModule(), Toast.LENGTH_SHORT).show();

        } else if (year.equals("Year 2")) {
            module.add(new Module("C208", true));
            module.add(new Module("C200", false));
            module.add(new Module("C346", true));
        } else if (year.equals("Year 3")) {
            module.add(new Module("C347", true));
            module.add(new Module("C349", true));
            module.add(new Module("C302", true));
            module.add(new Module("C300", true));
        } else {
            Toast.makeText(this, "Trying", Toast.LENGTH_SHORT).show();

        }

        aa = new ModuleAdapter(this, R.layout.row2, module);
        lvModule.setAdapter(aa);



    }



}
