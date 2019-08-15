package com.memory.controller;

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
 * @Date: 2018/11/1
 * @Description:
 */
@RestController
public class DemoController extends BaseController {

    private final static Logger logger = LoggerFactory.getLogger(DemoController.class);

//    @Autowired
//    private RabbitMQUtil rabbitMQUtil;

    @RequestMapping("test")
    public Message test() {
        msg = Message.success();
        Map<String, Object> map = new HashMap<>();
        try {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();

            logger.debug("这是DEBUG   {}", sf.format(date));
            logger.info("这是INFO   {}", sf.format(date));
            logger.error("这是ERROR   {}", sf.format(date));

            map.put("obj", null);
            map.put("list", null);
            map.put("fileUrl", this.getFileUrl());
            msg.setResult(map);
            msg.setMsg("查询成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }
}