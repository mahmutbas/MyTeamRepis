package com.mahmutbas.rrm;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class mahmutAdapter extends BaseAdapter {

	private LayoutInflater mInflater;
    private List<Kisi>     mKisiListesi;
 
    public mahmutAdapter(Activity activity, List<Kisi> kisiler) {
        //XML'i alýp View'a çevirecek inflater'ý örnekleyelim
        mInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        //gösterilecek listeyi de alalým
        mKisiListesi = kisiler;
    }
 
    @Override
    public int getCount() {
        return mKisiListesi.size();
    }
 
    @Override
    public Kisi getItem(int position) {
        //þöyle de olabilir: public Object getItem(int position)
        return mKisiListesi.get(position);
    }
 
    @Override
    public long getItemId(int position) {
        return position;
    }
 
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View satirView;
 
        satirView = mInflater.inflate(R.layout.satir_layout, null);
        TextView textView = 
                (TextView) satirView.findViewById(R.id.isimsoyisim); 
        ImageView imageView = 
                (ImageView) satirView.findViewById(R.id.simge);
 
        Kisi kisi = mKisiListesi.get(position);
 
        textView.setText(kisi.getIsim());
 
        if (kisi.cinsiyeti()==2) {
            imageView.setImageResource(R.drawable.woman);
        }
        else if (kisi.cinsiyeti()==1) {
            imageView.setImageResource(R.drawable.man);
        }
        else 
        {
        	imageView.setImageResource(R.drawable.gay);
        }
        return satirView;
    }
	
}
