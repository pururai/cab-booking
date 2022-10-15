package com.example.demo.storage;

import com.example.demo.entity.Booking;
import com.example.demo.entity.Cab;
import com.example.demo.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class MapStorage {

    public static Map<String, Cab> cabMap = new HashMap<>();

    public static Map<String, User> userMap = new HashMap<>();

    public static Map<String, List<Booking>> bookingMap = new HashMap<>();
}
