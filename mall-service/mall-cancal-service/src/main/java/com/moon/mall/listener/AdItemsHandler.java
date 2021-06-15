package com.moon.mall.listener;

import com.moon.mall.entity.AdItems;
import org.springframework.stereotype.Component;
import top.javatool.canal.client.annotation.CanalTable;
import top.javatool.canal.client.handler.EntryHandler;

@CanalTable(value = "ad_items")
@Component
public class AdItemsHandler implements EntryHandler<AdItems> {

    public void update(AdItems before,AdItems after){
        System.out.println("before --->" + before);
        System.out.println("after --->" + after);

    }
}
