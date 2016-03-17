package com.dcvs.nac.dcvsbaseapp;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class clientscreen extends Activity {

    public static Account getAccount(AccountManager accountManager) {
        Account[] accounts = accountManager.getAccountsByType("com.google");
        Account account;
        if (accounts.length > 0) {
            account = accounts[0];
        } else {
            account = null;
        }
        return account;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientscreen);
        Account account = getAccount(AccountManager.get(this));
        String accountName = account.name;
        String fullname = accountName.substring(0,accountName.lastIndexOf("dcvs@"));
        final String tabletname = fullname;

        EditText clientnametxt = (EditText) findViewById(R.id.clientNameinput);
        clientnametxt.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int clientnameId, KeyEvent event) {
                String inputText = v.getText().toString();
                Toast.makeText(clientscreen.this, "Hi " + inputText + " My Name is " + tabletname, Toast.LENGTH_SHORT).show();
                ((TextView)findViewById(R.id.greetingTxt)).setText(getString(R.string.greetings_message, inputText, tabletname));
                ((TextView)findViewById(R.id.tabletinfotxt)).setText(getString(R.string.tabletinfo, tabletname));
                return true;
            }
        });
    }

    public void backbtnOnClick(View v){
        startActivity(new Intent(clientscreen.this, MainActivity.class));
    }

//clientscreen todo: add info, purpose, contact buttons, make it so client cannot proceed unless read all three screens.(get blurbs and info from Sarah)
// todo: client screen loop - client enters name, presses done then the input box hides, the ok and info buttons appear, greeting text changes to Hi, clientname, my name is tablet name, provide tablet info, please click the buttons, when ok button is pressed then button text changes to Get started, when get started is pressed it will check if the 3 info buttons have been pressed and if they have will close this app and open overlays

}
