package com.devfun.settingweb_boot.service;


import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devfun.settingweb_boot.dao.StatisticMapper;

@Service
public class StatisticServiceImpl implements StatisticService {


    @Mapper
    @Autowired
    private StatisticMapper uMapper;

    @Override
    public HashMap<String, Object> yearloginNum (String year) {
    //     TODO Auto-generated method stub
        HashMap<String, Object> y_retVal = new HashMap<String,Object>();


        try {
            System.out.println("시도중");
            y_retVal = uMapper.selectYearLogin(year);
            y_retVal.put("year", year);
            y_retVal.put("is_success", true);

        }catch(Exception e) {
            System.out.println("실패");
            y_retVal.put("totCnt", -999);
            y_retVal.put("year", year);
            y_retVal.put("is_success", false);
        }

        return y_retVal;
    }

    @Override
    public HashMap<String, Object> monthloginNum (String month) {
        //     TODO Auto-generated method stub
        HashMap<String, Object> m_retVal = new HashMap<String,Object>();


        try {
            System.out.println("시도중");
            m_retVal = uMapper.selectMonthLogin(month);
            m_retVal.put("month", month);
            m_retVal.put("is_success", true);

        }catch(Exception e) {
            System.out.println("실패");
            m_retVal.put("totCnt", -999);
            m_retVal.put("month", month);
            m_retVal.put("is_success", false);
        }

        return m_retVal;
    }

    @Override
    public HashMap<String, Object> dayloginNum (String day) {
        //     TODO Auto-generated method stub
        HashMap<String, Object> d_retVal = new HashMap<String,Object>();


        try {
            System.out.println("시도중");
            d_retVal = uMapper.selectDayLogin(day);
            d_retVal.put("day", day);
            d_retVal.put("is_success", true);

        }catch(Exception e) {
            System.out.println("실패");
            d_retVal.put("totCnt", -999);
            d_retVal.put("day", day);
            d_retVal.put("is_success", false);
        }

        return d_retVal;
    }

}