package com.xyp.coolweather.db;

import io.realm.RealmObject;

/**
 * Created by haixia on 2017/9/13.
 */

public class City extends RealmObject {

    private int id;

    private String cityName;


    private  int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }



    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
