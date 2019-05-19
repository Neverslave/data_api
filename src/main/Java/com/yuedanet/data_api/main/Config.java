package com.yuedanet.data_api.main;

import com.jfinal.config.*;
import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.template.Engine;
import com.yuedanet.data_api.routes.XMLRoutes;

public class Config extends JFinalConfig {

    @Override
    public void configConstant(Constants constants) {

        PropKit.use("config.txt");
        String userName = PropKit.get("userName");

        // Prop 配合用法
        Prop p = PropKit.use("config.txt");
        Boolean devMode = p.getBoolean("devMode");

    }

    @Override
    public void configRoute(Routes routes) {
        routes.add(new XMLRoutes());

    }

    @Override
    public void configEngine(Engine engine) {

    }

    @Override
    public void configPlugin(Plugins plugins) {
        Prop p = PropKit.use("config.txt");
        String jdbcUrl = p.get("jdbcUrl");
        String userName = p.get("userName");
        String password = p.get("password");
        DruidPlugin dp = new DruidPlugin(jdbcUrl, userName, password);
        plugins.add(dp);

/*        ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);
        //arp.addMapping("")
        plugins.add(arp);*/
    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
