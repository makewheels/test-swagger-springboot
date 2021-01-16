package com.eg.testswaggerspringboot;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author makewheels
 * @Time 2021.01.16 15:40:24
 */
@Data
@ApiModel("用户响应")
public class UserResponse {
    @ApiModelProperty(value = "用户名",example = "tom")
    private String username;
}
