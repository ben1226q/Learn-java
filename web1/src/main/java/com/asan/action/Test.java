package com.asan.action;

import com.asan.dao.IRoleDao;
import ejbModule.persistence.DisActivity.DisWhiteListDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/home")
public class Test {

    @Resource(name = "disWhiteListDao")
    private DisWhiteListDao disWhiteListDao;

    @Autowired
    private IRoleDao roleDao;

    //映射一个action
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/test")
    @ResponseBody
    public Object test(){
        List<String> s =  disWhiteListDao.getUserPhones();
        System.out.println(s);
        return s;
//        return roleDao.listRoles(null,0,2);
    }



}