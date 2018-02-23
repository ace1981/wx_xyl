package com.platform.rest;
import com.platform.annotation.IgnoreAuth;
import com.platform.annotation.LoginUser;
import com.platform.dto.Result;
import com.platform.dto.ClassDto;
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
 * 作者: @author Ace <br>
 * 时间: 2018-02-18 10:32<br>
 * 描述: UserExtController <br>
 */
@RestController
@RequestMapping("/api/userext")
public class UserExtController {

}
