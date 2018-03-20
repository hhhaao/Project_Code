http://cloud.spring.io/spring-cloud-static/spring-cloud-netflix/1.4.3.RELEASE/single/spring-cloud-netflix.html#spring-cloud-eureka-server

如果不配置任何东西，默认端口是8080

还会注册到其他服务器，默认注册到本地8761端口上，需要禁用， 还会抓取注册信息，本身就是服务器美必要抓取，客服端才抓取，抓取的是服务列表，需要禁用
java.net.ConnectException: Connection refused: connect



eureka.client.registerWithEureka: false 不注册到其他Eureka服务器（本地8761）
eureka.client.fetchRegistry: false	不抓取Eureka里的服务列表
    
server.port: 8761

eureka:
  instance:
    hostname: localhost
  client:
    registerWithEureka: false
    fetchRegistry: false
    serviceUrl:
      defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/