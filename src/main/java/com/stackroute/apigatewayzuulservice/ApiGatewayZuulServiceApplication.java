package com.stackroute.apigatewayzuulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.stackroute.apigatewayzuulservice.domain.ErrorFilter;
import com.stackroute.apigatewayzuulservice.domain.PostFilter;
import com.stackroute.apigatewayzuulservice.domain.PreFilter;
import com.stackroute.apigatewayzuulservice.domain.RouteFilter;


@EnableZuulProxy
@SpringBootApplication
public class ApiGatewayZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayZuulServiceApplication.class, args);
	}
	
	
	 @Bean
	    public PreFilter preFilter() {
	        return new PreFilter();
	    }
	    @Bean
	    public PostFilter postFilter() {
	        return new PostFilter();
	    }
	    @Bean
	    public ErrorFilter errorFilter() {
	        return new ErrorFilter();
	    }
	    @Bean
	    public RouteFilter routeFilter() {
	        return new RouteFilter();
	    }
}
