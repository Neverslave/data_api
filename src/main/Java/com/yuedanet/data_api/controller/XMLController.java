package com.yuedanet.data_api.controller;

import com.jfinal.core.Controller;
import com.thoughtworks.xstream.XStream;
import com.yuedanet.data_api.services.IncomeServices;

import java.util.List;

public class XMLController extends Controller {
     IncomeServices incomeServices =IncomeServices.me;
    public void index(){
       List list = incomeServices.getIncome();
        XStream xStream  =new XStream();
        String xmlstr = xStream.toXML(list);
        renderJson(xmlstr);

    }

}
