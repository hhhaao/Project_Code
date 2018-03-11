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