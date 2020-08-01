#基础镜像
FROM openjdk:8
#作者
MAINTAINER demo <demo@qq.com>

VOLUME /tmp
#指定配置文件，以及jar包在服务器上的路径
ENTRYPOINT ["java","-Dspring.profiles.active=prod","-jar","/var/jenkins_home/workspace/my_test/target/jenkins_test-1.0-SNAPSHOT.jar"]
#暴露端口
EXPOSE 8000