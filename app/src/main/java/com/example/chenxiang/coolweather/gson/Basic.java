package com.example.chenxiang.coolweather.gson;

/**
 * Created by chenxiang on 2018/3/22.
 */
import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city")//用@SerializedName注释的方式让JSON字段和Java字段建立映射关系
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
