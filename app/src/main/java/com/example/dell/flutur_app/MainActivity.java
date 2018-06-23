package com.example.dell.flutur_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView myImage;
    private ViewGroup myView;
    private int _xdelta, _ydelta;
    private static final String TAG = "My Message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImage = findViewById(R.id.imageView);
        myView = findViewById(R.id.view_root);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(150,150);

        myImage.setLayoutParams(layoutParams);
        myImage.setOnTouchListener(new ChoiceTouchListener());

    }

    private class ChoiceTouchListener implements View.OnTouchListener{


        @Override
        public boolean onTouch(View v, MotionEvent event) {

            int x,y;
            x = (int) event.getRawX();
            y = (int) event.getRawY();

            switch (event.getAction() & MotionEvent.ACTION_MASK) {

                case MotionEvent.ACTION_DOWN:
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) v.getLayoutParams();
                    _xdelta = x - layoutParams.leftMargin;
                    _ydelta = y - layoutParams.topMargin;
                    break;

                case MotionEvent.ACTION_UP:
                    break;

                case MotionEvent.ACTION_POINTER_DOWN:
                    break;

                case MotionEvent.ACTION_POINTER_UP:
                    break;

                case MotionEvent.ACTION_MOVE:
                    RelativeLayout.LayoutParams layoutParams1 = (RelativeLayout.LayoutParams) v.getLayoutParams();
                    layoutParams1.leftMargin = x - _xdelta;
                    layoutParams1.topMargin = y - _ydelta;
                    layoutParams1.bottomMargin = -250;
                    layoutParams1.rightMargin = -250;
                    v.setLayoutParams(layoutParams1);
                    break;

            }

            Log.d(TAG,"X coordinate value is " + x);
            Log.d(TAG,"Y coordinate value is " + y);
            

            myView.invalidate();
            return true;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.activity2)
        {
            startActivity(new Intent(MainActivity.this,Keyboard_Activity.class));
        }
        return true;
    }

}
