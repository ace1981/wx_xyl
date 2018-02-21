package com.platform.api;

import com.platform.annotation.IgnoreAuth;
import com.platform.annotation.LoginUser;
import com.platform.dto.Result;
import com.platform.dto.SchoolDto;
import com.platform.entity.UserEntity;
import com.platform.service.UserService;
import com.platform.util.ApiBaseAction;
import com.platform.utils.Query;

import io.swagger.annotations.ApiOperation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 作者: @author jn <br>
 * 时间: 2018-02-18 10:32<br>
 * 描述: ApiUserController <br>
 */
@RestController
@RequestMapping("/api/user")
public class ApiUserController extends ApiBaseAction {
    @Autowired
    private UserService userService;

    @IgnoreAuth
    @RequestMapping(value = "info", method = RequestMethod.GET)
    @ApiOperation(value = "根据微信OpenID获取用户信息", httpMethod = "GET", response = Result.class, notes = "获取用户数据")
    public Result getUserInfoByOpenID(String openID){
    	
    	UserEntity user = userService.queryByOpenId(openID);    	
    	return Result.ok(user);
    }
    
    @IgnoreAuth
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ApiOperation(value = "根据学校ID获取用户列表", httpMethod = "GET", response = Result.class, notes = "获取用户数据")
    public Result getUserList(@RequestParam("schoolid") String schoolID){
    	Map<String,Object> params = new HashMap<String,Object>();
    	params.put("classid", schoolID);
    	Query query = new Query(params);
    	//query.put("", value)
    	List<UserEntity> userlist = userService.queryList(query);
    	return Result.ok(userlist);
    }
    
    /**
     * 保存用户头像
     */
    @RequestMapping("saveAvatar")
    public Object saveAvatar(@LoginUser UserEntity loginUser, String avatar) {
        return null;
    }
    
}