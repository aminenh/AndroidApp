package com.example.med_amine.android_app;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class WebSites extends AppCompatActivity {
    private List<String> websites=getAllWebSites();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_websites);
        AdapterWebSites listView_website=new AdapterWebSites(this,R.layout.layout_item_website,websites);
        ListView listView=(ListView) findViewById(R.id.listView);
        listView.setAdapter(listView_website);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,
                                    int arg2, long arg3) {

                try {
                    Intent i = new Intent(WebSites.this,
                            Navigator.class);
                    i.putExtra("WebSite", ((TextView) arg1.findViewById(R.id.website_item)).getText().toString());
                    startActivity(i);
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(),
                            Toast.LENGTH_LONG).show();
                }
                //
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public List<String> getAllWebSites(){
        List<String> webSites=new ArrayList<>();
        webSites.add("https://www.gymglish.com/fr");
        webSites.add("https://www.frantastique.com/fr");
        webSites.add("http://www.vatefaireconjuguer.com/");
        webSites.add("http://www.delavignecorp.com/");
        webSites.add("http://www.comment-utiliser-son-cpf.fr/");
        webSites.add("http://www.anglais-cpf.fr/");
        webSites.add("http://www.thewordofthemonth.com/fr/word/odd");
        webSites.add("https://www.richmorning.com/fr");
        webSites.add("http://forum.gymglish.com/");
        return webSites;
    }

}
