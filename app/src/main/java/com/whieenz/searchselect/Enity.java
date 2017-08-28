package com.whieenz.searchselect;

import java.io.Serializable;

/**
 * Created by wangyawen on 2017/8/28 0028.
 */

public class Enity implements Serializable {




    private String city;
    private boolean selCity = false;//默认不选中


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isSelCity() {
        return selCity;
    }

    public void setSelCity(boolean selCity) {
        this.selCity = selCity;
    }

    @Override
    public String toString() {
        return "Enity{" +
                "city='" + city + '\'' +
                ", selCity=" + selCity +
                '}';
    }
}
