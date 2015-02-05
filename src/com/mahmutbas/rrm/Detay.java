package com.mahmutbas.rrm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detay extends Activity {

	public  ImageView imageV;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detay);
		
	 
		
		Intent intent=getIntent();
		String mesaj=intent.getStringExtra(MainActivity.EXTRA_MESSAGE );
		
		TextView textView=(TextView) findViewById(R.id.text_gelenmesaj);

		textView.setText(mesaj);
		
		  imageV = (ImageView) findViewById(R.id.imageView1); 
		  imageV.setImageResource(R.drawable.gay);
		  
		  switch (mesaj){
		  case "Ayhan Kahraman": imageV.setImageResource(R.drawable.ayhan);break;
		  case "Bora Dudak": imageV.setImageResource(R.drawable.bora);break;
		  case "G�rcan Karayel": imageV.setImageResource(R.drawable.gurcan);break;
		  case "�enel P�t�r": imageV.setImageResource(R.drawable.bulent);break;
		  case "Mahmut Ba�": imageV.setImageResource(R.drawable.george);break;
		  case "Metin Tun� Kar��man": imageV.setImageResource(R.drawable.metin);break;
		  case "Pelin Arslan": imageV.setImageResource(R.drawable.pelin);break;
		  case "Sinan K�l�n�arslan": imageV.setImageResource(R.drawable.sinan);break;
		  case "Turgay G�lcan": imageV.setImageResource(R.drawable.turgay);break;
	  }
		  
		  TextView textView2=(TextView) findViewById(R.id.text_kisidetay);
		  
		  
		  switch (mesaj){
		  case "Ayhan Kahraman":textView2.setText("* Ne yaparsan�z 333 kat�n� yapar�m, var m�s�n birader?\n* Ben bu i�in k�ral�y�m.\n* �ki tel sa��n var, t�rl� t�rl� huyun var (G�rsel)\n* King of tavla, ama hen�z Pelin ile oynamad�.");break;
		  case "Bora Dudak":textView2.setText("* �ooook heycanl�\n* Her an ceketi haz�r, masas�nda hi�bir�ey bulunmaz,  k�zd�m� �eker gider.\n* S�per tatl� bir k�z� var\n* Ataristan K�ral� 4. Budak ");break;
		  case "G�rcan Karayel":textView2.setText("* Yorgun baba\n* Londra sever, ka�ar gider\n* Cool man");break;
		  case "�enel P�t�r":textView2.setText("* �al��kan ve azimli\n* H�rs desen temel i�g�d�\n* Dursun m�d�r�ne atarl�\n* Fiesta cand�r");break;
		  case "Mahmut Ba�":textView2.setText("* Bildi�iniz gibi artis\n* Ak�ll�\n* Yak���kl�\n* Sizi seviyor...");break;
		  case "Metin Tun� Kar��man":textView2.setText("* U�an hollandal�\n* Malaktar mucidi \n* �ok gezmi�, g�rm�� ge�mi�.\n* Espirileri so�uk du�tan daha etkili");break;
		  case "Pelin Arslan":textView2.setText("* Senior olcam, senior olcam\n*  Bunu yapmam o i� mi ayy yapmam der ama �ok �al���r her i�ide yapar.\n* H�rsl� ve hararetli �al��kanl�k timsali\n* Kafeteryaya bilgisayars�z gidilmez.\n* Art�k onunda bir Juke'� var.");break;
		  case "Sinan K�l�n�arslan":textView2.setText("* Rahatl�k ve huzur timsali\n* Her i� olur aceleye gerek yok\n* D�nerci Ali oldu�undan ��peleniyor\n* Peynir alt� suyunu damardan enjekt�rle al�r");break;
		  case "Turgay G�lcan":textView2.setText("* �ekli�lerde Turgayla ayn� torbadaysan �ans�n yok \n* �zenle passat kiralan�r\n* Ya��na g�re bu kadar gen� g�r�nmenin alt�nda bir y�ntem olmal�, yoksa gams�zl�k m� :)");break;
		  }
		
	}


}
