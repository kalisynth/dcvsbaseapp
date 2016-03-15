package com.dcvs.nac.dcvsbaseapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class volunteerscreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteerscreen);
    }

    public void backbtnOnClick(View v){
        Intent backIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(backIntent, 0);
        finish();
    }

}
