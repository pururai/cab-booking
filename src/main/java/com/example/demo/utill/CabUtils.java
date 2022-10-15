package com.example.demo.utill;

import com.example.demo.dto.CabDto;
import com.example.demo.entity.Cab;

public class CabUtils {

    public static void createCabEntity(CabDto cabDto, Cab cab) {
        if(cabDto != null) {
            cab.setDriver(cabDto.getDriver());
            cab.setCabId(cabDto.getCabId());
            cab.setLocation(cabDto.getLocation());
            cabDto.setVehicleNo(cabDto.getVehicleNo());
        }
    }
}
