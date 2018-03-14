Main函数如果不在父级目录，在平行目录，Component的加载，Mybatis.Mapper都会导致很多问题

@MapperScan("com.liuhao.avmoo.web.dao")

<groupId>org.mybatis.spring.boot</groupId>
<artifactId>mybatis-spring-boot-starter</artifactId>

引入mybatis-start配置，如果不加任何配置会报错；

@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
或
spring.datasource.url=jdbc:mysql://localhost:3306/liuhao_test

Description:

Cannot determine embedded database driver class for database type NONE


发现加载不能class，有可能是仓储的包邮问题，需要清理一下，重新从网上下载


如果启动类和Controller不在同一个命名的父子目录，Controller会扫描不到，在启动类加父集目录
@SpringBootApplication(scanBasePackages = "com.liuhao.avmoo.web")


start.spring.io 下找到的mybatis官方的， 一致github有示例
<groupId>org.mybatis.spring.boot</groupId>
<artifactId>mybatis-spring-boot-starter</artifactId>

cmp没用使用mybatis-spring-boot-starter, datasource是自己配置的

mybatis document
http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/

mybatis.config-location
mybatis.check-config-location
mybatis.mapper-locations
mybatis.type-aliases-package
mybatis.type-handlers-package
mybatis.executor-type
mybatis.configuration-properties
mybatis.configuration.xxxxxx-xxxxx-xxxxxxx


---------------------------------------------------

com.liuhao.avmoo.web.dao.IAvmooDao.java
\src\main\java \com\liuhao\avmoo\web\dao\IAvmooDao.java
\src\main\resources \com\liuhao\avmoo\web\dao\IAvmooDao.xml
必须包含<mapper namespace="com.liuhao.avmoo.web.dao.IAvmooDao">
启动会自动加载，目录和文件名必须一致,不需要
mybatis.mapper-locations=classpath:daoxml/*.xml





