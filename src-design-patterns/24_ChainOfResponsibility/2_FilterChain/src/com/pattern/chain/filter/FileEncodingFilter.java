package com.pattern.chain.filter;

import com.pattern.chain.servlet.Request;
import com.pattern.chain.servlet.Response;

public class FileEncodingFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("FileEncodingFilter before==>" + request);
        chain.doFilter(request,response,chain);
        System.out.println("FileEncodingFilter after==>" + response);
    }
}
