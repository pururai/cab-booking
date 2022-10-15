package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String userId;

    private String name;

    private String sirName;

    private String state;

    private Integer pinCode;
}


class Demo {
    public static void main(String[] args) {
        String s = " Ashu";
        String temp = s;
        temp = temp.toLowerCase();
        System.out.println(temp.hashCode());
        System.out.println(s.hashCode());

        List<Integer> list = new ArrayList<>();
        List<Integer> newList = list;
        newList.add(8);
        newList.add(9);
        System.out.println(newList);
        System.out.println(list);
    }
}