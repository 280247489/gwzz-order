package com.memory.gwzzorder.controller;

import com.memory.common.controller.BaseController;
import com.memory.common.controller.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: cui.Memory
 * @Date: 2019/8/15 0015 21:57
 * @Description:
 */
@RestController
public class OrderState1 extends BaseController {
    private final static Logger logger = LoggerFactory.getLogger(OrderState1.class);

    @RequestMapping("pay_callback")
    public Message pay_callback() {
        msg = Message.success();
        Map<String, Object> map = new HashMap<>();
        try {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();

            logger.info("这是INFO   OrderState1");

            map.put("fileUrl", this.getFileUrl());
            msg.setResult(map);
            msg.setMsg("查询成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }
}
