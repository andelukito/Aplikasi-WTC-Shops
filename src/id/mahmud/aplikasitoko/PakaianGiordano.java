package id.mahmud.aplikasitoko;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;

public class PakaianGiordano extends Activity {
	
	public static Integer[] imageGD = {
		R.drawable.giordanokaos1,
		R.drawable.giordanokaos2,
		R.drawable.giordanokaos3,
		R.drawable.giordanokaos4,
		R.drawable.giordanokaos5,
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
	
	GridView gridView;
	Button btnlistgambar;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pakaian_giordano);
		
        gridView =(GridView)findViewById(R.id.galerygiordano);
		
		btnlistgambar = (Button)findViewById(R.id.btnhargagiordano);
		btnlistgambar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent trans = new Intent(getApplicationContext(),ListHargaGiordano.class);
				startActivity(trans);
			}
		});
        gridView.setAdapter(new ImageAdapter(this));
		
		
		gridView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id){
				Toast.makeText(getBaseContext(),"Gambar" + (position)  + "Yang dipilih",
						Toast.LENGTH_SHORT).show();
				//Untuk memanggil Detail harga Hammer
				DetailGiordanokaos(position);
				
			}
		});
		
		
	}  
	protected void DetailGiordanokaos(int position){
		Intent i = new Intent(this, DetailGiordano.class);
		Bundle m = new Bundle();
		m.putInt("posisi",position);
		i.putExtras(m);
		startActivity(i);
	}
	public class ImageAdapter extends BaseAdapter {
		Context context;
		int itemBackground;
		public ImageAdapter(Context c){
			context = c;
			
		}
		@Override
		public int getCount(){
			return imageGD.length;
		}
		@Override
		public Object getItem(int position){
			return position;
		}
		public long getItemId(int position){
			return position;
		}
		@Override
		public View getView(int position, View convertView, ViewGroup parent){
			ImageView imageView;
			if(convertView == null){
				imageView = new ImageView(context);
				imageView.setLayoutParams(new GridView.LayoutParams(150, 150));
				imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
				imageView.setPadding(5, 30, 5, 5);
				}else {
				imageView = (ImageView) convertView;
				}
				imageView.setImageResource(imageGD[position]);
				return imageView;
				}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pakaian_giordano, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		/*switch(item.getItemId()){
		case R.id.action_back:
			Intent trans = new Intent(getApplicationContext(),JenisPakaian.class);
			startActivity(trans);
			finish();
			return true;
		}*/
		return super.onOptionsItemSelected(item);
	}
}
