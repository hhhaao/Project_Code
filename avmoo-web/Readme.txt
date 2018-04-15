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

mybatis.config-location  指定xml配置文件路径
mybatis.check-config-location 检查是否存在mybatis config xml文件
mybatis.mapper-locations	指定dao.xml脚本文件路径
mybatis.type-aliases-package	指定自定义VO类包
mybatis.type-handlers-package 数据库类型-Java类型转换器，默认给我们提供，不需要
mybatis.executor-type 默认SIMPLE   枚举 SIMPLE REUSE BATCH
mybatis.configuration-properties http://www.mybatis.org/mybatis-3/configuration.html#properties
mybatis.configuration.xxxxxx-xxxxx-xxxxxxx http://www.mybatis.org/mybatis-3/configuration.html#settings


---------------------------------------------------

com.liuhao.avmoo.web.dao.IAvmooDao.java
\src\main\java \com\liuhao\avmoo\web\dao\IAvmooDao.java
\src\main\resources \com\liuhao\avmoo\web\dao\IAvmooDao.xml
必须包含<mapper namespace="com.liuhao.avmoo.web.dao.IAvmooDao">
启动会自动加载，目录和文件名必须一致,不需要
mybatis.mapper-locations=classpath:daoxml/*.xml

---------------------------------------------------
resultType="java.lang.String" 是必须

resultType="com.liuhao.avmoo.web.domain.AvmooVO"
全路径不需要type-aliases-package配置
mybatis.type-aliases-package=com.liuhao.avmoo.web.domain
----------------------------------------------------
mybatis如果启动类路径，dao xml，result type，按规范来，啥配置都不需要, 错了

@Mapper
public interface IAvmooDao

@MapperScan("com.liuhao.avmoo.web")
@MapperScan("com.liuhao.avmoo.web.dao")
public class ApplicationMain

<artifactId>spring-cloud-starter-config</artifactId>
和
bootstrap.yml
和
ApplicationContext ApplicationContext.Parenet @Autowird Null 有关

------------------------------------------------------
flyway.enabled: false
flyway.baseline-on-migrate: true
flyway.baseline-version: 0

一般
flyway.baseline-on-migrate 会创建版本记录表

classpath:db/migration/V1__**.sql从V1开始
flyway.baseline-version默认值是1
但是如果数据库有表, V1的SQL文件不会执行，要从V2开始
如果没有表，V1的SQL文件会执行
所以最好设置flyway.baseline-version: 0

------------------------------------------------------





