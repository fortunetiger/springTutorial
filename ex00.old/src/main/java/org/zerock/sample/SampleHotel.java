package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@ToString
@Getter
//@AllArgsConstructor		//field 모두를 받는 constructor 생성함
//@RequiredArgsConstructor	// @NonNull 인 field를 받는 constructor 생성함
public class SampleHotel {
	private Chef chef;
//	
//	@NonNull
//	private String name;
	
	public SampleHotel(Chef chef) {
		this.chef = chef;
	}
}
