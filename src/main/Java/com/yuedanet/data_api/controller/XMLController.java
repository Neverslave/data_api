package com.yuedanet.data_api.controller;

import com.jfinal.core.Controller;

public class XMLController extends Controller {
    public void index(){

        renderJson("hello world");
    }

}
