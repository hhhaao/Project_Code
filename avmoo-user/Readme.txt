#静态文件路径规则，这个路径会经过静态文件处理器
spring.mvc.static-path-pattern=/resources/view/**
#然后会去这个目录找，但要注意，不要覆盖其他默认值
spring.resources.static-locations=classpath:/view/

#示例URL
http://127.0.0.1:8100//resources/view/vue.html
#示例File
\avmoo-user\src\main\resources\view\vue.html


直接下载引入并不行，css和js内部可能还会请求其他文件
<link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
<script src="https://unpkg.com/vue/dist/vue.js"></script>
<script src="https://unpkg.com/element-ui/lib/index.js"></script>