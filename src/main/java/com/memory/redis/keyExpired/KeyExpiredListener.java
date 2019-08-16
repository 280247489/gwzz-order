package com.memory.redis.keyExpired;

import com.memory.gwzzorder.controller.DemoController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;

import java.nio.charset.StandardCharsets;

/**
 * @Auther: cui.Memory
 * @Date: 2019/8/16 0016 15:17
 * @Description:
 */
public class KeyExpiredListener extends KeyExpirationEventMessageListener {
    private final static Logger logger = LoggerFactory.getLogger(DemoController.class);
    //key超时事件监听
    public KeyExpiredListener(RedisMessageListenerContainer listenerContainer) {
        super(listenerContainer);
    }
    @Override
    public void onMessage(Message message, byte[] pattern) {
        //String channel = new String(message.getChannel(), StandardCharsets.UTF_8);
        //过期的key
        String key = new String(message.getBody(), StandardCharsets.UTF_8);
        //过期处理...
        logger.info("过期订单处理...KEY："+key);
        //order:expired:userId:orderId  （移动端用户查询使用，过期不展示）（KEY：未支付订单ID、VAL：0、EXP：15分钟）
        // （order:expired:userId:orderId过期，考虑查询订单的delYn状态、微信查询订单，微信关闭订单，移除order:state0:userId:orderId数据）

        //order:state0:userId:orderId   （待支付订单信息=KEY：未支付订单ID、VAL：{orderMaster：{}，orderSlave：[{}，{}]}）
        //order:state1:userId:orderId   （待发货订单信息=KEY：未支付订单ID、VAL：{orderMaster：{}，orderSlave：[{}，{}]}）
        //order:state2:userId:orderId   （待收货订单信息）
        /**********************************************/
        //查询过期订单state、delYn状态
        //微信-查询订单
        //微信-关闭订单接口
        //移除redis该笔订单数据
    }
}
