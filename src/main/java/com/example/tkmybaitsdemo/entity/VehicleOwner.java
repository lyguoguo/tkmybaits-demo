package com.example.tkmybaitsdemo.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author
 * @create 2018-07-12 10:24
 **/

@Table(name = "vehicle_owner")
public class VehicleOwner {

    @Id
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String creator;

    private String updater;

    private String isDeleted;

    private String vin;

    private String plateNo;

    private String vehicleOwnerName;

    private String telephoneNumber;

    private String vehicleOwnerEmail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getVehicleOwnerName() {
        return vehicleOwnerName;
    }

    public void setVehicleOwnerName(String vehicleOwnerName) {
        this.vehicleOwnerName = vehicleOwnerName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getVehicleOwnerEmail() {
        return vehicleOwnerEmail;
    }

    public void setVehicleOwnerEmail(String vehicleOwnerEmail) {
        this.vehicleOwnerEmail = vehicleOwnerEmail;
    }
}