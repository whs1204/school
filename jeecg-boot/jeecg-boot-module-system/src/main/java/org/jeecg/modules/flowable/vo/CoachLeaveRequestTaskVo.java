package org.jeecg.modules.flowable.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.jeecgframework.poi.excel.annotation.Excel;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * @Description: 请假申请单
 * @Author: andypmp4u
 * @Date:   2020-04-24
 * @Version: V1.0
 */
@Data
public class CoachLeaveRequestTaskVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**申请Id：作为请假的主键*/
    private String requestId;

    /** 申请类型 */
    private String requestType;


    private String coachUserId;

    /** 教练员 */
    private String coachName;

    /** 申请日期 */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date requestDate;

    /** 开始日期 */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date startDate;

    /** 结束日期 */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endDate;

    /** 申请天数 */
    private String requestDays;

    /** 申请事由 */
    private String reason;

    /** 流程Id */
    private String processId;

    /** 任务Id */
    private String taskId;

    /** 审批状态（待审批、结束） */
    private String workflowStatus;

    /** 审批状态（待审批、结束） */
    private String taskStatus;

    /** 审批节点 */
    private String workflowNode;

    /** 审批人Id */
    private String approverId;

    /** 审批人 */
    private String approver;

    /** 审批时间 */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd ")
    private String approvalDate;

    /** 审批结果 */
    private String approvalResult;

    /** 审批意见 */
    private String approvalComment;


    private List<CoachLeaveRequestHistoryVo> approvalList;

}
