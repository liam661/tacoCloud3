package com.liam.taco3.config.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author liam661
 * @Date 2021/12/27 11:18
 **/
@Slf4j
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        String password = passwordEncoder.encode("123456");
        log.info("登录，用户名：{}, 密码:{}", username, password);
        //根据用户名查询用户数据，比如：从数据库中查询
        return new User(username, password,
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
