package com.example.tkmybaitsdemo.service;

import com.example.tkmybaitsdemo.entity.VehiclePassMark;

import java.util.List;

/**
 * @author: create by ggaly
 * @version: v1.0
 * @description: com.example.tkmybaitsdemo.service
 * @date:2019/4/21
 **/
public interface VehiclePassMarkService {
    List<VehiclePassMark> findByBulCatalog(String bulCatalog);
}
