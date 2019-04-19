package com.example.tkmybaitsdemo.service;

import com.example.tkmybaitsdemo.entity.VehicleOwner;

import java.util.List;

/**
 * @author: create by ggaly
 * @version: v1.0
 * @description: com.example.tkmybaitsdemo.service
 * @date:2019/4/19
 **/
public interface VehicleOwnerService {

    List<VehicleOwner> findByVehicleOwnerName(String name);
}
