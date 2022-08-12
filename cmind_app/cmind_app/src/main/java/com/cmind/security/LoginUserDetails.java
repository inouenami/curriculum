package com.cmind.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.cmind.entity.Staff;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
//equals()とhashCode()を生成するが親クラスのメソッドは呼び出さない
@EqualsAndHashCode(callSuper=false)
public class LoginUserDetails extends User {
//    //employeeテーブルから取得したオブジェクトを格納
//    private final Employee employee;
//
//    //認証処理
//    public LoginUserDetails(Employee employee, String role) {
//        //employeeテーブルの名前とパスワードでログイン認証を行う
//        super(employee.getName(), employee.getPassword(), AuthorityUtils.createAuthorityList(role));
//        this.employee = employee;
//
//    }


  //staffテーブルから取得したオブジェクトを格納
    private final Staff staff;

    //認証処理
    public LoginUserDetails(Staff staff, String role) {
        //staffテーブルのIdとパスワードでログイン認証を行う
    	super(staff.getEmployeeId(), staff.getPassword(), AuthorityUtils.createAuthorityList(role));
        this.staff = staff;

    }
}