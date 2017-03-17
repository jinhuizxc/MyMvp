package com.example.jh.mymvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jh.mymvp.presenter.ShowPresenter;
import com.example.jh.mymvp.presenter.impl.ShowPresenterImpl;
import com.example.jh.mymvp.view.ShowView;

public class MainActivity extends AppCompatActivity implements ShowView, View.OnClickListener {

    private TextView textView;
    private Button button;
    private ShowPresenter showPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        showPresenter = new ShowPresenterImpl(this);
        //这个语句逻辑可以根据需求点击按钮或者其他操作完成之后进行view的实现
//        showPresenter.show();
    }

    //界面显示view
    @Override
    public void show(String str) {
        textView.setText(str);
    }

    @Override
    public void onClick(View v) {
        showPresenter.show();
    }
}
