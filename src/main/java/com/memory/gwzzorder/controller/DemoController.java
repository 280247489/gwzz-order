package com.memory.gwzzorder.controller;

import com.alibaba.fastjson.JSON;
import com.memory.common.controller.BaseController;
import com.memory.common.controller.Message;
import com.memory.common.utils.Utils;
import com.memory.entity.ZOrderMaster;
import com.memory.entity.ZOrderSlave;
import com.memory.redis.config.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.*;

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

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("test")
    public Message test() {
        msg = Message.success();
        Map<String, Object> map = new HashMap<>();

        Date date = new Date();
        ZOrderMaster zOrderMaster = getzOrderMaster(""+ Utils.getShortUUID(), "memory", date);
        ZOrderSlave zOrderSlave1 = getzOrderSlave(zOrderMaster.getId(), zOrderMaster.getUserId(),"goodsid1", date);
        ZOrderSlave zOrderSlave2 = getzOrderSlave(zOrderMaster.getId(), zOrderMaster.getUserId(),"goodsid2", date);

        Map<String, Object> orderMap = new HashMap<>();

        orderMap.put("orderMaster", zOrderMaster);

        List<ZOrderSlave> orderSlaves = new ArrayList<>();
        orderSlaves.add(zOrderSlave1);
        orderSlaves.add(zOrderSlave2);

        orderMap.put("orderSlaves", orderSlaves);

        //JSON.toJSONString(orderMap)
        //JSON.toJSON(orderMap)
        redisUtil.set("order:memory:state0:orderId", JSON.toJSONString(orderMap), 6);
        map.put("obj-string", JSON.toJSONString(orderMap));
        Object object = JSON.parse(redisUtil.get("order:memory:state0:orderId").toString());
        map.put("obj", object);

        map.put("fileUrl", this.getFileUrl());
        msg.setResult(map);
        msg.setMsg("操作成功");
        return msg;
    }

    @RequestMapping("test1")
    public Message test1() {
        msg = Message.success();
        Map<String, Object> map = new HashMap<>();


        map.put("obj", redisUtil.get("order:memory:state0:orderId"));
        map.put("fileUrl", this.getFileUrl());
        msg.setResult(map);
        msg.setMsg("操作成功");
        return msg;
    }

    private ZOrderSlave getzOrderSlave(String orderMasterId, String userId, String goodsId ,Date date) {
        ZOrderSlave zOrderSlave = new ZOrderSlave();
        zOrderSlave.setId(orderMasterId+"-slave");
        zOrderSlave.setWarehouseId("");
        zOrderSlave.setGoodsId(goodsId);
        zOrderSlave.setGoodsPrice(new BigDecimal(1));
        zOrderSlave.setGoodsCount(5);
        zOrderSlave.setGoodsTotal(new BigDecimal(5));
        zOrderSlave.setGoodsName(goodsId);
        zOrderSlave.setGoodsShowImg("http://pic51.nipic.com/file/20141025/8649940_220505558734_2.jpg");
        zOrderSlave.setOrderSlaveState(0);
        zOrderSlave.setOrderSlaveStateTime(date);
        zOrderSlave.setOrderSlaveRemark("子订单备注");
        zOrderSlave.setUserId(userId);
        zOrderSlave.setOrderMasterId(orderMasterId);
        zOrderSlave.setOrderDetailId("");
        zOrderSlave.setLogisticsId("");
        zOrderSlave.setCreateTime(date);
        zOrderSlave.setYear("2019");
        zOrderSlave.setMonth("8");
        zOrderSlave.setDay("16");
        return zOrderSlave;
    }

    private ZOrderMaster getzOrderMaster(String id, String userId, Date date) {
        ZOrderMaster zOrderMaster = new ZOrderMaster();
        zOrderMaster.setId(id);
        zOrderMaster.setOrderState(0);
        zOrderMaster.setOrderNormalState(0);
        zOrderMaster.setOrderReturnState(0);
        zOrderMaster.setOrderShowUrl("http://pic51.nipic.com/file/20141025/8649940_220505558734_2.jpg");
        zOrderMaster.setOrderShowDescribe("商品描述 （只有订单有一个商品的时候才存,商品名称+规格）");
        zOrderMaster.setOrderShowCount(10);
        zOrderMaster.setOrderShowTotal(new BigDecimal(10));
        zOrderMaster.setOrderRemark("订单备注");
        zOrderMaster.setShrName("收货人姓名");
        zOrderMaster.setShrTel("收货人电话");
        zOrderMaster.setShrProvince("省份");
        zOrderMaster.setShrCity("城市 ");
        zOrderMaster.setShrArea("区域");
        zOrderMaster.setShrAddr("收货人详细地址要精确到门牌号");
        zOrderMaster.setInvoiceState(0);
        zOrderMaster.setInvoiceId("");
        zOrderMaster.setDelYn(0);
        zOrderMaster.setPayId("");
        zOrderMaster.setUserId(userId);
        zOrderMaster.setCreateTime(date);
        zOrderMaster.setYear("2019");
        zOrderMaster.setMonth("8");
        zOrderMaster.setDay("16");
        return zOrderMaster;
    }
}