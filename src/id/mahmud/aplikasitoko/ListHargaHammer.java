package id.mahmud.aplikasitoko;

import android.app.Activity;
//import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.view.Menu;
import android.view.MenuItem;

public class ListHargaHammer extends Activity {

	//Deklarasi Array menu dan gambar
	ListView list;
	//Button btngambar;
	
	String[] menu = {
			"Diery",
			"Black Id",
			"Black Anggel",
			"Cardinal",
			"Diery",
			"Black Id",
			"Kameja Diery",
			"Kameja Black Id",
			"Levis",
			"Lois",
			"Cardinal",
			"Levis",
	};
	String[] keterangan = {
			"Rp : 80.000",
			"Rp : 90.000",
			"Rp : 90.000",
			"Rp : 90.000",
			"Rp : 80.000",
			"Rp : 90.000",
			"Rp : 150.000",
			"Rp : 150.000",
			"Rp : 300.000",
			"Rp : 400.000",
			"Rp : 450.000",
			"Rp : 300.000"
	};
	
	Integer[] listimageharga = {
			R.drawable.hammerbajukaos,
			R.drawable.hammerbajukaos1,
			R.drawable.hammerbajukaos2,
			R.drawable.hammerbajukaos3,
			R.drawable.hammerbajukaos4,
			R.drawable.hammerbajukaos5,
			R.drawable.hammerbajukameja,
			R.drawable.hammerbajukameja1,
			R.drawable.hammercelana1,
			R.drawable.hammercelana2,
			R.drawable.hammercelana3,
			R.drawable.hammercelanapendek,
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_harga_hammer);
		
		list = (ListView)findViewById(R.id.listhargahammer);
		CostumlistHargaHammer adapter = new
	    CostumlistHargaHammer(ListHargaHammer.this,menu, keterangan, listimageharga);		
		list.setAdapter(adapter);
				
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list_harga_hammer, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
