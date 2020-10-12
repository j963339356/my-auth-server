package com.auth.module_ums.dto;

import com.auth.mbg.model.UmsMenu;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class UmsMenuNodeDto extends UmsMenu {
    @ApiModelProperty(value="子级菜单")
    private List<UmsMenuNodeDto> children;

    public List<UmsMenuNodeDto> getChildren() {
        return children;
    }

    public void setChildren(List<UmsMenuNodeDto> children) {
        this.children = children;
    }
}
