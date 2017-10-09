package pl.edu.uksw.SportEventsAPIGateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Nogaz on 24.08.2017.
 */
public class PreFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(PreFilter.class);

    @Override
    public String filterType() {
        log.info(String.format("filterType method").toString());
        return "pre";
    }

    @Override
    public int filterOrder() {
        log.info(String.format("filterOrder method").toString());
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        log.info(String.format("shouldFilter method").toString());
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
        return null;
    }
}
