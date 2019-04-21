package com.example.tkmybaitsdemo.service.impl;

import com.example.tkmybaitsdemo.mapper.VehiclePassMarkMapper;
import com.example.tkmybaitsdemo.entity.VehiclePassMark;
import com.example.tkmybaitsdemo.service.VehiclePassMarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author: create by ggaly
 * @version: v1.0
 * @description: com.example.tkmybaitsdemo.service.impl
 * @date:2019/4/21
 **/
@Service
public class VehiclePassMarkServiceImpl implements VehiclePassMarkService {
    @Autowired
    private VehiclePassMarkMapper vehiclePassMarkMapper;

    @Override
    public List<VehiclePassMark> findByBulCatalog(String bulCatalog) {
        Example example = new Example(VehiclePassMark.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("bulCatalog",bulCatalog);
        return vehiclePassMarkMapper.selectByExample(example);
    }
}
