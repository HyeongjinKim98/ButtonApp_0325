package com.example.buttonapp_0325;

import android.view.View;

public class MyOnClicklistener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClicklistener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v){
        mainActivity.textView1.setText("You Clicked 김형진의 Button!");
    }
}
