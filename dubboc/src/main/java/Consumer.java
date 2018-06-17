import com.alibaba.dubbo.demo.IDubboCallParamService;
import com.alibaba.dubbo.demo.entity.Computer;
import com.alibaba.dubbo.demo.entity.User;
import com.alibaba.dubbo.demo.provider.CallbackListener;
import com.alibaba.dubbo.rpc.RpcContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.alibaba.dubbo.demo.DemoService;

import java.util.concurrent.Future;

public class Consumer {
    public static void main(String[] args) throws Exception {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
//        context.start();
//        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
//        String hello = demoService.sayHello("world"); // 执行远程方法
//        Future barFuture = RpcContext.getContext().getFuture();
//        Object bar = barFuture.get();
//        System.out.println("rez : " + bar ); // 显示调用结果

        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("consumer.xml");
        IDubboCallParamService demoService=(IDubboCallParamService) ctx.getBean("dubboCallParamService");
        Computer res=demoService.methodInvoke("zhangsan", new CallbackListener() {
            public User callBack(User v) {
                Computer computer=new Computer();
                computer.setName("客户端设置的Computer");
                v.setComputer(computer);
                return v;
            }
        });
        System.out.println(res.getName()+" "+res.getId());
    }
}