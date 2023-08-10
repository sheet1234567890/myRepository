package com.adda.app.Test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {
public static void main(String args[]) 
{
 BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
 String pwd = encoder.encode("sheetal");
 System.out.println(pwd);
}
}
