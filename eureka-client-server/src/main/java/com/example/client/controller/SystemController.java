package com.example.client.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("system")
public class SystemController {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String serviceName;

    /**
     *  获取系统信息
     * @return
     */
    @RequestMapping("getMessage")
    @ResponseBody
    public String getInfo(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("port",port);
        jsonObject.put("serviceName",serviceName);
        return jsonObject.toString();
    }
}
