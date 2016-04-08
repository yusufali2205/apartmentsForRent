package com.major;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TokenFilter implements Filter {

  private static final String secret = "aUo3TpibnR";

  @Override
  public void destroy() {

  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    HttpServletRequest req = (HttpServletRequest) request;
    HttpServletResponse resp = (HttpServletResponse)response;

    String clientToken = req.getHeader("X-CLIENT-TOKEN");
    System.out.println(clientToken);
    if(secret.equals(clientToken) || req.getMethod().equalsIgnoreCase("OPTIONS")) {
    	System.out.println(req.getMethod());
    	System.out.println("in if");
    	chain.doFilter(request, response);
    } else{
    	System.out.println("out");
        resp.sendError(HttpServletResponse.SC_UNAUTHORIZED);
    }
  }

  @Override
  public void init(FilterConfig arg0) throws ServletException {

  }

}
