package com.zy.me.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Users {

    private String id;

    private String userId;//用户ID

    private String userName;//用户名

    private int gender;//性别: 0-女,1-男

    private String realName;//真实姓名

    private String professionCode;//行业代码

    private String professionName;//行业名称

    private String company;//公司

    private String dutyCode;//职业代码

    private String password;//密码

    private String mobileNum;//手机号码

}