package id.mahmud.aplikasitoko;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CostumMenuutama extends ArrayAdapter<String> {

	private final Activity context;
	private final String[] web;
	private final Integer[] imageId;
	
	public CostumMenuutama(Activity context,String[] web, Integer[] imageId){
		super(context,R.layout.activity_costum_menuutama, web);
		this.context=context;
		this.web = web;
		this.imageId = imageId;

	}


	@Override
	public View getView(int position, View view, ViewGroup parent){
		LayoutInflater inflater = context.getLayoutInflater();
		
		//load costumlayaout untuk list
		View rowView = inflater.inflate(R.layout.activity_costum_menuutama, null);
		//Deklarasi Komponen
		TextView txttitle = (TextView) rowView.findViewById(R.id.tvNama);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.imgIcon);
		
		//Setparameter Value
		txttitle.setText(web[position]);
		imageView.setImageResource(imageId[position]);
		
		return rowView;
	}
}
