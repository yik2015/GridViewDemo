package com.hema.www.gridviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    GridView gridView;
    private void initView() {
        gridView = (GridView) findViewById(R.id.grdiview);
        gridView.setAdapter(new MyGridAdapter(this));
    }
}
