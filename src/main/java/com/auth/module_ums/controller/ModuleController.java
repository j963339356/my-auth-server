package com.auth.module_ums.controller;

import com.alibaba.fastjson.JSONObject;
import com.auth.common.CommonPage;
import com.auth.common.CommonResult;
import com.auth.common.ResultCodeEnum;
import com.auth.mbg.model.UmsModule;
import com.auth.module_ums.service.UmsModuleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 模块管理
 */
@Controller
@Api(tags = "UmsModuleController", description = "后台用户模块管理")
@RequestMapping("/api/module")
public class ModuleController {
    @Autowired
    private UmsModuleService umsModuleService;
    private static final Logger LOGGER = LoggerFactory.getLogger(ModuleController.class);

    /**
     * 分页获取模块信息
     * @return
     */
    @ApiOperation("获取模块列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<UmsModule>> list(@ApiParam("页码") @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                                  @ApiParam("页数") @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
                                                  @ApiParam("查询条件") @RequestParam(value = "queryData") String query){
        UmsModule querData = JSONObject.parseObject(query, UmsModule.class);

        CommonPage list = umsModuleService.list(querData,pageNum,pageSize);
        return CommonResult.success(list);
    }

    /**
     * 通过id获取模块信息
     * @param id 模块id
     */
    @ApiOperation("获取单个模块信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<UmsModule> getModule(@PathVariable("id") Long id){
        return CommonResult.success(umsModuleService.getUmsModule(id));
    }

    /**
     * 添加模块信息
     * @param umsMenu 模块信息
     * @return
     */
    @ApiOperation("添加模块信息")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> insertUmsModule(@RequestBody UmsModule umsMenu){
        CommonResult commonResult;
        int count = umsModuleService.insert(umsMenu);
        if(count==1) {
            commonResult = CommonResult.success(ResultCodeEnum.SUCCESS);
            LOGGER.debug("添加模块成功：{}",umsMenu);
        }
        else{
            commonResult = CommonResult.faild(ResultCodeEnum.FAILED);
            LOGGER.debug("添加模块失败：{}",umsMenu);
        }
        return commonResult;
    }

    @ApiOperation("修改模块信息")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> updateModule(@PathVariable("id") Long id, @RequestBody UmsModule umsMenu){
        CommonResult commonResult;
        int count = umsModuleService.update(id,umsMenu);
        if(count==1) {
            commonResult = CommonResult.success(ResultCodeEnum.SUCCESS);
            LOGGER.info("修改模块成功");
        }
        else{
            commonResult = CommonResult.faild(ResultCodeEnum.FAILED);
            LOGGER.info("修改模块失败");
        }
        return commonResult;
    }


    @ApiOperation("删除单个模块")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> delModule(@PathVariable("id") Long id){
        CommonResult commonResult;
        int count = umsModuleService.delete(id);
        if(count==1) {
            commonResult = CommonResult.success(ResultCodeEnum.SUCCESS);
            LOGGER.info("删除模块成功");
        }
        else{
            commonResult = CommonResult.faild(ResultCodeEnum.FAILED);
            LOGGER.info("删除模块失败");
        }
        return commonResult;
    }
}
