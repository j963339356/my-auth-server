package com.auth.module_ums.controller;

import com.alibaba.fastjson.JSONObject;
import com.auth.common.CommonPage;
import com.auth.common.CommonResult;
import com.auth.common.ResultCodeEnum;
import com.auth.mbg.model.UmsResource;
import com.auth.module_ums.service.UmsResourceService;
import com.auth.module_ums.service.UmsResourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 资源管理
 * @author xiaofa
 */
@Controller
@Api(tags = "ResourceController", description = "资源管理")
@RequestMapping("/api/resource")
public class ResourceController {
    @Autowired
    UmsResourceService umsResourceService;

    private static final Logger LOGGER = LoggerFactory.getLogger(ResourceController.class);

    /**
     * 分页获取资源信息
     * @return
     */
    @ApiOperation("获取资源列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<UmsResource>> list(@ApiParam("页码") @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                                  @ApiParam("页数") @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
                                                  @ApiParam("查询条件") @RequestParam(value = "queryData") String query){
        UmsResource querData = JSONObject.parseObject(query, UmsResource.class);

        CommonPage list = umsResourceService.list(querData,pageNum,pageSize);
        return CommonResult.success(list);
    }

    /**
     * 通过id获取资源信息
     * @param id 资源id
     */
    @ApiOperation("获取单个资源信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<UmsResource> getResource(@PathVariable("id") String id){
        return CommonResult.success(umsResourceService.getUmsResource(id));
    }

    /**
     * 添加资源信息
     * @param umsMenu 资源信息
     * @return
     */
    @ApiOperation("添加资源信息")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> insertUmsResource(@RequestBody UmsResource umsMenu){
        CommonResult commonResult;
        int count = umsResourceService.insert(umsMenu);
        if(count==1) {
            commonResult = CommonResult.success(ResultCodeEnum.SUCCESS);
            LOGGER.debug("添加资源成功：{}",umsMenu);
        }
        else{
            commonResult = CommonResult.faild(ResultCodeEnum.FAILED);
            LOGGER.debug("添加资源失败：{}",umsMenu);
        }
        return commonResult;
    }

    @ApiOperation("修改资源信息")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> updateUser(@PathVariable("id") String id, @RequestBody UmsResource umsMenu){
        CommonResult commonResult;
        int count = umsResourceService.update(id,umsMenu);
        if(count==1) {
            commonResult = CommonResult.success(ResultCodeEnum.SUCCESS);
            LOGGER.info("修改资源成功");
        }
        else{
            commonResult = CommonResult.faild(ResultCodeEnum.FAILED);
            LOGGER.info("修改资源失败");
        }
        return commonResult;
    }


    @ApiOperation("删除单个资源")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> delUser(@PathVariable("id") String id){
        CommonResult commonResult;
        int count = umsResourceService.delete(id);
        if(count==1) {
            commonResult = CommonResult.success(ResultCodeEnum.SUCCESS);
            LOGGER.info("删除资源成功");
        }
        else{
            commonResult = CommonResult.faild(ResultCodeEnum.FAILED);
            LOGGER.info("删除资源失败");
        }
        return commonResult;
    }
}
