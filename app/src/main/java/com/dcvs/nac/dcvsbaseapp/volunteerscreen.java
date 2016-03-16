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
        finish();
    }

}

//volunteerscreen todo: setup new tablet button = install and update apps + change settings + add google/skype accounts. refresh tablet button = check installed apps + update the ones that need updating + delete unauthorised apps. factory reset = factory reset the tablet.
