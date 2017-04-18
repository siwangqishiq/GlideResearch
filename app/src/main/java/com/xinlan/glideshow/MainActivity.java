package com.xinlan.glideshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private ImageView mImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImage = (ImageView)findViewById(R.id.image);

        Glide.with(this).load("https://timgsa.baidu.com/timg?" +
                "image&quality=80&size=b9999_10000&sec=1492408052610&di=473ea9eb9911ceb0aed8c62287ded4f4&imgtype=0&src=http%3A%2F%2Fimages." +
                "17173.com%2F2016%2Fnews%2F2016%2F08%2F31%2Fl0831qe05.gif").into(mImage);
    }
}//end class
