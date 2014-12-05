package id.mahmud.aplikasitoko;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;

public class JenisPakaian extends Activity {
	//Deklarasi Array menu dan gambar
	ListView list;
	
	
	String[] menu = {
			"Hammer",
			"Giordano",
			"Vincarren"
	};
	String[]keterangan = {
					"Contoh Produk-Produk yang kami sediakan di toko Hammer WTC Shops Jambi",
					"Contoh Produk-Produk yang kami sediakan di toko Giordano WTC Shops Jambi",
					"Contoh Produk-Produk yang kami sediakan di toko Vincarren WTC Shops Jambi",
			};

	Integer[] imageId = {
			R.drawable.icon_hammer,
			R.drawable.icon_girdiano,
			R.drawable.icon_vicreen
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jenis_pakaian);
		
		CostumListview2 adapter = new 
				CostumListview2(JenisPakaian.this, menu, keterangan, imageId);
				
				//getid List
				list =(ListView)findViewById(R.id.list);
				
				list.setAdapter(adapter);
				
				list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
   @Override
   public void onItemClick(AdapterView<?> parent, View view, int position, long id){
	    String pilihan = (list.getItemAtPosition(position).toString());
	    Intent trans = null;
	    if(pilihan.equals("Hammer")){
	    	trans = new Intent(JenisPakaian.this,PakaianHammer.class);
	    	startActivity(trans);
	    }
	    else if(pilihan.equals("Giordano")){
	    	trans = new Intent(JenisPakaian.this,PakaianGiordano.class);
	    	startActivity(trans);
	    }
	    else if(pilihan.equals("Vincarren")){
	    	trans = new Intent(JenisPakaian.this,PakaianVincarren.class);
	    	startActivity(trans);
	    }
	    else if(pilihan.equals("kembali")){
			trans = new Intent(JenisPakaian.this,MenuUtama.class);
			startActivity(trans);
			finish();
		}
	   Toast.makeText(JenisPakaian.this,"Anda Memilih " + menu[+ position], Toast.LENGTH_SHORT).show();
}
	});
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jenis_pakaian, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		/*switch(item.getItemId()){
		case R.id.action_back:
			Intent trans = new Intent(JenisPakaian.this,MenuUtama.class);
			startActivity(trans);
			finish();
			return true;
		}*/
		return super.onOptionsItemSelected(item);
	}


}
