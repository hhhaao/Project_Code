http://cloud.spring.io/spring-cloud-static/spring-cloud-netflix/1.4.3.RELEASE/single/spring-cloud-netflix.html#spring-cloud-eureka-server

如果不配置任何东西，默认端口是8080

还会注册到其他服务器，默认注册到本地8761端口上，需要禁用， 还会抓取注册信息，本身就是服务器美必要抓取，客服端才抓取，抓取的是服务列表，需要禁用
java.net.ConnectException: Connection refused: connect



eureka.client.registerWithEureka: false 不注册到其他Eureka服务器（本地8761）
eureka.client.fetchRegistry: false	不抓取Eureka里的服务列表

eureka.client.serviceUrl.defaultZone 集群的时候才使用到，设置Eureka服务器所在的地址，查询服务、注册服务都依赖这个地址?目标
eureka.client.serviceUrl.defaultZone 集群的时候才使用到，将自己注册到其他Eureka
    
eureka.instance.hostname 当前Eureka服务的名称，等同于IP地址

eureka.instance.hostname=master 
eureka.instance.hostname=backup

可以把自己写上
defaultZone: http://master:1122/eureka/,http://backup:9988/eureka/
defaultZone: http://backup:9988/eureka/
    
server.port: 8761

eureka:
  instance:
    hostname: localhost
  client:
    registerWithEureka: false
    fetchRegistry: false
    serviceUrl:
      defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/
      
      
      
application-peer1.properties
application-peer2.properties

/etc/hosts文件
127.0.0.1	peer1	和eureka.instance.hostname,defaultZone一致?是
127.0.0.1	peer2	和eureka.instance.hostname,defaultZone一致?是


java -jar eureka-server-1.0.0.jar --spring.profiles.active=peer1
java -jar eureka-server-1.0.0.jar --spring.profiles.active=peer2


不可用分片unavailable-replicas
可用分片available-replicase


eureka.client.registerWithEureka: true 集群需要true?是
eureka.client.fetchRegistry: true 集群需要true?是

spring:
  profiles: peer1
eureka:
  instance:
    hostname: peer1
  client:
    serviceUrl:
      defaultZone: http://peer2/eureka/

spring:
  profiles: peer2
eureka:
  instance:
    hostname: peer2
  client:
    serviceUrl:
      defaultZone: http://peer1/eureka/
      
eureka.instance.preferIpAddress: true