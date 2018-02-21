package com.platform.api;

import com.platform.annotation.IgnoreAuth;
import com.platform.dto.Result;
import com.platform.dto.SchoolDto;
import com.platform.service.UserService;
import com.platform.util.ApiBaseAction;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api/school")
public class ApiSchoolController extends ApiBaseAction {
    @Autowired
    private UserService userService;
    
    @IgnoreAuth
    @RequestMapping(value = "getschoollist", method = RequestMethod.GET)
    @ApiOperation(value = "根据用户ID获取用户所对应的学校清单", httpMethod = "GET", response = Result.class, notes = "获取学校列表数据")
    public Result getSchoolList(){
    	Result result = new Result();
    	SchoolDto sd = new SchoolDto();
    	sd.setId("111");
    	result.setData(sd);
    	return result;
    }

   
}