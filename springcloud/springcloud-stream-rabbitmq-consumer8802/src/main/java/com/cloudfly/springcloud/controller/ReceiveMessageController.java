package com.cloudfly.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CloudFly
 * @create 2020-05-20 14:36
 */
@RestController
@EnableBinding(Sink.class)
public class ReceiveMessageController {
	@Value("${server.port}")
	private String serverPort;

	@StreamListener(Sink.INPUT)
	public void receiveMessage(Message<String> message) {
		System.out.println("端口号：" + serverPort + "，消费者1号：" + message.getPayload());
	}
}
