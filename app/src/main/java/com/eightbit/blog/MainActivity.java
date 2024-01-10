package com.eightbit.blog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.eightbit.blog.models.RequestDto;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestDto<Object> dto = new RequestDto<>();
        Object data = dto.getData();

    }
}