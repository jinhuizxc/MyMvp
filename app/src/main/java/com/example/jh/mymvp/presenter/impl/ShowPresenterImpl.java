package com.example.jh.mymvp.presenter.impl;

import com.example.jh.mymvp.presenter.ShowPresenter;
import com.example.jh.mymvp.view.ShowView;

/**
 * 作者：jinhui on 2017/3/17
 * 邮箱：1004260403@qq.com
 */

public class ShowPresenterImpl implements ShowPresenter {

    private ShowView showView;

    // 构造方法
    public ShowPresenterImpl(ShowView showView) {
        this.showView = showView;
    }

    //在这里写我们对于view的逻辑
    @Override
    public void show() {
        showView.show("android");
    }
}
