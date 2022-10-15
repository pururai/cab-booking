package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cab {

    private String cabId;

    private String driver;

    private String vehicleNo;

    private Location location;

    private Boolean isAvailable;
}
