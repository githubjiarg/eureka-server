package com.example.ribbonServer.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.ribbonServer.config.properties.PropertiesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("system")
public class SystemController{

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private PropertiesBean propertiesBean;

    /**
     *  获取系统信息
     * @return
     */
    @RequestMapping("getMessage")
    @ResponseBody
    public JSONObject getInfo(){
        String url = propertiesBean.ribbonUri + "/system/getMessage";
        return restTemplate.getForObject(url,JSONObject.class);
    }

}
