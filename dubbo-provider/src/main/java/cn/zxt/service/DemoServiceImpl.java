package cn.zxt.service;

import cn.zxt.api.DemoService;

public class DemoServiceImpl implements DemoService {
    @Override
    public String hello(String name) {
        return "Hello,"+name;
    }
}
