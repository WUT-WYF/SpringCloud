package com.cloudfly.springcloud.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author CloudFly
 * @create 2020-05-20 11:40
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements MessageProvider{

	/**
	 * 消息发送管道
	 */
	@Resource
	private MessageChannel output;

	@Override
	public String send() {
		String serial = UUID.randomUUID().toString();
		output.send(MessageBuilder.withPayload(serial).build());
		return serial;
	}
}
