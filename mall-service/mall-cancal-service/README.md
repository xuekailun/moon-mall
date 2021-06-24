# Cancal
    https://github.com/alibaba/canal

## 查询binlog 是否开启
    show variables like 'log_%';
## 数据库要新建cancal

授权cancal连接MySQL账号具有作为MySQL salve的权限，如果已有账户可直接grant;

    CREATE USER canal IDENTIFIED BY 'canal';
    GRANT SELECT, REPLICATION SLAVE, REPLICATION CLIENT ON *.* TO 'canal'@'%';
    -- GRANT ALL PRIVILEGES ON *.* TO 'canal'@'%' ;
    FLUSH PRIVILEGES; # 刷新权限

## cancal 配置的修改  canal.deployer-1.1.5\conf\example
    修改核心配置canal.properties 和instance.properties，canal.properties 是canal自身的配
    置，instance.properties是需要同步数据的数据库连接配置
    
修改配置如下

    # position info
    canal.instance.master.address=192.168.100.130:3306
    
# 踩坑 8.0
## Caused by: java.io.IOException: connect /127.0.0.1:3306 failure

    是因为8.0的时候，加密方式为“caching_sha2_password”。因此需要修改一下加密方式
    
    -- 查看用户名和密码
    select host, user, authentication_string, plugin from user;
    
    -- 修改加密方式
    ALTER USER 'canal'@'%' IDENTIFIED WITH mysql_native_password BY 'canal';

    -- 刷新权限
    FLUSH PRIVILEGES;

# AbstractCanalClient