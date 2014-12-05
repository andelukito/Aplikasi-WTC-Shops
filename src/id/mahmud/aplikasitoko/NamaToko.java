package id.mahmud.aplikasitoko;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class NamaToko extends Activity {
	
	//Deklarasi Array menu dan gambar
		ListView list;
		
		String[] menu = {
				"Hammer",
				"Giordano",
				"Vincarren"
		};
		String[]keterangan = {
						"Produk ini merupakan produk dalam negeri,Indonesia.",
						"Giordano didirikan di WTC Jambi pada tahun 2000",
						"Sebuah butik yang terletak di WTC Jambi.Butik ini memiliki khas dengan koleksinya yang up to date.",
						
				};

		Integer[] imageId = {
				R.drawable.icon_hammer,
				R.drawable.icon_girdiano,
				R.drawable.icon_vicreen
				
		};
	
	   @Override
	   protected void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
				setContentView(R.layout.activity_nama_toko);
				
				        CostumListview adapter = new 
						CostumListview(NamaToko.this, menu, keterangan, imageId);
						
						//getid List
						list =(ListView)findViewById(R.id.list);
						
						list.setAdapter(adapter);
						
						list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> parent, View view, int position, long id){
					String pilihan =(list.getItemAtPosition(position).toString());
					Intent i = null;
				
					if(pilihan.equals("Hammer")){
						i = new Intent(NamaToko.this,KeteranganTokoHammer.class);
						startActivity(i);
						
						}
						else if(pilihan.equals("Giordano")){
						i = new Intent(NamaToko.this,KeteranganTokogiordano.class);
						startActivity(i);
					   
						}
						else if(pilihan.equals("Vincarren")){
							i = new Intent(NamaToko.this,KeteranganTokoVicarren.class);
							startActivity(i);
		               
						}
						
					 Toast.makeText(NamaToko.this, "Anda Memilih " + menu[+ position], Toast.LENGTH_SHORT).show();
				}
			});			
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.nama_toko, menu);
			return true;
		}
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			// Handle action bar item clicks here. The action bar will
			// automatically handle clicks on the Home/Up button, so long
			// as you specify a parent activity in AndroidManifest.xml.
			/*switch(item.getItemId()){
			case R.id.action_back:
				Intent trans = new Intent(NamaToko.this,MenuUtama.class);
				startActivity(trans);
				finish();
				return true;
			}*/
			return super.onOptionsItemSelected(item);
		}

		
	}
