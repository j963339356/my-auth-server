package com.auth.module_ums.controller;

import com.alibaba.fastjson.JSONObject;
import com.auth.common.CommonPage;
import com.auth.common.CommonResult;
import com.auth.common.ResultCodeEnum;
import com.auth.mbg.model.UmsRole;
import com.auth.mbg.model.UmsRoleResourceRelation;
import com.auth.module_ums.dto.PrivilegeNodeDto;
import com.auth.module_ums.service.UmsRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 角色管理
 */
@Controller
@Api(tags = "UmsRoleController", description = "后台用户角色管理")
@RequestMapping("/api/role")
public class RoleController {
    @Autowired
    private UmsRoleService umsRoleService;
    private static final Logger LOGGER = LoggerFactory.getLogger(RoleController.class);

    /**
     * 分页获取角色信息
     * @return
     */
    @ApiOperation("获取角色列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<UmsRole>> list(@ApiParam("页码") @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                                      @ApiParam("页数") @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
                                                      @ApiParam("查询条件") @RequestParam(value = "queryData") String query){
        UmsRole querData = JSONObject.parseObject(query, UmsRole.class);

        CommonPage list = umsRoleService.list(querData,pageNum,pageSize);
        return CommonResult.success(list);
    }

    /**
     * 通过id获取角色信息
     * @param id 角色id
     */
    @ApiOperation("获取单个角色信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<UmsRole> userinfo(@PathVariable("id") Long id){
        return CommonResult.success(umsRoleService.getUmsRole(id));
    }

    /**
     * 添加角色信息
     * @param umsMenu 角色信息
     * @return
     */
    @ApiOperation("添加角色信息")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> insertUmsRole(@RequestBody UmsRole umsMenu){
        CommonResult commonResult;
        int count = umsRoleService.insert(umsMenu);
        if(count==1) {
            commonResult = CommonResult.success(ResultCodeEnum.SUCCESS);
            LOGGER.debug("添加角色成功：{}",umsMenu);
        }
        else{
            commonResult = CommonResult.faild(ResultCodeEnum.FAILED);
            LOGGER.debug("添加角色失败：{}",umsMenu);
        }
        return commonResult;
    }

    @ApiOperation("修改角色信息")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> updateRole(@PathVariable("id") Long id, @RequestBody UmsRole umsMenu){
        CommonResult commonResult;
        int count = umsRoleService.update(id,umsMenu);
        if(count==1) {
            commonResult = CommonResult.success(ResultCodeEnum.SUCCESS);
            LOGGER.info("修改角色成功");
        }
        else{
            commonResult = CommonResult.faild(ResultCodeEnum.FAILED);
            LOGGER.info("修改角色失败");
        }
        return commonResult;
    }


    @ApiOperation("删除单个角色")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> delRole(@PathVariable("id") Long id){
        CommonResult commonResult;
        int count = umsRoleService.delete(id);
        if(count==1) {
            commonResult = CommonResult.success(ResultCodeEnum.SUCCESS);
            LOGGER.info("删除角色成功");
        }
        else{
            commonResult = CommonResult.faild(ResultCodeEnum.FAILED);
            LOGGER.info("删除角色失败");
        }
        return commonResult;
    }

    @ApiOperation("权限分配表格")
    @RequestMapping(value = "/getPrivilegeAllocate", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PrivilegeNodeDto>> getPrivilegeAllocate(){
        return CommonResult.success(umsRoleService.getPrivilegeAllocate());
    }

    @ApiOperation("分配权限")
    @RequestMapping(value = "/grantPrivileges/{roleId}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> grantPrivileges(@PathVariable("roleId") Long roleId,
                                                @RequestBody List<PrivilegeNodeDto> privilegeNodeDtoList){
        return CommonResult.success(umsRoleService.grantPrivileges(roleId,privilegeNodeDtoList));
    }

    @ApiOperation("获取已分配权限")
    @RequestMapping(value = "/hasGrantPrivileges/{roleId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<UmsRoleResourceRelation>> hasGrantPrivileges(@PathVariable("roleId") Long roleId){
        return CommonResult.success(umsRoleService.hasGrantPrivileges(roleId));
    }
}
