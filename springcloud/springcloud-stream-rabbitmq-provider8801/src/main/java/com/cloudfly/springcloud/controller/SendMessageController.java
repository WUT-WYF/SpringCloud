package com.cloudfly.springcloud.controller;

import com.cloudfly.springcloud.service.MessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author CloudFly
 * @create 2020-05-20 13:54
 */
@RestController
public class SendMessageController {
	@Resource
	private MessageProvider messageProvider;

	@GetMapping("/send")
	public String sendMessage() {
		return messageProvider.send();
	}
}
