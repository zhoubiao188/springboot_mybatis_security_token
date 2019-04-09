package com.example.auth.demo.domain.auth;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Role {
    private Long id;
    private String name;
    private String nameZh;
}
