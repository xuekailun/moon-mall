#商品服务采用的多级缓存的模式

## 缓存常用注解
### @EnableCaching:
    开关性注解，在项目启动类或某个配置类上使用此注解后，则表示允许使用注解的方式进行缓存操作。
### @Cacheable:
    可用于类或方法上；在目标方法执行前，会根据key先去缓存中查询是否有数据，有就直接返回缓存中key的对应的value值。不在执行目标方法；无则执行目标方法，并发方法的返回值作为value,并以键值对的形式存入缓存
### @CacheEvict:
    可用于类或方法上；在执行完目标方法后，清楚缓存中对应key的数据。
### @CachePut:
    可用于类或方法上；在执行完目标方法后，并将方法的返回值作为value,并以键值对的形式存入缓存中
### @Caching
    此注解可作为@Cacheable、@CacheEvict、@CachePut三种注解中的任何一种或几种来使用。
### @CacheConfig:
    可以用于配置@Cacheable、@CacheEvict、@CachePut这三个注解的一些公共属性，例如cacheNames、keyGenerator