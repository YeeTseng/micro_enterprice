package com.zy.me.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Profession {

    private String professionCode;

    private String superCode;

    private String professionName;

    private Integer enabled;

    private String remarks;

}