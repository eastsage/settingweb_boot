package com.devfun.settingweb_boot.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.devfun.settingweb_boot.dao.StatisticMapper;
import com.devfun.settingweb_boot.service.StatisticService;



@Controller
public class settingTest {


    @Autowired
    private StatisticService service;

    @ResponseBody
    @RequestMapping("/sqlStatistic/year")
    public Map<String, Object> sqltestyear(String year) throws Exception{
        System.out.println("service = " + service.yearloginNum(year));
        return service.yearloginNum(year);
    }

    @ResponseBody
    @RequestMapping("/sqlStatistic/month")
    public Map<String, Object> sqltestmonth(String month) throws Exception{
        System.out.println("service = " + service.monthloginNum(month));
        return service.monthloginNum(month);
    }

    @ResponseBody
    @RequestMapping("/sqlStatistic/day")
    public Map<String, Object> sqltestday(String day) throws Exception{
        System.out.println("service = " + service.dayloginNum(day));
        return service.dayloginNum(day);
    }

    @RequestMapping("/test")
    public ModelAndView test() throws Exception{
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name", "devfunpj");
        List<String> resultList = new ArrayList<String>();
        resultList.add("!!!HELLO WORLD!!!");
        resultList.add("설정 TEST!!!");
        resultList.add("설정 TEST!!!");
        resultList.add("설정 TEST!!!!!");
        resultList.add("설정 TEST!!!!!!");
        mav.addObject("list", resultList);
        return mav;
    }

}