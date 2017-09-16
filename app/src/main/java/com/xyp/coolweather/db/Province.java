package com.xyp.coolweather.db;

import io.realm.RealmObject;

/**
 * Created by haixia on 2017/9/13.
 */

public class Province extends RealmObject {

    private int id;

    private String provinceName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }


}
