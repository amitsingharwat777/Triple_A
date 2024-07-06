package com.example.triple_a;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private TextView tvName, tvEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvName = findViewById(R.id.tvName);
        tvEmail = findViewById(R.id.tvEmail);

        // Retrieve data from intent
        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");

        // Set data to TextViews
        tvName.setText(name);
        tvEmail.setText(email);
    }
}
