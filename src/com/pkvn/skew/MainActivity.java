package com.pkvn.skew;

import com.ramp.skew.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	private com.pkvn.skew.CustomListView listView;
	
	// contacts list
	String[] contacts ={
			"Alex Travel",
			"Anneal Chris",
			"James Connelly",
			"Amanda Miller",
			"Antony Bernard",
			"James Felkins",
			"Matt Damon",
			"Tony Stark",
			"Orval Gile",
			"Raina Aldinger",
			"Cher Mcgonigal",
			"Deetta Escovedo",
			"Flavia Hepp",
			"Angelena Veitch",
			"Rocio Santora",
			"Kristofer Rieger",
			"Mariko Sackett",
			"Charley Budde",
			"Chuck Burbach",
			"Kisha Knisley",
			"Brigida Whitt",
			"Dione Maynard",
			"Jesse Wideman",
			"Priscila Hamil",
			"Shaina Leeson",
			"Deshawn Katz",
			"Lanie Scalzo",
			"Lorri Snapp",
			"Alex Travel",
			"Anneal Chris",
			"James Connelly",
			"Amanda Miller",
			"Antony Bernard",
			"James Felkins",
			"Matt Damon",
			"Tony Stark",
			"Orval Gile",
			"Raina Aldinger",
			"Cher Mcgonigal",
			"Deetta Escovedo",
			"Flavia Hepp",
			"Angelena Veitch",
			"Rocio Santora",
			"Kristofer Rieger",
			"Mariko Sackett",
			"Charley Budde",
			"Chuck Burbach",
			"Kisha Knisley",
			"Brigida Whitt",
			"Dione Maynard",
			"Jesse Wideman",
			"Priscila Hamil",
			"Shaina Leeson",
			"Deshawn Katz",
			"Lanie Scalzo",
			"Lorri Snapp"
		};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		listView = (com.pkvn.skew.CustomListView) findViewById(R.id.id_contactsList);
		
		listView.setAdapter(new ArrayAdapter<String>(this, R.layout.contacts_list_row_item, R.id.id_contactName, contacts));
		
		listView.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// width of view
				int width = v.getWidth();
				
				int viewX;
				int viewY;
				int[] viewLoc = new int[2];
				
				//get actual px 
				v.getLocationInWindow(viewLoc);
				viewX = viewLoc[0];
				viewY = viewLoc[1];
				
				//skewed width
				int wX = viewX + width;
				
				//get event x, y
				float eventX = event.getRawX();
				float eventY = event.getRawY();
				
				int poiStart = (int) ((viewX + ((eventY - viewY) * 0.3)));
				int poiEnd = poiStart + width;
				
				//compare
				if (eventX >= poiStart && eventX <= wX) {
					return false;
				} else if (eventX >= poiStart && eventX > wX) {
					return false;
				}
					else 
					return true;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
