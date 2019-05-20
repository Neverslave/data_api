package com.yuedanet.data_api.services;

import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

import java.util.ArrayList;
import java.util.List;

public class IncomeServices {
    public static  final IncomeServices me = new IncomeServices();
    //调取外部配置
    Prop p  =PropKit.use("sql.txt");
    String sql = p.get("abc");
    //todo xml
    public List<Record> getIncome(){
        List<Record> list;
        list = Db.find("select * from account");

        /****
         *
         *　　XStream xstream = new XStream();
         * 　　String xmlStr = xstream.toXML(javabean);
         *
         * */
        return list;
    }
}
