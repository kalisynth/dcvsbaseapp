package com.dcvs.nac.dcvsbaseapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class clientscreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientscreen);
    }

    public void backbtnOnClick(View v){
        startActivity(new Intent(clientscreen.this, MainActivity.class));
    }

}
