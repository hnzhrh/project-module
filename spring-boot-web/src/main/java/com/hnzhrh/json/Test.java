package com.hnzhrh.json;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        User user = JSON.parseObject("{\n" +
                "\t\"name\": \"hnzhrh\",\n" +
                "\t\"age\": 19\n" +
                "}",User.class);
        System.out.println(user);
        User user1 = new User();
        user1.setAge(10);
        System.out.println(JSON.toJSONString(user1));
    }
}
