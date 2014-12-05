package id.mahmud.aplikasitoko;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.view.Menu;
import android.view.MenuItem;

public class ListHargaGiordano extends Activity {
	//deklarasi 
	ListView list;
	//Button btngambar;
	
	String[] menu = {
			"Rip Curl",
			"Black anggel",
			"Giordano",
			"Giordano",
			"Diery",
			"Kameja Giordano",
			"Kameja Giordano",
			"Kameja Black Id",
			"Kameja Levis",
			"Lois",
			"Cardinal",
			"Cardinal",
			"Cardinal",
			"Lois"
	};
	String[] keterangan = {
			"Rp : 80.000",
			"Rp : 90.000",
			"Rp : 90.000",
			"Rp : 90.000",
			"Rp : 80.000",
			"Rp : 150.000",
			"Rp : 100.000",
			"Rp : 100.000",
			"Rp : 130.000",
			"Rp : 120.000",
			"Rp : 450.000",
			"Rp : 450.000",
			"Rp : 450.000",
			"Rp : 300.000"
	};
	
	Integer[] listimageharga = {
			R.drawable.giordanokaos1,
			R.drawable.giordanokaos2,
			R.drawable.giordanokaos3,
			R.drawable.giordanokaos4,
			R.drawable.giordanokaos5,
			R.drawable.giordanokaos6,
			R.drawable.giordanokaos6,
			R.drawable.giordanokaos7,
			R.drawable.giordanokaos8,
			R.drawable.giordanokaos9,
			R.drawable.giordanocelana10,
			R.drawable.giordanocelana11,
			R.drawable.giordanocelana12,
			R.drawable.giordanocelana13,
			R.drawable.giordanocelana14
	};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_harga_giordano);
		
		list = (ListView)findViewById(R.id.listhargagiordano);
		CostumListHargaGiordano adapter = new
	    CostumListHargaGiordano(ListHargaGiordano.this,menu, keterangan, listimageharga);		
		list.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list_harga_giordano, menu);
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
