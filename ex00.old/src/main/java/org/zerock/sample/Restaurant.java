package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;

@Component
@Data
public class Restaurant {
	
//	@Setter(onMethod=@__({@Autowired}))
	@Getter(onMethod_ = { @Autowired })
	private Chef chef; //class Restaurant dependent on class Chef
	
	
	
}
