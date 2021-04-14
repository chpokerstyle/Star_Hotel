package com.example.demo.DTO;
import lombok.Data;
import java.util.Date;

@Data
public class ReservationDTO {
    Long id;
    Date checkFrom;
    Date checkTo;
    int persons;
}
