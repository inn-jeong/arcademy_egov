package main.service;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardVO {
	private int unq;
	private String title;
	private String pass;
	private String name;
	private String content;
	private int hits;
	private Timestamp rdate;
	private String rdate1;
}
