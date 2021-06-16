# Cancal
    https://github.com/alibaba/canal
    
## 数据库要新建cancal

授权cancal连接MySQL账号具有作为MySQL salve的权限，如果已有账户可直接grant;

    CREATE USER canal IDENTIFIED BY 'canal';
    GRANT SELECT, REPLICATION SLAVE, REPLICATION CLIENT ON *.* TO 'canal'@'%';
    -- GRANT ALL PRIVILEGES ON *.* TO 'canal'@'%' ;
    FLUSH PRIVILEGES

## cancal 配置的修改
    修改核心配置canal.properties 和instance.properties，canal.properties 是canal自身的配
    置，instance.properties是需要同步数据的数据库连接配置
    
修改配置如下

    # position info
    canal.instance.master.address=192.168.100.130:3306
