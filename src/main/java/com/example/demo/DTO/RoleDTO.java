package com.example.demo.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RoleDTO {
   @JsonProperty("id")
    Long id;
   @JsonProperty("name")
    String name;
}
