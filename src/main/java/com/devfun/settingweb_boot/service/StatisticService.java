package com.devfun.settingweb_boot.service;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface StatisticService {
    public HashMap<String,Object> yearloginNum (String year);
    public HashMap<String,Object> monthloginNum (String month);
    public HashMap<String,Object> dayloginNum (String day);

}