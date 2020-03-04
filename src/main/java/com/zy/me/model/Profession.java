package com.zy.me.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Profession {

    private String professionCode;

    private String superCode;

    private String professionName;

    private Integer enabled;

    private String remarks;


}