package com.mahmutbas.rrm;


import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity {

	final List<Kisi> kisiler=new ArrayList<Kisi>();
	 public  static String EXTRA_MESSAGE="mesaj"; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		kisiler.add(new Kisi("Ayhan Kahraman", 1));
        kisiler.add(new Kisi("Bora Dudak", 1));
        kisiler.add(new Kisi("Gürcan Karayel", 1));
        kisiler.add(new Kisi("Þenel Pýtýr", 0));
        kisiler.add(new Kisi("Mahmut Baþ", 1));
        kisiler.add(new Kisi("Metin Tunç Karýþman",1));
        kisiler.add(new Kisi("Pelin Arslan",2));
        kisiler.add(new Kisi("Sinan Kýlýnçarslan",1));
        kisiler.add(new Kisi("Turgay Gölcan",1));
        
        final ListView listemiz = (ListView) findViewById(R.id.liste);
        mahmutAdapter adaptorumuz=new mahmutAdapter(this, kisiler);
        listemiz.setAdapter(adaptorumuz);
        
      
         
        
        
       listemiz.setOnItemClickListener(new OnItemClickListener() {

           @Override
           public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                   long arg3) {
        	
        	 	
        	   
             //  Kisi birey = kisiler.get(arg2);

             //  Toast.makeText(MainActivity.this, birey.getIsim(),Toast.LENGTH_LONG).show();
        	   Intent intent = new Intent(MainActivity.this, Detay.class);
        	     intent.putExtra(EXTRA_MESSAGE, kisiler.get(arg2).toString());
        	   
        	  //  intent.putExtra(EXTRA_MESSAGE , "deneme");
        	    startActivity(intent);
        	   // startActivity(new Intent(MainActivity.this, Detay.class));
        	  //  MainActivity.this.startActivity(intent);
        	 
           }
       });

     
        
        
	}
	
}
