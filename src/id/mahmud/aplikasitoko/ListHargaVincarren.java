package id.mahmud.aplikasitoko;

import android.app.Activity;
//import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.view.Menu;
import android.view.MenuItem;

public class ListHargaVincarren extends Activity {
	
	//deklarasi 
		ListView list;
		//Button btngambar;
		
		String[] menu = {
				"Harga",
				"Harga ",
				"Harga",
				"Harga",
				"Harga",
				"Harga",
				"Harga",
				"Harga",
				"Harga",
				"Harga",
				"Harga",
				"Harga",
				"Harga",
				"Harga",
		};
		String[] keterangan = {
				"Rp : 100.000",
				"Rp : 50.000",
				"Rp : 70.000",
				"Rp : 90.000",
				"Rp : 100.000",
				"Rp : 120.000",
				"Rp : 90.000",
				"Rp : 100.000",
				"Rp : 80.000",
				"Rp : 80.000",
				"Rp : 100.000",
				"Rp : 120.000",
				"Rp : 120.000",
				"Rp : 100.000"
		};
		
		Integer[] listimageharga = {
				R.drawable.vincarrencewek1,
				R.drawable.vincarrencewek2,
				R.drawable.vincarrencewek3,
				R.drawable.vincarrencewek4,
				R.drawable.vincarrencewek5,
				R.drawable.vincarrencewek6,
				R.drawable.vincarrencewek7,
				R.drawable.vincarrencewek8,
				R.drawable.vincarrencewek9,
				R.drawable.vincarrencewek10,
				R.drawable.vincarrencewek111,
				R.drawable.vincarrencewekcelana1,
				R.drawable.vincarrencewekcelana2,
				R.drawable.vincarrencewekcelana3,
				R.drawable.vincarrencewekcelana4,
				R.drawable.vincarrencewekcelana5,
				R.drawable.vincarrencewekcelana6
		};
		

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_harga_vincarren);
		
		list = (ListView)findViewById(R.id.listhargavincarren);
		CostumListHargaVincarren adapter = new
	    CostumListHargaVincarren(ListHargaVincarren.this,menu, keterangan, listimageharga);		
		list.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list_harga_vincarren, menu);
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
