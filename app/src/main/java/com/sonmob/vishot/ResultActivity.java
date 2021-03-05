package com.sonmob.vishot;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.sonmob.vishot.databinding.ActivityMainBinding;
import com.sonmob.vishot.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {

    ActivityResultBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imgAvatar.setImageURI(getIntent().getData());
    }
}