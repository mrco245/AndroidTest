package com.datechnologies.androidtest.login;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.datechnologies.androidtest.MainActivity;
import com.datechnologies.androidtest.R;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * A screen that displays a login prompt, allowing the user to login to the D & A Technologies Web Server.
 *
 */
public class LoginActivity extends AppCompatActivity {

    String email = "";
    String password = "";
    //==============================================================================================
    // Static Class Methods
    //==============================================================================================

    public static void start(Context context)
    {
        Intent starter = new Intent(context, LoginActivity.class);
        context.startActivity(starter);
    }

    //==============================================================================================
    // Lifecycle Methods
    //==============================================================================================

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ActionBar actionBar = getSupportActionBar();

        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        // TODO: Make the UI look like it does in the mock-up. Allow for horizontal screen rotation.
        // TODO: Add a ripple effect when the buttons are clicked
        // TODO: Save screen state on screen rotation, inputted username and password should not disappear on screen rotation


        email = findViewById(R.id.email).toString();
        password = findViewById(R.id.password).toString();

        Button Login = findViewById(R.id.login);

        //couldn't get this to work, if i had more time this would be done

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: Send 'email' and 'password' to http://dev.rapptrlabs.com/Tests/scripts/login.php
                // TODO: as FormUrlEncoded parameters.

                // TODO: When you receive a response from the login endpoint, display an AlertDialog.
                // TODO: The AlertDialog should display the 'code' and 'message' that was returned by the endpoint.
                // TODO: The AlertDialog should also display how long the API call took in milliseconds.
                // TODO: When a login is successful, tapping 'OK' on the AlertDialog should bring us back to the MainActivity

                // TODO: The only valid login credentials are:
                // TODO: email: info@datechnologies.co
                // TODO: password: Test123
                // TODO: so please use those to test the login.

         }

        });
    }

        @Override
    public void onBackPressed()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
