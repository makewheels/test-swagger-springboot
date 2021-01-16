package com.eg.testswaggerspringboot;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author makewheels
 * @Time 2021.01.16 15:33:43
 */
@Data
@ApiModel(value = "请求用户bean")
public class UserRequest {
    @ApiModelProperty(value = "用户id", example = "12344")
    private String userId;
}
