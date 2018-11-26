package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.demo.IDubboCallParamService;
import com.alibaba.dubbo.demo.entity.Computer;
import com.alibaba.dubbo.demo.entity.User;

public class DubboCallParamServiceImpl implements IDubboCallParamService {
    public Computer methodInvoke(String value, CallbackListener callbackListener) {
        User user=new User();
        user.setName(value);
        System.out.println("-----------");
        User callUser = callbackListener.callBack(user);
        callUser.getComputer().setId(1);
        System.out.println(callUser.getComputer().getName());

        System.out.println(callUser.getComputer());

        return callUser.getComputer();
    }

}
