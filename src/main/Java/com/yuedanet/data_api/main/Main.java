package com.yuedanet.data_api.main;

import com.jfinal.server.undertow.UndertowServer;


public class Main {
    public static void main(String[] args) {
        UndertowServer.start(Config.class,80,true);
    }
}
