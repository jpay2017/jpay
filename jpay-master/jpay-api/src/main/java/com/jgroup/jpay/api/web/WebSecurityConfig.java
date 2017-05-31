/**
 * 
 */
package com.jgroup.jpay.api.web;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author dockerking
 *
 */

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//super.configure(http);
		http.csrf().disable();
		
		http.authorizeRequests()
		.antMatchers("","")
		.permitAll()
		.anyRequest().authenticated().and()
		.formLogin().loginPage("/login")
		.defaultSuccessUrl("/httpapi").permitAll().and()
		.logout().permitAll();
		
		http.logout().logoutSuccessUrl("/");
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//auth.inMemoryAuthentication().withUser("root").password("root").roles("USER");
		auth.userDetailsService(userDetailsService());
	}
	
	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
		return super.userDetailsService();
		//TODO
	}
	
	//Java代码添加Servlet
	/*@Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.addUrlMappings("/demo-servlet");
        servletRegistrationBean.setServlet(new DemoServlet());
        return servletRegistrationBean;
    }*/

	//Java代码添加Filter
    /*@Bean
    public FilterRegistrationBean filterRegistrationBean(){

        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new LoginFilter());
        Set<String> set = new HashSet<String>();
        set.add("/*");
        filterRegistrationBean.setUrlPatterns(set);
        return filterRegistrationBean;
    }*/

	//Java代码添加Listener
    /*@Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean(){
        ServletListenerRegistrationBean servletListenerRegistrationBean =  new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(new Log4jConfigListener());
        servletListenerRegistrationBean.addInitParameter("log4jConfigLocation","classpath:log4j.properties");
        return servletListenerRegistrationBean;
    }*/
}
