package com.moon.mall.listener;

import com.moon.mall.entity.Sku;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import top.javatool.canal.client.annotation.CanalTable;
import top.javatool.canal.client.handler.EntryHandler;

import javax.annotation.Resource;

/**
 * @Auther Xue KaiLun
 * @Date 2021-06-21 17:07
 */
@Slf4j
@Component
@CanalTable(value = "sku")
public class SkuHandler implements EntryHandler<Sku> {

    // TODO 后续这块应该要用Fegin

    @Resource
    private RestTemplate restTemplate;

    private String url = "http://localhost:8084/search";

    public void insert(Sku sku) {
        log.info("sku >>> insert ... start");
        String path = url + "/add";
        if (sku.getStatus() == 1) {
            // 导入索引
            try {
                ResponseEntity<String> responseEntity = restTemplate.postForEntity(path, sku, String.class);
                log.info("{}", responseEntity.getStatusCode());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void update(Sku before, Sku after) {
        log.info("sku >>> update ... start");
        try {
            String path = "";
            if (after.getStatus().intValue() == 2) {
                path = url + "/del/" + after.getId();
                //导入索引
                restTemplate.getForEntity(path, String.class);
            } else {
                path = url + "/add";
                after.setCategoryName(after.getCategory_name());
                after.setCategoryId(after.getCategory_id());
                after.setBrandName(after.getBrand_name());
                after.setBrandId(after.getBrand_id());
                restTemplate.postForEntity(path, after, String.class);
            }

            log.info("update sku request >>> {}",path);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Sku sku) {
        log.info("sku >>> delete ... start");

        String path = url + "/del/" + sku.getId();
        try {
            //导入索引
            restTemplate.getForEntity(path, String.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
