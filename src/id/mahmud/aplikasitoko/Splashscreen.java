package id.mahmud.aplikasitoko;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;

public class Splashscreen extends Activity {
	 ProgressBar bar;
	 boolean Running = false;
     
	 
	 Handler handler = new Handler();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splashscreen);
		bar = (ProgressBar)findViewById(R.id.progressBar1);
		
	}

	//method untuk start Loading
	public void onStart(){
		super.onStart();
		bar.setProgress(0);
		
		Thread transistor = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try{
					for(int i=0; i<40 && Running; i++){
						Thread.sleep(40);
					}
					finish();
				}catch (Throwable e){
					
				}
				Intent intent = new Intent(getApplicationContext(),MenuUtama.class);
				startActivity(intent);
			}
		});
	    
	    Running = true;
	    transistor.start();
	}
	//Method Untuk Stop Loading
	public void onStop(){
		super.onStop();
		Running = false;
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splashscreen, menu);
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
