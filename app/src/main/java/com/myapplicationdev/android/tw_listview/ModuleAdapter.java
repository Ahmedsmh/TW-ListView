package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Module>{

    private Context context;
    private ArrayList<Module> module;
    private TextView tvModuleCode;
    private ImageView ivModule;

    public ModuleAdapter(Context context, int resource, ArrayList<Module> objects) {
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        module = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    //getView() is the method ListView will call to get
    // View object everytime ListView needs a row

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        // "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row2, parent, false);

        // Get the TextView object
        tvModuleCode = (TextView) rowView.findViewById(R.id.textViewModuleCode);
        // Get the ImageView object
        ivModule = (ImageView) rowView.findViewById(R.id.imageViewModule);

        // The parameter "position" is the index of the
        // row ListView is requesting.
        // We get back the food at the same index.
        Module currentModule = module.get(position);
        // Set the TextView to show the food

        tvModuleCode.setText(currentModule.getModule());
        // Set the image to star or no star accordingly
        if(currentModule.isProg()){
            ivModule.setImageResource(R.drawable.prog);
        } else {
            ivModule.setImageResource(R.drawable.nonprog);
        }
        // Return the nicely done up View to the ListView
        return rowView;

    }






}
