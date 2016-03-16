package com.dcvs.nac.dcvsbaseapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class clientscreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientscreen);

        EditText clientnametxt = (EditText)findViewById(R.id.clientNameinput);
        clientnametxt.setOnEditorActionListener(new TextView.OnEditorActionListener() {
    @Override
        public boolean onEditorAction(TextView v, int clientnameId, KeyEvent event) {

    }
            });

    public void backbtnOnClick(View v){
        startActivity(new Intent(clientscreen.this, MainActivity.class));
    }



}
