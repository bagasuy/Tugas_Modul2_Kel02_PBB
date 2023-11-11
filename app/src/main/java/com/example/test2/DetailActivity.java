package com.example.test2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
public class DetailActivity extends AppCompatActivity {
    private TextView tvNama;
    private TextView tvAkhir;
    private TextView tvEmail;
    private ImageView tvImage;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvNama = findViewById(R.id.tv_first_name);
        tvAkhir = findViewById(R.id.tv_last_name);
        tvEmail = findViewById(R.id.tv_email);
        tvImage = findViewById(R.id.img_photo_user);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onabout();
            }
        });
        if (getIntent().hasExtra("name") && getIntent().hasExtra("last_name") &&
                getIntent().hasExtra("image") && getIntent().hasExtra("email")) {
            String nama = getIntent().getStringExtra("name");
            String akhir = getIntent().getStringExtra("last_name");
            String email = getIntent().getStringExtra("email");
            String image = getIntent().getStringExtra("image");
            tvNama.setText(nama);
            tvAkhir.setText(akhir);
            tvEmail.setText(email);
            Glide.with(this).load(image).into(tvImage);
        }
    }
    public void onabout(){
        Intent about = new Intent(this, AboutActivity.class);
        startActivity(about);
    }

}
