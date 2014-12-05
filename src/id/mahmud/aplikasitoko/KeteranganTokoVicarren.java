package id.mahmud.aplikasitoko;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class KeteranganTokoVicarren extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_keterangan_toko_vicarren);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.keterangan_toko_vicarren, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		/*switch(item.getItemId()){
		case R.id.action_back:
			Intent transistor = new Intent(getApplicationContext(),NamaToko.class);
			startActivity(transistor);
			finish();
			
		}*/
		return super.onOptionsItemSelected(item);
	}
}
