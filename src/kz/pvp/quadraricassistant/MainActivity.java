package kz.pvp.quadraricassistant;

import kz.pvp.quadraricassistant.Enums.MainButton;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
        final Button button = (Button) findViewById(R.id.about_us);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	OpenNewWindow(MainButton.AboutUs);
            }
        });
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	private void OpenNewWindow(MainButton pageRq) {
		if (pageRq == MainButton.AboutUs){
			
		}
		else if (pageRq == MainButton.Calculate){
			
		}
		else if (pageRq == MainButton.Instructions){
			
		}
	}
	
	
	

}
