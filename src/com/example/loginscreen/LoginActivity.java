package com.example.loginscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {

    /** Called when the activity is first created.
     * This is also the activity we've defined in
     * AndroidManifest to be the one to start when
     * the application starts.
     * */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* Set the layout we want to use in the activity. Here we use main.xml. */
        setContentView(R.layout.main);

        /* Find the views in the layout, so we can access them through code. */
        final EditText usernameEditText = (EditText) findViewById(R.id.username);
        final EditText passwordEditText = (EditText) findViewById(R.id.password);

        Button loginButton = (Button) findViewById(R.id.login);

        /* Add a listener to our button. */
        loginButton.setOnClickListener(new View.OnClickListener() {

            /* Executed when the user clicks on the button. */
            @Override
            public void onClick(View view) {
                /* Save the values the user has put into the EditTexts. */
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if(username.equals("jocke") && password.equals("1337")) {

                    /* Create a new intent, and start the new activity. */
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
