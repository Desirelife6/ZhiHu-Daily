package com.example.yc.zhihudaily.Presenter;

import com.example.yc.zhihudaily.Model.Datas;

public class Contract {

    public interface ViewPresenter {
        void initView();
        void refreshView();
        void updateView();
        void setData(Datas datas);
    }

    public interface ListPresenter{
        void getData();
        void refreshData();
        void loadMore(String date);
    }
}
