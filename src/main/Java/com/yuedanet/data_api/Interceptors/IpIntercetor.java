package com.yuedanet.data_api.Interceptors;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

public class IpIntercetor implements Interceptor {
    @Override
    public void intercept(Invocation invocation) {


        invocation.invoke();

    }
}
