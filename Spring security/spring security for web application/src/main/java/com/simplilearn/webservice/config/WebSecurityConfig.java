package com.simplilearn.webservice.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override		//This method is allowed for allowing the permission to the webpages.
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/","/home").permitAll().anyRequest().authenticated();
		http.formLogin().loginPage("/login").permitAll().and().logout().permitAll();
		
	}
	
	@Bean
	@Override
	protected UserDetailsService userDetailsService() {  //This method is allowed to create your own user name and password
		UserDetails user = User.withDefaultPasswordEncoder().username("user").password("password").roles("USER").build();
		return new InMemoryUserDetailsManager(user);
	}

}
