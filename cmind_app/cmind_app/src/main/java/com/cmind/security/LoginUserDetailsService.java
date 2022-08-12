package com.cmind.security;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cmind.entity.Staff;
import com.cmind.entity.StaffExample;
import com.cmind.mybatis.mapper.StaffMapper;

/***
 * ログインイン時に認証ユーザーを「employeeテーブル」から情報を取得するクラス
 */
@Service
public class LoginUserDetailsService implements UserDetailsService {
//    @Autowired
//    EmployeeExample employeeExample;
//
//    @Autowired
//    EmployeeMapper employeeMapper;

//    @Override
//    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
//        //入力された名前をキーにemployeeテーブルのレコードを1件取得
//        Employee employee = employeeMapper.selectByName(name);
//
//        //該当レコードが取得できなかった場合はエラーにする
//        if  (employee   ==  null)   {
//            throw new UsernameNotFoundException("Wrong email or password");
//        }
//
//        //ログインユーザー権限を設定
//        String role = "ROLE_ADMIN";
//
//        return new LoginUserDetails(employee, role);
//    }

	@Autowired
    StaffExample staffExample;

    @Autowired
    StaffMapper staffMapper;



    @Override
    public UserDetails loadUserByUsername(String empId) throws UsernameNotFoundException {
        //入力された名前をキーにemployeeテーブルのレコードを1件取得
        Staff staff = staffMapper.selectByPrimaryKey(empId);

        System.out.println("id:"+ empId);


        //該当レコードが取得できなかった場合はエラーにする
        if  (staff   ==  null)   {
            throw new UsernameNotFoundException("Wrong email or password");
        }else {
        	staff.setEmployeeId(empId);

        	long date  = System.currentTimeMillis();
        	Timestamp timestamp = new Timestamp(date);
        	staff.setUpdateAt(timestamp);
        	staff.setUpdateUser(staff.getName());
        	System.out.println(timestamp);

        	staffMapper.updateByPrimaryKey(staff);
        }

        //ログインユーザー権限を設定
        String role = "ROLE_ADMIN";
        System.out.println("name:" + staff.getName());
        System.out.println("pass:" + staff.getPassword());
        System.out.println("id:" + staff.getEmployeeId());

        return new LoginUserDetails(staff, role);
    }

}