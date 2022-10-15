package com.example.demo.utill;

import com.example.demo.entity.Location;

public class DistanceUtils {

    public static Double calculateDistanceFrom(Location from, Location to) {
        if(from == null || to == null) {
            return Double.POSITIVE_INFINITY;
        }
        return Math.sqrt(Math.pow(from.getXCoOrdinate() - to.getXCoOrdinate(), 2) + Math.pow(from.getYCoOrdinate() - to.getYCoOrdinate(), 2));
    }
}