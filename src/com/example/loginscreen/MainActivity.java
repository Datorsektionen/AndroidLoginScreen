package com.example.loginscreen;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* Set the layout we want to use in the activity. Here we use login.xml. */
        setContentView(R.layout.login);
    }
}
