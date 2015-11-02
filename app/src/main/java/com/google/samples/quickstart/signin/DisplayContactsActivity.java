package com.google.samples.quickstart.signin;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.plus.Plus;

public class DisplayContactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_contacts);
        // TODO: 2/11/15 enable the sign-out button and go back to the previous page when it is clicked.








        Intent intent = getIntent();
        String email = intent.getStringExtra(MainActivity.KEY);

        TextView textView = (TextView) findViewById(R.id.text1);

        if(email == null) {
            textView.setText("it is null");
        }
        else if("".equals(email)) {
            email = "EMPTY";
            textView.setText(email);
        }
        else {
            textView.setText("we don't know :|");
        }


    }

}
