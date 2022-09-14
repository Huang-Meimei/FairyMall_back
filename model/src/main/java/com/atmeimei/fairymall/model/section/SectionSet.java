package com.atmeimei.fairymall.model.section;

import com.atmeimei.fairymall.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(description = "模块设置")
@TableName("section_set")
public class SectionSet extends BaseEntity {
}
