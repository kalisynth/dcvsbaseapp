package com.dcvs.nac.dcvsbaseapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class aboutscreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutscreen);
    }

    public void backbtnOnClick(View v){
        startActivity(new Intent(aboutscreen.this, MainActivity.class));
    }

    //aboutscreen todo: add info, purpose and contact details button


}
