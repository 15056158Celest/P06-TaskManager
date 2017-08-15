package com.myapplicationdev.android.p06_taskmanager;

import android.content.Intent;
import android.support.v4.app.RemoteInput;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ReplyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reply);

        CharSequence add = null;
        Intent intent = getIntent();
        Bundle remoteInput = RemoteInput.getResultsFromIntent(intent);
        if (remoteInput != null){
            add = remoteInput.getCharSequence("status");
        }

        if(add != null){
            Toast.makeText(ReplyActivity.this, "You have indicated: " + add,
                    Toast.LENGTH_SHORT).show();
        }
    }
}
