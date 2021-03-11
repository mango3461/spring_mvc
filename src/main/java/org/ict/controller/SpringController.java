package org.ict.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
// 기본 url(localhost:8181/ 뒤에 spring/모든 패턴 이 추가 됨.
@RequestMapping("/spring/*")
public class SpringController {
	@RequestMapping("")
	public void base() {
		System.out.println("기본 url로 접속했습니다.");
	}
}
