package com.alibaba.dubbo.demo;

import com.alibaba.dubbo.demo.entity.Computer;
import com.alibaba.dubbo.demo.provider.CallbackListener;

public interface IDubboCallParamService {
    public Computer methodInvoke(String value, CallbackListener callbackListener);
}