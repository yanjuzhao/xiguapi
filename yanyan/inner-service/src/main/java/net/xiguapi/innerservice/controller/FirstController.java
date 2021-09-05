package net.xiguapi.innerservice.controller;

import net.xiguapi.innerservice.model.UserInfo;
import net.xiguapi.innerservice.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【说明】： TODO
 *
 * @Author Administrator
 * @Date 2021/8/15 17:33
*/
@RestController
@RequestMapping("/first")
public class FirstController {

    @Autowired
    private FirstService firstService;

    @RequestMapping(value = "/name",method = RequestMethod.GET)
    public UserInfo getMyName(String name)
    {
        System.out.println("开始……，查询条件为：" + name);
        UserInfo info = firstService.getUserInfo(name);
        System.out.println("结束……信息为：" + info);
        return info;
    }
}
