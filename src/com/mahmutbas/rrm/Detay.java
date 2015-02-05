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
		  case "Gürcan Karayel": imageV.setImageResource(R.drawable.gurcan);break;
		  case "Þenel Pýtýr": imageV.setImageResource(R.drawable.bulent);break;
		  case "Mahmut Baþ": imageV.setImageResource(R.drawable.george);break;
		  case "Metin Tunç Karýþman": imageV.setImageResource(R.drawable.metin);break;
		  case "Pelin Arslan": imageV.setImageResource(R.drawable.pelin);break;
		  case "Sinan Kýlýnçarslan": imageV.setImageResource(R.drawable.sinan);break;
		  case "Turgay Gölcan": imageV.setImageResource(R.drawable.turgay);break;
	  }
		  
		  TextView textView2=(TextView) findViewById(R.id.text_kisidetay);
		  
		  
		  switch (mesaj){
		  case "Ayhan Kahraman":textView2.setText("* Ne yaparsanýz 333 katýný yaparým, var mýsýn birader?\n* Ben bu iþin kýralýyým.\n* Ýki tel saçýn var, türlü türlü huyun var (Gürsel)\n* King of tavla, ama henüz Pelin ile oynamadý.");break;
		  case "Bora Dudak":textView2.setText("* Çooook heycanlý\n* Her an ceketi hazýr, masasýnda hiçbirþey bulunmaz,  kýzdýmý çeker gider.\n* Süper tatlý bir kýzý var\n* Ataristan Kýralý 4. Budak ");break;
		  case "Gürcan Karayel":textView2.setText("* Yorgun baba\n* Londra sever, kaçar gider\n* Cool man");break;
		  case "Þenel Pýtýr":textView2.setText("* Çalýþkan ve azimli\n* Hýrs desen temel içgüdü\n* Dursun müdürüne atarlý\n* Fiesta candýr");break;
		  case "Mahmut Baþ":textView2.setText("* Bildiðiniz gibi artis\n* Akýllý\n* Yakýþýklý\n* Sizi seviyor...");break;
		  case "Metin Tunç Karýþman":textView2.setText("* Uçan hollandalý\n* Malaktar mucidi \n* Çok gezmiþ, görmüþ geçmiþ.\n* Espirileri soðuk duþtan daha etkili");break;
		  case "Pelin Arslan":textView2.setText("* Senior olcam, senior olcam\n*  Bunu yapmam o iþ mi ayy yapmam der ama çok çalýþýr her iþide yapar.\n* Hýrslý ve hararetli çalýþkanlýk timsali\n* Kafeteryaya bilgisayarsýz gidilmez.\n* Artýk onunda bir Juke'ý var.");break;
		  case "Sinan Kýlýnçarslan":textView2.setText("* Rahatlýk ve huzur timsali\n* Her iþ olur aceleye gerek yok\n* Dönerci Ali olduðundan þüpeleniyor\n* Peynir altý suyunu damardan enjektörle alýr");break;
		  case "Turgay Gölcan":textView2.setText("* Çekliþlerde Turgayla ayný torbadaysan þansýn yok \n* Özenle passat kiralanýr\n* Yaþýna göre bu kadar genç görünmenin altýnda bir yöntem olmalý, yoksa gamsýzlýk mý :)");break;
		  }
		
	}


}
