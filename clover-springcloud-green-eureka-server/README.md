Eureka服务注册中心

配置文件解析：
springcloud配置文件：application.properties
springcloud Eureka启动默认配置信息：application-master.properties
springcloud Eureka启动端口8762配置信息：application-slave8762.properties
springcloud Eureka启动端口8763配置信息：application-slave8763.properties

maven构建Jar命令：mvn clean package

打包后Eureka集群启动命令：
nohup java -jar clover-springcloud-green-eureka-server-0.0.1-SNAPSHOT.jar &
nohup java -jar clover-springcloud-green-eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=slave8763 > log8763.log &
nohup java -jar clover-springcloud-green-eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=slave8762 > log8762.log &
