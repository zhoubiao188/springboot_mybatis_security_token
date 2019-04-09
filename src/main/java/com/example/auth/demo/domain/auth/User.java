package com.example.auth.demo.domain.auth;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Size;


@Builder
@Data
public class User {
    @ApiModelProperty(value = "用户名", required = true)
    @Size(min=2, max=20)
    private String name;
    @ApiModelProperty(value = "密码", required = true)
    @Size(min=2, max=20)
    private String password;
}
