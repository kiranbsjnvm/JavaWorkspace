package com.interceptors;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws IOException
	{
		Calendar calendar = Calendar.getInstance();
		int dayOfWeek = calendar.get(calendar.DAY_OF_WEEK);
		
		if(dayOfWeek==1){
			response.getWriter().write("This website is closed on sunday; Please try on some other day");
			return false;
		}
		
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request,HttpServletResponse response,Object handler,ModelAndView modelAndView) throws Exception
	{
		System.out.println("Post handle method : ");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response,Object handler,Exception ex) throws Exception
	{
		System.out.println("after completion method : ");
	}
}
