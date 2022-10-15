package com.example.demo.strategy;

import com.example.demo.entity.Cab;
import com.example.demo.entity.Location;

public interface CarFindingStrategyService {

    Cab getCabInGivenRadius(Location from, Double radius);
}
