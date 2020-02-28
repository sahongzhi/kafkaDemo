package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Author: SaHongzhi
 * @Date: 2020-02-28 13:23
 */
@Getter
@Setter
@ToString
public class Message {
    private Long id;    //id

    private String msg; //消息

    private Date sendTime;  //时间戳

}
