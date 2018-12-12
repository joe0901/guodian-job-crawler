package com.guodian.service;

import java.util.List;

import com.guodian.pojo.JobInfo;

public interface JobInfoService {

    /**
     * 保存数据
     *
     * @param jobInfo
     */
    public void save(JobInfo jobInfo);

    /**
     * 根据条件查询数据
     *
     * @param jobInfo
     * @return
     */
    public List<JobInfo> findJobInfo(JobInfo jobInfo);
}
