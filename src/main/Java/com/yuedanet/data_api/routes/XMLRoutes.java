package com.yuedanet.data_api.routes;

import com.jfinal.config.Routes;
import com.yuedanet.data_api.controller.XMLController;

public class XMLRoutes extends Routes {
    @Override
    public void config() {
        add("/XML", XMLController.class);
    }
}
