package com.auth.module_ums.controller;

import com.alibaba.fastjson.JSONObject;
import com.auth.common.CommonPage;
import com.auth.common.CommonResult;
import com.auth.common.ResultCodeEnum;
import com.auth.mbg.model.UmsMenu;
import com.auth.mbg.model.UmsResource;
import com.auth.module_ums.dto.UmsMenuNodeDto;
import com.auth.module_ums.service.UmsMenuService;
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
 * 菜单管理
 * @author xiaofa
 */
@Controller
@Api(tags = "MenuController", description = "菜单管理")
@RequestMapping("/api/menu")
public class MenuController {
    @Autowired
    UmsMenuService umsMenuService;

    private static final Logger LOGGER = LoggerFactory.getLogger(MenuController.class);

    /**
     * 获取所有菜单
     */
    @ApiOperation("获取所有菜单列表")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<UmsMenu>> listAll(){
        return CommonResult.success(umsMenuService.listAllUmsMenu());
    }
    /**
     * 分页获取菜单信息
     * @return
     */
    @ApiOperation("获取菜单列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<UmsMenu>> list(@ApiParam("页码") @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                                  @ApiParam("页数") @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
                                                  @ApiParam("查询条件") @RequestParam(value = "queryData") String query){
        UmsMenu querData = JSONObject.parseObject(query, UmsMenu.class);

        CommonPage list = umsMenuService.listUmsMenu(querData,pageNum,pageSize);
        return CommonResult.success(list);
    }

    /**
     * 通过id获取菜单信息
     * @param id 菜单id
     */
    @ApiOperation("获取单个菜单信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<UmsMenu> userinfo(@PathVariable("id") String id){
        return CommonResult.success(umsMenuService.getUmsMenu(id));
    }

    /**
     * 添加菜单信息
     * @param umsMenu 菜单信息
     * @return
     */
    @ApiOperation("添加菜单信息")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> insertUmsMenu(@RequestBody UmsMenu umsMenu){
        CommonResult commonResult;
        int count = umsMenuService.insertUmsMenu(umsMenu);
        if(count==1) {
            commonResult = CommonResult.success(ResultCodeEnum.SUCCESS);
            LOGGER.debug("添加菜单成功：{}",umsMenu);
        }
        else{
            commonResult = CommonResult.faild(ResultCodeEnum.FAILED);
            LOGGER.debug("添加菜单失败：{}",umsMenu);
        }
        return commonResult;
    }

    @ApiOperation("修改菜单信息")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> updateUser(@PathVariable("id") String id, @RequestBody UmsMenu umsMenu){
        CommonResult commonResult;
        int count = umsMenuService.updateUmsMenu(id,umsMenu);
        if(count==1) {
            commonResult = CommonResult.success(ResultCodeEnum.SUCCESS);
            LOGGER.info("修改菜单成功");
        }
        else{
            commonResult = CommonResult.faild(ResultCodeEnum.FAILED);
            LOGGER.info("修改菜单失败");
        }
        return commonResult;
    }


    @ApiOperation("删除单个菜单")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> delUser(@PathVariable("id") String id){
        CommonResult commonResult;
        int count = umsMenuService.deleteUmsMenu(id);
        if(count==1) {
            commonResult = CommonResult.success(ResultCodeEnum.SUCCESS);
            LOGGER.info("删除菜单成功");
        }
        else{
            commonResult = CommonResult.faild(ResultCodeEnum.FAILED);
            LOGGER.info("删除菜单失败");
        }
        return commonResult;
    }

    @ApiOperation("树形结构返回所有菜单列表")
    @RequestMapping(value = "/treeList/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<UmsMenuNodeDto>> treeList(@PathVariable("id") String id) {
        List<UmsMenuNodeDto> list = umsMenuService.treeList(id);
        return CommonResult.success(list);
    }

    @ApiOperation("修改菜单显示状态")
    @RequestMapping(value = "/updateHidden/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateHidden(@PathVariable String id, @RequestParam("hidden") Integer hidden) {
        int count = umsMenuService.updateHidden(id, hidden);
        if (count > 0) {
            return CommonResult.success(ResultCodeEnum.SUCCESS);
        } else {
            return CommonResult.faild(ResultCodeEnum.FAILED);
        }
    }
}
