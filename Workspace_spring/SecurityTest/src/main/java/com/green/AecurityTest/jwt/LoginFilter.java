package com.green.AecurityTest.jwt;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.io.IOException;

/*
시큐리티를 사용한 로그인은 먼저 UsernamePasswordAuthenticationFilter 클래스로 부터 시작 한다
UsernamePasswordAuthenticationFilter는 로그인을 시도하면
로그인시 입력한 아이디와 비밀번호가 가져오는 역할

UsernamePasswordAuthenticationFilter는 로그인 요청에 대해서는 동작함
아무것도 설정하지 않으면 "/login"요청을 로그인 하는 요청으로 인지함
로그인 요청의 변경은 생성자에서 진행

우리가 상속받은 filter는 Form방식의 로그인햐서는 자동으로 실행되지만
jwt 를 사용한 로그인에서는 UsernamePasswordAuthenticationFilter  가 실행되지 않는다
따라서 SecuricyConfig 클래스에 우리가 만든 LoginFilter 클래스가 실행될수 있도록 설정해야함.
*/
@Slf4j
//@RequiredArgsConstructor  // 생성자 생성해줌
public class LoginFilter extends UsernamePasswordAuthenticationFilter {
//    실제 로그인 검증을 실행하는 객체
    private final AuthenticationManager authenticationManager;

    public LoginFilter (AuthenticationManager authenticationManager){
        this.authenticationManager=authenticationManager;
//        로그인 요청url을 변경
        setFilterProcessesUrl("/member/login");
//        아이디, 비번 전다되는 name변경
        setUsernameParameter("memId");
        setPasswordParameter("memPw");
    }

    //    로그인 요청시 최초로 실행되는 메서드
/*
해당 메서드에서는 로그인 요청 시 전달되는 아이디, 비번을 받아
AuthenticationManager에 전달

AuthenticationManager가 실제로 로그인 로직을 실행하는 객체

프론트에서 입력받은 아이디와 비밀번호는 특별한 설정을 하지 않으면
username, password라는 이름으로 값을 전달받게 설정되어 있음
전달되는 아이디와 비번의 이름 변경은 생성자
*/
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        log.info("LoginFilter 클래스의 attemptAuthentication() 실행");

//        우리가 입력한 아이디, 비번 가져오기 (임시)
        String userName=obtainUsername(request);
        String password=obtainPassword(request);

        log.info("우리가 입력받은 아이디 : "+ userName);
        log.info("우리가 입력받은 비번 : {} ", password);
        log.info("아이디는 {} 이고, 비번은{}입니다", userName, password);

//        아래 클래스는 아이디와 비밀번호를 AuthenticationManager 클래스에
//        아이디와 비번을 전달하는 보안이 좋은 통
//        이 통에 아이디와 비번을 담아서 AuthenticationManager에 전달
        UsernamePasswordAuthenticationToken authToken= new UsernamePasswordAuthenticationToken(userName, password, null);

        return authenticationManager.authenticate(authToken);
    }

    // 로그인 성공시 실행되는 메서드
    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        log.info("로그인 성공");
    }

    // 로그인 실패시 실행되는 메서드
    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
        log.info("로그인 실패");
    }
}
