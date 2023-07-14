package egovframework.example.sample.service;

import java.sql.Date;

import lombok.Data;

@Data
public class EmpVO {
	private Integer empno;
	private String ename;
	private String job;
	private Integer mgr;
	private Date hiredate;
	private Integer sal;
	private Integer comm;
	private Integer deptno;
}
