package com.example.seadee.glideorpicasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.img);
        tv = (TextView) findViewById(R.id.tv);
        Glide.with(this)
                .load("http://imgsrc.baidu.com/imgad/pic/item/574e9258d109b3deb13fbe4cc6bf6c81800a4c15.jpg")
                .placeholder(R.mipmap.ic_launcher)
                .into(img);
    }

    public void loadImage(){
        String url = "http://imgsrc.baidu.com/imgad/pic/item/574e9258d109b3deb13fbe4cc6bf6c81800a4c15.jpg";
        Glide.with(this)
                .load(url)
                .placeholder(R.mipmap.ic_launcher)
                .into(img);
    }

}
