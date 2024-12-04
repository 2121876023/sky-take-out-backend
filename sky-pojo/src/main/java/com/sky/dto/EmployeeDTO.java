package com.sky.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "新增员工时传递的数据模型")
public class EmployeeDTO implements Serializable {

    @ApiModelProperty("用户id")
    private Long id;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("用户名字")
    private String name;

    @ApiModelProperty("用户手机号码")
    private String phone;

    @ApiModelProperty("用户性别：1男，2女")
    private String sex;

    @ApiModelProperty("用户身份证号")
    private String idNumber;

}
