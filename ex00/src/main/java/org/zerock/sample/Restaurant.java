package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
//import lombok.Setter;
import lombok.Setter;

@Component
@Data
public class Restaurant {
	
	@Setter(onMethod=@__({@Autowired}))
	private Chef chef; //class Restaurant dependent on class Chef
	
	
	
}
