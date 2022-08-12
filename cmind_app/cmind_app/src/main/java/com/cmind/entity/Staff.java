package com.cmind.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "staff")
public class Staff {
@Id
@Column(name = "employee_id")
private String employeeId;
private  String name;

private String password;

@Column(name = "create_at")
private Timestamp createAt;

@Column(name = "create_user")
private String createUser;

@Column(name = "update_at")
private Timestamp updateAt;

@Column(name = "update_user")
private String updateUser;

public Staff() {
	// TODO 自動生成されたコンストラクター・スタブ
}

public Staff(String employeeId, String password) {
	super();
	this.employeeId = employeeId;
	this.password = password;
}

public String getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(String employeeId) {
	this.employeeId = employeeId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Timestamp getCreateAt() {
	return createAt;
}

public void setCreateAt(Timestamp createAt) {
	this.createAt = createAt;
}

public String getCreateUser() {
	return createUser;
}

public void setCreateUser(String createUser) {
	this.createUser = createUser;
}

public Timestamp getUpdateAt() {
	return updateAt;
}

public void setUpdateAt(Timestamp updateAt) {
	this.updateAt = updateAt;
}

public String getUpdateUser() {
	return updateUser;
}

public void setUpdateUser(String updateUser) {
	this.updateUser = updateUser;
}


}
