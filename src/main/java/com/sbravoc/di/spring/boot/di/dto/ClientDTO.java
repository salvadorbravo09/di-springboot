package com.sbravoc.di.spring.boot.di.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {

    private Integer id;
    private String name;
    private String email;
}
