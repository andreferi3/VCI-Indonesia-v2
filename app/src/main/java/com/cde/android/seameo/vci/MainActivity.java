package com.cde.android.seameo.vci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void goLogin(View view){
        Intent masuk = new Intent(this, MenuUtama.class);
        startActivity(masuk);
    }
}
