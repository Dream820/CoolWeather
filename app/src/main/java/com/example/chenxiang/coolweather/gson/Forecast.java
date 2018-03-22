package com.example.chenxiang.coolweather.gson;

/**
 * Created by chenxiang on 2018/3/22.
 */

import com.google.gson.annotations.SerializedName;

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }

}
