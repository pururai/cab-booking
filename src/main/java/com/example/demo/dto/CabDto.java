package com.example.demo.dto;

import com.example.demo.entity.Location;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CabDto {

    private String cabId;

    private String driver;

    private String vehicleNo;

    private Location location;

    private Boolean isAvailable;
}
