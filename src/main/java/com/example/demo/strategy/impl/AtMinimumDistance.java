package com.example.demo.strategy.impl;

import com.example.demo.entity.Cab;
import com.example.demo.entity.Location;
import com.example.demo.storage.MapStorage;
import com.example.demo.strategy.CarFindingStrategyService;
import com.example.demo.utill.DistanceUtils;

import java.util.List;
import java.util.TreeMap;

public class AtMinimumDistance implements CarFindingStrategyService {


    @Override
    public Cab getCabInGivenRadius(Location from, Double radius) {
        List<Cab> cabList = (List<Cab>) MapStorage.cabMap.values();
        TreeMap<Double, Cab> sortedCabList = new TreeMap<>();
        for(Cab cab : cabList) {
            Double distance = DistanceUtils.calculateDistanceFrom(from, cab.getLocation());
            if(radius >= distance) {
                sortedCabList.put(distance, cab);
            }
        }
         return sortedCabList.firstEntry().getValue();
    }

}
