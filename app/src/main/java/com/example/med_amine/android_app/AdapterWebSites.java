package com.example.med_amine.android_app;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/**
 * Created by Med-Amine on 12/02/2016.
 */
public class AdapterWebSites extends ArrayAdapter<String>{

    private final Activity context;
    private List<String> list_webSite;

    public AdapterWebSites(Activity context,int item,List<String> list){
        super(context,R.layout.layout_item_website, list);
        this.list_webSite=list;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v=convertView;
        if(v==null){
            LayoutInflater vi=(LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v=vi.inflate(R.layout.layout_item_website,null);
        }
        TextView website_item = (TextView) v.findViewById(R.id.website_item);
        website_item.setText(this.list_webSite.get(position));
        return v;


    }

}
