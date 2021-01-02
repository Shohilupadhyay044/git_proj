package com.example.projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class Photo_Activity extends AppCompatActivity {

    ImageView imageV1;
    ImageView imageG1;
    ImageView imageG2;
    ImageView imageG3;
    ImageView imageG4;
    ImageView imageV2;
    ImageView imageV3;
    ImageView imageV4;


    private static final int PICK_IMAGE = 100;
    private static final int PICK_IMAGES=110;
    Uri imageUri;
    Uri imageUri1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_);

        imageV1 = findViewById(R.id.plus1);
        imageV2 = findViewById(R.id.plus2);
        imageV3 = findViewById(R.id.plus3);
        imageV4 = findViewById(R.id.plus4);
        imageG1 = findViewById(R.id.image1);
        imageG2 = findViewById(R.id.image2);
        imageG3 = findViewById(R.id.image3);
        imageG4 = findViewById(R.id.image4);

    }


    public void Gallery(View view) {
        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery, PICK_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == PICK_IMAGE) {
            imageUri = data.getData();
            imageG1.setImageURI(imageUri);
        } if (resultCode == RESULT_OK && requestCode == PICK_IMAGES) {
            imageUri1 = data.getData();
            imageG2.setImageURI(imageUri1);
        }
    }


    public void visible(View view) {

        imageV1.setVisibility(View.INVISIBLE);

    }

    public void Next(View view) {
        Intent intent = new Intent(Photo_Activity.this,Introduce_Activity.class);
        startActivity(intent);
        finish();

    }

    public void visible3(View view) {
        imageV3.setVisibility(View.INVISIBLE);
    }

    public void visible2(View view) {
        imageV2.setVisibility(View.INVISIBLE);
    }

    public void visible4(View view) {
        imageV4.setVisibility(View.INVISIBLE);
    }


    public void Gallery1(View view) {
        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery, PICK_IMAGE);
    }


    public void Gallery3(View view) {
        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery, PICK_IMAGE);
    }

    public void Gallery4(View view) {
        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery, PICK_IMAGE);
    }
}



