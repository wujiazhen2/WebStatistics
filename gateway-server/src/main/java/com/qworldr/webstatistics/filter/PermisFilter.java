package com.qworldr.webstatistics.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wujiazhen on 2018/1/9.
 */
public class PermisFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String login = request.getParameter("login");
        if(login==null){
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(403);
            requestContext.addZuulResponseHeader("content-type","text/html;charset=utf-8");
            requestContext.setResponseBody("非法访问");
        }

        return null;
    }
}
