package id.mahmud.aplikasitoko;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CostumListview extends ArrayAdapter<String> {
//deklarasi
	private final Activity context;
	private final String[] web;
	private final Integer[] imageId;
	private final String[] trans;
	
	public CostumListview(Activity context,String[] web,String[] trans, Integer[] imageId){
		super(context,R.layout.activity_costum_listview, web);
		this.context=context;
		this.web = web;
		this.imageId = imageId;
		this.trans = trans;

	}

	@Override
	public View getView(int position, View view, ViewGroup parent){
		LayoutInflater inflater = context.getLayoutInflater();
		
		//load costumlayaout untuk list
		View rowView = inflater.inflate(R.layout.activity_costum_listview, null);
		//Deklarasi Komponen
		TextView txttitle = (TextView) rowView.findViewById(R.id.tvNama);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.imgIcon);
		TextView txtket =(TextView)rowView.findViewById(R.id.tvketerangan);
		
		//Setparameter Value
		txttitle.setText(web[position]);
		imageView.setImageResource(imageId[position]);
		txtket.setText(trans[position]);
		
		
		return rowView;
	}
}
