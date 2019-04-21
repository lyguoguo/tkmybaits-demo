package com.example.tkmybaitsdemo.entity;

import javax.persistence.*;

@Table(name = "vehicle_pass_mark_rel")
public class VehiclePassMarkRel {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 过标记录ID
     */
    @Column(name = "pass_mark_id")
    private Integer passMarkId;

    /**
     * 车架号
     */
    private String vin;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取过标记录ID
     *
     * @return pass_mark_id - 过标记录ID
     */
    public Integer getPassMarkId() {
        return passMarkId;
    }

    /**
     * 设置过标记录ID
     *
     * @param passMarkId 过标记录ID
     */
    public void setPassMarkId(Integer passMarkId) {
        this.passMarkId = passMarkId;
    }

    /**
     * 获取车架号
     *
     * @return vin - 车架号
     */
    public String getVin() {
        return vin;
    }

    /**
     * 设置车架号
     *
     * @param vin 车架号
     */
    public void setVin(String vin) {
        this.vin = vin;
    }
}