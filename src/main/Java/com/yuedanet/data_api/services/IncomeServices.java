package com.yuedanet.data_api.services;

import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;

public class IncomeServices {
    //调取外部配置
    Prop p  =PropKit.use("sql.txt");
    String sql = p.get("111");
    //todo xml
}
