# 模块搭建代表的含义
    mall-api：存储所有数据库表对应的Bean和Feign接口
    mall-gateway：存储所有微服务网关
    mall-service：存储所有微服务工程
    mall-util：存储公共工程
    mall-web：存储所有和页面渲染有关的工程
# 涉及的内容
## Maven
    父子级模块的搭建
## MyBaits
    MyBatis与Spring Boot配置有两种：
    1. application.yml 2. MyBatisConfiguration.java
    本模块目前采用的为application.yml
## Swagger
    localhost:xxxx/swagger-ui.html