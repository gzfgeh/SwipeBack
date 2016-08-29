package com.gzfgeh.swipebackdemo;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Description:
 * Created by guzhenfu on 2016/8/29 10:42.
 */
public class ThirdActivity extends BaseActivity{

    @BindView(R.id.next_activity)
    Button nextActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.next_activity)
    void goActivity(){
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}
