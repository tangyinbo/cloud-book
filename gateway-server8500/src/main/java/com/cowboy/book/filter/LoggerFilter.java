package com.cowboy.book.filter;

import com.netflix.discovery.converters.Auto;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.cloud.sleuth.Tracer;

/**
 * @Auther: Tangyinbo
 * @Date: 2018/11/19 14:34
 * @Description:
 */
public class LoggerFilter extends ZuulFilter {
    @Auto
    private Tracer tracer;

    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 900;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        tracer.addTag("operator", "bobo");
        System.out.println("==>>traceId:" + tracer.getCurrentSpan().getTraceId());
        return null;
    }
}
