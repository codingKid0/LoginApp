package com.example.loginapp_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        TextView userIdentifier = findViewById(R.id.userIdentifier);
        String username = getIntent().getStringExtra("username");

        Button googleBtn = findViewById(R.id.googleBtn);
        Button dialBtn = findViewById(R.id.dialBtn);
        Button mailBtn = findViewById(R.id.mailBtn);

        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String googleUrl = "https://www.google.com";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(googleUrl));
                startActivity(intent);
            }
        });

        dialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "09397998716";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });

        mailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mailAddress = "thecodingkido@gmail.com";
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:" + mailAddress));
                startActivity(intent);
            }
        });
    }
}