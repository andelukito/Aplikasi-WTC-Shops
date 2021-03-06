package id.mahmud.aplikasitoko;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CostumListHargaGiordano extends ArrayAdapter<String> {

	//deklarasi
	private final Activity context;
	private final String[] web;
	private final String[] ket;
	private final Integer[] imageId;
	
        public CostumListHargaGiordano(Activity context,String[] web,String[]ket, Integer[] imageId){
		super(context,R.layout.activity_costum_list_harga_giordano, web);
		this.context=context;
		this.web = web;
		this.ket = ket;
		this.imageId = imageId;
		
	}
        public View getView(int position, View view, ViewGroup parent){
			LayoutInflater inflater = context.getLayoutInflater();
			
			//load costumlayaout untuk list
			View rowView = inflater.inflate(R.layout.activity_costum_list_harga_giordano,null);
			
			//Deklarasi Komponen
			TextView txttitle = (TextView) rowView.findViewById(R.id.tvNama);
			TextView txtket = (TextView)rowView.findViewById(R.id.tvketerangan);
			ImageView imageView = (ImageView) rowView.findViewById(R.id.imgIcon);
			
			//Setparameter Value
			txttitle.setText(web[position]);
			txtket.setText(ket[position]);
			imageView.setImageResource(imageId[position]);
			
			return rowView;
		}
}
