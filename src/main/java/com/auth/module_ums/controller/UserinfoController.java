package com.auth.module_ums.controller;

import com.alibaba.fastjson.JSONObject;
import com.auth.common.CommonPage;
import com.auth.common.CommonResult;
import com.auth.common.ResultCodeEnum;
import com.auth.module_ums.dto.UserInfoDto;
import com.auth.module_ums.service.UserInfoService;
import com.auth.module_ums.service.impl.UserInfoValidServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 用户管理controller
 */
@Api(tags = "UserinfoController", description = "用户管理")
@Controller
@RequestMapping("/api/userinfo")
public class UserinfoController {
    @Autowired
    UserInfoService userInfoService;
    @Autowired
    UserInfoValidServiceImpl userInfoValidService;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserinfoController.class);


    /**
     * 分页获取用户信息
     * @return
     */
    @ApiOperation("获取用户列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<UserInfoDto>> list(@ApiParam("页码") @RequestParam(value = "pageNum") int pageNum,
                                                      @ApiParam("页数") @RequestParam(value = "pageSize") int pageSize,
                                                      @ApiParam("查询条件") @RequestParam(value = "queryData") String query){
        UserInfoDto querData = JSONObject.parseObject(query, UserInfoDto.class);

        CommonPage list = userInfoService.listUserInfo(querData,pageNum,pageSize);
        return CommonResult.success(list);
    }

    /**
     * 通过id获取用户信息
     * @param id 用户id
     */
    @ApiOperation("获取单个用户信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<UserInfoDto> userinfo(@PathVariable("id") long id){
        return CommonResult.success(userInfoService.getUserInfo(id));
    }

    /**
     * 添加用户信息
     * @param userInfoDto 用户信息
     * @return
     */
    @ApiOperation("添加用户信息")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> insertUserInfo(@RequestBody UserInfoDto userInfoDto){
        CommonResult commonResult;
        int count = userInfoService.insertUserInfo(userInfoDto);
        if(count==1) {
            commonResult = CommonResult.success(ResultCodeEnum.SUCCESS);
            LOGGER.debug("添加用户成功：{}",userInfoDto);
        }
        else{
            commonResult = CommonResult.faild(ResultCodeEnum.FAILED);
            LOGGER.debug("添加用户失败：{}",userInfoDto);
        }
        return commonResult;
    }

    @ApiOperation("修改用户信息")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> updateUser(@PathVariable("id") long id, @RequestBody UserInfoDto userInfoDto){
        CommonResult commonResult;
        int count = userInfoService.updateUserInfo(id,userInfoDto);
        if(count==1) {
            commonResult = CommonResult.success(ResultCodeEnum.SUCCESS);
            LOGGER.info("修改用户成功");
        }
        else{
            commonResult = CommonResult.faild(ResultCodeEnum.FAILED);
            LOGGER.info("修改用户失败");
        }
        return commonResult;
    }


    @ApiOperation("删除单个用户")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> delUser(@PathVariable("id") long id){
        CommonResult commonResult;
        int count = userInfoService.deleteUserInfo(id);
        if(count==1) {
            commonResult = CommonResult.success(ResultCodeEnum.SUCCESS);
            LOGGER.info("删除用户成功");
        }
        else{
            commonResult = CommonResult.faild(ResultCodeEnum.FAILED);
            LOGGER.info("删除用户失败");
        }
        return commonResult;
    }

    @ApiOperation("校验用户是否存在")
    @RequestMapping(value = "/validUser/{username}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Object> validUser(@PathVariable("username") String username){
        CommonResult commonResult;

        int count = userInfoValidService.validUserUsername(username);
        commonResult = CommonResult.success(count);

        return commonResult;
    }
}
