
org.apache.httpcomponents
Httpclient

ZuulServlet extends HttpServlet

Zuul也要注册到Eureka，作为一个服务

Hystrix fallback   1s   spring bean no init


zuul 不关系 示例 数量  负载均衡  Rebon

集群里: zuul需要注册到Eureka，需要通过Eureka查询服务实例的地址，之后才转发
所以集群里Zuul也是Eureka Client