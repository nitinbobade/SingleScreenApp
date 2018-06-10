package com.ni3bobade.singlescreenapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tapMeForPortfolio(View view) {
        Intent portfolioIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.behance.net/ni3bobade"));

        startActivity(portfolioIntent);
    }
}
