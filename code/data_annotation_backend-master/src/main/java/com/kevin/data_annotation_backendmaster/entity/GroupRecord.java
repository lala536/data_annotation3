package com.kevin.data_annotation_backendmaster.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("group_record")
public class GroupRecord {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("class_id")
    private Integer classId;

    @TableField("group_id")
    private Integer groupId;

    @TableField("uid")
    private Integer uid;

    @TableField("start")
    private String start;

    @TableField("end")
    private String end;

    @TableField("label")
    private String label;

    @TableField("label_type")
    private String labelType;
}