package com.itheima.api.pojo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;
import java.time.LocalDateTime;

@Data
public class Article {
    @NotNull(groups = Update.class)
    private Integer id;//主键ID
    @NotEmpty
    private String title;//文章标题
    @NotEmpty
    private String content;//文章内容
    @NotEmpty
    private String coverImg;//封面图像
    @NotEmpty
    private String state;//发布状态 已发布|草稿
    @NotNull
    private Integer categoryId;//文章分类id
    private Integer createUser;//创建人ID
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//更新时间

    public interface Add extends Default {
    }

    public interface Update extends Default {
    }
}
