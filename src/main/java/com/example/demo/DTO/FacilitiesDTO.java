package com.example.demo.DTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class FacilitiesDTO {
    @JsonProperty
    Long id;
    @JsonProperty
    String name;

}
