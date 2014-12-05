package id.mahmud.aplikasitoko;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.view.View;


public class MenuUtama extends Activity {
 
	//Deklarasi Array menu dan gambar
			ListView list;
			
			String[] menu = {
					"Keterangan Toko",
					"Jenis Pakaian",
					"Bantuan",
					"Tentang Aplikasi",
					"Profil",
					"Exit"
			};
			Integer[] imageId = {
					R.drawable.icon_aplikasi,
					R.drawable.icon_pakaian,
					R.drawable.icon_bantuan,
					R.drawable.icon_tentang,
					R.drawable.icon_profil,
					R.drawable.icon_exit
			};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_utama);
		
		CostumMenuutama adapter = new
		CostumMenuutama(MenuUtama.this, menu, imageId);
		
		list = (ListView)findViewById(R.id.list);
		list.setAdapter(adapter);
		
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id){
				String pilihan =(list.getItemAtPosition(position).toString());
				Intent i = null;
			
				if(pilihan.equals("Keterangan Toko")){
					i = new Intent(MenuUtama.this,NamaToko.class);
					startActivity(i);
					}
					else if(pilihan.equals("Jenis Pakaian")){
					i = new Intent(MenuUtama.this,JenisPakaian.class);
					startActivity(i);
				    
					}
					else if(pilihan.equals("Bantuan")){
						i = new Intent(MenuUtama.this,Bantuan.class);
						startActivity(i);
					}
					else if(pilihan.equals("Tentang Aplikasi")){
						i = new Intent(MenuUtama.this,TentangAplikasi.class);
						startActivity(i);
					}
					else if(pilihan.equals("Profil")){
						i = new Intent(MenuUtama.this,ProfilPembuat.class);
						startActivity(i);
					}
					else if (pilihan.equals("Exit")){
						openexit(null);
					
					}
				 Toast.makeText(MenuUtama.this, "Anda Memilih " + menu[+ position], Toast.LENGTH_SHORT).show();
			}
		});			
	}
	
	
	
    //method untuk keluar
public void openexit(View V){
		AlertDialog alertDialog = new AlertDialog.Builder(this).create();
		alertDialog.setTitle("Exit");
		alertDialog.setIcon(R.drawable.icon_exit);
		
		alertDialog.setMessage("Apakah anda yakin untuk keluar Aplikasi ?");
		alertDialog.setButton("Ya", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			   finish();
			return;
			}
		});
	alertDialog.setButton2("Tidak", new DialogInterface.OnClickListener() {
		
		@Override
		public void onClick(DialogInterface dialog, int which) {
			// TODO Auto-generated method stub
		dialog.cancel();
		return;
		}
	});
	alertDialog.show();
	return;
	}
	
	}
