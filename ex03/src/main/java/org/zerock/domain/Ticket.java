package org.zerock.domain;

import lombok.Data;

@Data
public class Ticket {
	
	private int		tno;	// ticket number
	private String	owner;
	private String	grade;
	
}