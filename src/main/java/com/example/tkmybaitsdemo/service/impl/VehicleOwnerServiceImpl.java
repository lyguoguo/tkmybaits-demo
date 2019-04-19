package com.example.tkmybaitsdemo.service.impl;

import com.example.tkmybaitsdemo.entity.VehicleOwner;
import com.example.tkmybaitsdemo.mapper.VehicleOwnerMapper;
import com.example.tkmybaitsdemo.service.VehicleOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.xml.ws.Action;
import java.util.List;

/**
 * @author: create by ggaly
 * @version: v1.0
 * @description: com.example.tkmybaitsdemo.service.impl
 * @date:2019/4/19
 **/
@Service
public class VehicleOwnerServiceImpl implements VehicleOwnerService {

    @Autowired
    private VehicleOwnerMapper vehicleOwnerMapper;

    @Override
    public List<VehicleOwner> findByVehicleOwnerName(String name) {
        Example example = new Example(VehicleOwner.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("vehicleOwnerName",name);
        return vehicleOwnerMapper.selectByExample(example);
    }
}
