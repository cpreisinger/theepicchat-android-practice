package com.example.my.first.app;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

	/*public void sendMessage(View view) {
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		EditText editText = (EditText) findViewById(R.id.edit_message);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);
	}*/

	public void clearScreen(View view) {
		((ViewGroup) view).removeAllViews();
	}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout main = (FrameLayout) findViewById(R.id.main_view);
        main.addView(new Ball(this, 360, 512, 100));

//        main.setOnTouchListener(new View.OnTouchListener() {
//        	public boolean onTouch(View v, MotionEvent e) {
//        		float x = e.getX();
//        		float y = e.getY();
//        		FrameLayout flView = (FrameLayout) v;
//        		flView.addView(new Ball(flView.getContext(), x, y, 25));
//        		return true;
//        	}
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
    	case R.id.clear_screen:
    		clearScreen(findViewById(R.id.main_view));
    		return true;
    	default:
            return super.onOptionsItemSelected(item);
    	}
    }
}
