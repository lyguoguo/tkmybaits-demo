package com.example.tkmybaitsdemo;

import com.example.tkmybaitsdemo.entity.VehicleOwner;
import com.example.tkmybaitsdemo.entity.VehiclePassMark;
import com.example.tkmybaitsdemo.service.VehicleOwnerService;
import com.example.tkmybaitsdemo.service.VehiclePassMarkService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author: create by ggaly
 * @version: v1.0
 * @description: com.example.tkmybaitsdemo
 * @date:2019/4/19
 **/
public class TkmybaitsTest extends TkmybaitsDemoApplicationTests{

    @Autowired
    private VehicleOwnerService vehicleOwnerService;
    @Autowired
    private VehiclePassMarkService vehiclePassMarkService;

    @Test
    public void searchInfo(){
        List<VehicleOwner> vehicleOwners = vehicleOwnerService.findByVehicleOwnerName("周恒");
        Assert.assertNotNull(vehicleOwners);
    }

    @Test
    public void searchPassMark(){
        List<VehiclePassMark> passMarks = vehiclePassMarkService.findByBulCatalog("1");
        Assert.assertNotNull(passMarks);
    }
}
