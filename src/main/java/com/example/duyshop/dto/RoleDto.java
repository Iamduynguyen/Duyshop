package com.example.duyshop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Builder(toBuilder = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class RoleDto {
    private Integer id;
    private String name;
}
