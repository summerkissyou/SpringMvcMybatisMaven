package com.sun.bus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.core.util.ZIPUtil;

@Controller
public class DownLoadController {



	@RequestMapping("/downLoadController")
	private String downLoadController() {
		ZIPUtil.compress("D:\\tmp\\测试报告","D:\\tmp\\测试报告.zip");
		return "download-success";
	}
}
