package com.xinlan.glideshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private ImageView mImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImage = (ImageView)findViewById(R.id.image);


        Glide.get(this).clearMemory();
        //Glide.get(this).clearDiskCache();

        Glide.with(this).load("https://api.29029.com/upload/file/1a5516/201808/20180823zUISvRrvLXmW.jpg").into(mImage);


        //Glide.get(this).trimMemory();
//        RequestManager requestManager = Glide.with(this);
//        RequestBuilder builder = requestManager.load("");
//        builder.into(mImage);
    }
}//end class
