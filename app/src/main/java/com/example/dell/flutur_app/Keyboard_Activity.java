package com.example.dell.flutur_app;

import android.app.Activity;
import android.content.Intent;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

public class Keyboard_Activity extends AppCompatActivity {

    private Keyboard mkeyboard;
    private TextView textView;
    private KeyboardView keyboardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyboard_);

        textView = findViewById(R.id.textView1);
        mkeyboard = new Keyboard(this,R.xml.keyboard);
        keyboardView = findViewById(R.id.keyboard_view);
        keyboardView.setKeyboard(mkeyboard);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKeyboard(v);
            }
        });
        keyboardView.setOnKeyboardActionListener(new KeyboardView.OnKeyboardActionListener() {
            @Override
            public void onPress(int primaryCode) {

            }

            @Override
            public void onRelease(int primaryCode) {

            }

            @Override
            public void onKey(int primaryCode, int[] keyCodes) {

                if (primaryCode == 1)
                    Log.d("Key Pressed is ","Q" );
                if (primaryCode == 2)
                    Log.d("Key Pressed is ","W" );
                if (primaryCode == 3)
                    Log.d("Key Pressed is ","E" );
                if (primaryCode == 4)
                    Log.d("Key Pressed is ","R" );
                if (primaryCode == 5)
                    Log.d("Key Pressed is ","T" );
                if (primaryCode == 6)
                    Log.d("Key Pressed is ","Y" );
                if (primaryCode == 7)
                    Log.d("Key Pressed is ","U" );
                if (primaryCode == 8)
                    Log.d("Key Pressed is ","I" );
                if (primaryCode == 9)
                    Log.d("Key Pressed is ","O" );
                if (primaryCode == 10)
                    Log.d("Key Pressed is ","P" );
                if (primaryCode == 11)
                    Log.d("Key Pressed is ","A" );
                if (primaryCode == 12)
                    Log.d("Key Pressed is ","S" );
                if (primaryCode == 13)
                    Log.d("Key Pressed is ","D" );
                if (primaryCode == 14)
                    Log.d("Key Pressed is ","F" );
                if (primaryCode == 15)
                    Log.d("Key Pressed is ","G" );
                if (primaryCode == 16)
                    Log.d("Key Pressed is ","H" );
                if (primaryCode == 17)
                    Log.d("Key Pressed is ","J" );
                if (primaryCode == 18)
                    Log.d("Key Pressed is ","K" );
                if (primaryCode == 19)
                    Log.d("Key Pressed is ","L" );
                if (primaryCode == 20)
                    Log.d("Key Pressed is ","Z" );
                if (primaryCode == 21)
                    Log.d("Key Pressed is ","X" );
                if (primaryCode == 22)
                    Log.d("Key Pressed is ","C" );
                if (primaryCode == 23)
                    Log.d("Key Pressed is ","V" );
                if (primaryCode == 24)
                    Log.d("Key Pressed is ","B" );
                if (primaryCode == 25)
                    Log.d("Key Pressed is ","N" );
                if (primaryCode == 26)
                    Log.d("Key Pressed is ","M" );
                if (primaryCode == -1)
                    Log.d("Key Pressed is ","BACKSPACE" );
                if (primaryCode == 100)
                    Log.d("Key Pressed is ","ENTER" );




            }

            @Override
            public void onText(CharSequence text) {

            }

            @Override
            public void swipeLeft() {

            }

            @Override
            public void swipeRight() {

            }

            @Override
            public void swipeDown() {

            }

            @Override
            public void swipeUp() {

            }
        });

    }

    private void openKeyboard(View v) {

        keyboardView.setVisibility(View.VISIBLE);
        keyboardView.setEnabled(true);
        if( v != null)
            ((InputMethodManager)getSystemService(Activity.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(v.getWindowToken(), 0);

    }


}
