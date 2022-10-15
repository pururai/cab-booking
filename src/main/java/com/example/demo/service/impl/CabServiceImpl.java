package com.example.demo.service.impl;

import com.example.demo.dto.CabDto;
import com.example.demo.entity.Cab;
import com.example.demo.service.CabService;
import com.example.demo.storage.MapStorage;
import com.example.demo.utill.CabUtils;


public class CabServiceImpl implements CabService {

    @Override
    public void addCab(CabDto cabDto) {
        if(!MapStorage.cabMap.containsKey(cabDto.getCabId())) {
            Cab cab = new Cab();
            CabUtils.createCabEntity(cabDto, cab);
            MapStorage.cabMap.put(cab.getCabId(), cab);
        }
    }
}
