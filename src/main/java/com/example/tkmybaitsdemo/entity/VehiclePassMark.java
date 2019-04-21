package com.example.tkmybaitsdemo.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "vehicle_pass_mark")
public class VehiclePassMark {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 更新人
     */
    private String updater;

    /**
     * 是否删除
     */
    @Column(name = "is_deleted")
    private String isDeleted;

    /**
     * 是否可用,1可用，0不可用
     */
    private Byte enable;

    /**
     * 公告目录
     */
    @Column(name = "bul_catalog")
    private String bulCatalog;

    /**
     * 政府平台
     */
    @Column(name = "gov_platform")
    private String govPlatform;

    /**
     * 企业平台
     */
    @Column(name = "ent_platform")
    private String entPlatform;

    /**
     * 车系代码
     */
    @Column(name = "train_code")
    private String trainCode;

    /**
     * 公告型号
     */
    @Column(name = "anno_type")
    private String annoType;

    /**
     * 任务类型
     */
    @Column(name = "task_type")
    private String taskType;

    /**
     * 任务状态（0未开始；1进行中；2已完成）
     */
    private String status;

    /**
     * 任务开始时间
     */
    @Column(name = "plan_start_date")
    private Date planStartDate;

    /**
     * 任务结束时间
     */
    @Column(name = "plan_end_date")
    private Date planEndDate;

    /**
     * 实际开始时间
     */
    @Column(name = "act_start_time")
    private Date actStartTime;

    /**
     * 实际结束时间
     */
    @Column(name = "act_end_time")
    private Date actEndTime;

    /**
     * 任务说明
     */
    private String remark;

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
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取更新人
     *
     * @return updater - 更新人
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * 设置更新人
     *
     * @param updater 更新人
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    /**
     * 获取是否删除
     *
     * @return is_deleted - 是否删除
     */
    public String getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除
     *
     * @param isDeleted 是否删除
     */
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取是否可用,1可用，0不可用
     *
     * @return enable - 是否可用,1可用，0不可用
     */
    public Byte getEnable() {
        return enable;
    }

    /**
     * 设置是否可用,1可用，0不可用
     *
     * @param enable 是否可用,1可用，0不可用
     */
    public void setEnable(Byte enable) {
        this.enable = enable;
    }

    /**
     * 获取公告目录
     *
     * @return bul_catalog - 公告目录
     */
    public String getBulCatalog() {
        return bulCatalog;
    }

    /**
     * 设置公告目录
     *
     * @param bulCatalog 公告目录
     */
    public void setBulCatalog(String bulCatalog) {
        this.bulCatalog = bulCatalog;
    }

    /**
     * 获取政府平台
     *
     * @return gov_platform - 政府平台
     */
    public String getGovPlatform() {
        return govPlatform;
    }

    /**
     * 设置政府平台
     *
     * @param govPlatform 政府平台
     */
    public void setGovPlatform(String govPlatform) {
        this.govPlatform = govPlatform;
    }

    /**
     * 获取企业平台
     *
     * @return ent_platform - 企业平台
     */
    public String getEntPlatform() {
        return entPlatform;
    }

    /**
     * 设置企业平台
     *
     * @param entPlatform 企业平台
     */
    public void setEntPlatform(String entPlatform) {
        this.entPlatform = entPlatform;
    }

    /**
     * 获取车系代码
     *
     * @return train_code - 车系代码
     */
    public String getTrainCode() {
        return trainCode;
    }

    /**
     * 设置车系代码
     *
     * @param trainCode 车系代码
     */
    public void setTrainCode(String trainCode) {
        this.trainCode = trainCode;
    }

    /**
     * 获取公告型号
     *
     * @return anno_type - 公告型号
     */
    public String getAnnoType() {
        return annoType;
    }

    /**
     * 设置公告型号
     *
     * @param annoType 公告型号
     */
    public void setAnnoType(String annoType) {
        this.annoType = annoType;
    }

    /**
     * 获取任务类型
     *
     * @return task_type - 任务类型
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * 设置任务类型
     *
     * @param taskType 任务类型
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * 获取任务状态（0未开始；1进行中；2已完成）
     *
     * @return status - 任务状态（0未开始；1进行中；2已完成）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置任务状态（0未开始；1进行中；2已完成）
     *
     * @param status 任务状态（0未开始；1进行中；2已完成）
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取任务开始时间
     *
     * @return plan_start_date - 任务开始时间
     */
    public Date getPlanStartDate() {
        return planStartDate;
    }

    /**
     * 设置任务开始时间
     *
     * @param planStartDate 任务开始时间
     */
    public void setPlanStartDate(Date planStartDate) {
        this.planStartDate = planStartDate;
    }

    /**
     * 获取任务结束时间
     *
     * @return plan_end_date - 任务结束时间
     */
    public Date getPlanEndDate() {
        return planEndDate;
    }

    /**
     * 设置任务结束时间
     *
     * @param planEndDate 任务结束时间
     */
    public void setPlanEndDate(Date planEndDate) {
        this.planEndDate = planEndDate;
    }

    /**
     * 获取实际开始时间
     *
     * @return act_start_time - 实际开始时间
     */
    public Date getActStartTime() {
        return actStartTime;
    }

    /**
     * 设置实际开始时间
     *
     * @param actStartTime 实际开始时间
     */
    public void setActStartTime(Date actStartTime) {
        this.actStartTime = actStartTime;
    }

    /**
     * 获取实际结束时间
     *
     * @return act_end_time - 实际结束时间
     */
    public Date getActEndTime() {
        return actEndTime;
    }

    /**
     * 设置实际结束时间
     *
     * @param actEndTime 实际结束时间
     */
    public void setActEndTime(Date actEndTime) {
        this.actEndTime = actEndTime;
    }

    /**
     * 获取任务说明
     *
     * @return remark - 任务说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置任务说明
     *
     * @param remark 任务说明
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}