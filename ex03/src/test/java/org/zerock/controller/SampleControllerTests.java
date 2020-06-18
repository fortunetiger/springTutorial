package org.zerock.controller;

import org.springframework.test.context.ContextConfiguration;

import lombok.extern.log4j.Log4j;

@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@Log4j
public class SampleControllerTests {

	/*
	@Test
	public void testConvert() throws Exception {
		
		Ticket ticket = new Ticket();
		
		ticket.setTno(123);
		ticket.setOwner("Admin");
		ticket.setGrade("AAA");
		
		String jsonStr = new Gson().toJson(ticket); // Java 객체를 JSON 문자열로 변환
		
		log.info(jsonStr);
		
		mockMvc.perform(post("/sample/ticket") // REST api를 POST 방식으로 호출
				.contentType(MediaType.APPLICATION_JSON) // 전달되는 데이터 타입 설정
				.content(jsonStr))
				.andExpect(status().is(200));
	}
	*/
}
