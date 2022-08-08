package com.manish.employee.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	int id;
	@Column
	String ename;
	@Column
	String department;
	@Column
	float salary;
}
