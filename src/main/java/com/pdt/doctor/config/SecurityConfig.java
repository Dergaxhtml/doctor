package com.pdt.doctor.config;

import com.pdt.doctor.validator.UserPasswordValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.Validator;

@Configuration
//@EnableWebSecurity
public class SecurityConfig
//  extends WebSecurityConfigurerAdapter
{

//  @Autowired
//  private UserDetailsService userDetailsService;

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  public Validator userPasswordValidator() {
    return new UserPasswordValidator();
  }

//  @Override
//  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//    auth.userDetailsService(userDetailsService);
//
//    DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//    authProvider.setUserDetailsService(userDetailsService);
//    authProvider.setPasswordEncoder(passwordEncoder());
//
//    auth.authenticationProvider(authProvider);
//  }
//
//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//    http
//      .authorizeRequests()
//      .antMatchers("/**").permitAll()
////      .antMatchers("/todos").authenticated()
//      .and().formLogin()
////    .loginPage("/login")
//      .defaultSuccessUrl("/")
//      .and().logout()
//      .permitAll()
//      .and().headers().frameOptions().disable();
////      .and().csrf().disable();
//  }
}
