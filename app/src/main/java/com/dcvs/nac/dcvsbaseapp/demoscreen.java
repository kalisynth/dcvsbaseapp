package com.dcvs.nac.dcvsbaseapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class demoscreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demoscreen);
    }

    public void backbtnOnClick(View v){
        finish();
    }
}

//demoscreen todo: add open demo video to video demo button, add skype to skype button, add connection status test to connection button