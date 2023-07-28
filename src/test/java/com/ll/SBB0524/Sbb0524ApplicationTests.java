package com.ll.SBB0524;

import com.ll.SBB0524.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.time.LocalDateTime;

@SpringBootTest
class Sbb0524ApplicationTests {

	@Autowired
	private QuestionService questionService;

	@Test
	void contextLoads() {

	}
}
