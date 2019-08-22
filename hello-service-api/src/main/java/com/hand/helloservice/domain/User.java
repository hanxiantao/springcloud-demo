package com.hand.helloservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description:
 * @version: 1.0
 * @author: xiantao.han@hand-china.com
 * @Date: 2019/7/27
 */
@Data
@AllArgsConstructor
public class User {
    private String name;
    private int age;
}
