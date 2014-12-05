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

public class PakaianVincarren extends Activity {
	
	public static Integer[] imageVC = {
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
	GridView gridView;
	Button btnlistgambar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pakaian_vincarren);
		
        gridView =(GridView)findViewById(R.id.galeryImageVn);
		
		btnlistgambar = (Button)findViewById(R.id.btngambarvincarren);
		btnlistgambar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent trans = new Intent(getApplicationContext(),ListHargaVincarren.class);
				startActivity(trans);
			}
		});
        gridView.setAdapter(new ImageAdapter(this));
		
		
		gridView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id){
				Toast.makeText(getBaseContext(),"Gambar" + (position)  + "Yang dipilih",
						Toast.LENGTH_SHORT).show();
				//Untuk memanggil Detail harga vincarren
				DetailVincarrenkaos(position);
				
			}
		});
		
		
	}  
	protected void DetailVincarrenkaos(int position){
		Intent i = new Intent(this, DetailVincarren.class);
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
			return imageVC.length;
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
				imageView.setImageResource(imageVC[position]);
				return imageView;
				}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pakaian_vincarren, menu);
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
