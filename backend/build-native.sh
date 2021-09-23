#!/bin/bash

#native-image [options]
#             -jar jarfile
#             [imagename]
#             [options]

native-image \
  -Dnative-image.xmx=6g \
  -H:+StaticExecutableWithDynamicLibC \
  -H:+ReportExceptionStackTraces \
  -cp /build/classes/java/main: \
      /build/classes/java/aot: \

  backend-1.0

  native-image
-H:+StaticExecutableWithDynamicLibC
-H:Name=/layers/paketo-buildpacks_native-image/native-image/com.rjm.showtime.aws.stratospheric.todoapp.backend.BackendApp
-cp /workspace:
/workspace/BOOT-INF/classes:
/workspace/BOOT-INF/lib/spring-native-0.10.3.jar:/workspace/BOOT-INF/lib/jsr305-3.0.2.jar:/workspace/BOOT-INF/lib/spring-boot-autoconfigure-2.5.4.jar:
/workspace/BOOT-INF/lib/spring-boot-2.5.4.jar:/workspace/BOOT-INF/lib/jakarta.annotation-api-1.3.5.jar:/workspace/BOOT-INF/lib/spring-webmvc-5.3.9.jar:/workspace/BOOT-INF/lib/spring-web-5.3.9.jar:
/workspace/BOOT-INF/lib/spring-context-5.3.9.jar:/workspace/BOOT-INF/lib/spring-aop-5.3.9.jar:/workspace/BOOT-INF/lib/spring-beans-5.3.9.jar:/workspace/BOOT-INF/lib/spring-expression-5.3.9.jar:
/workspace/BOOT-INF/lib/spring-core-5.3.9.jar:/workspace/BOOT-INF/lib/snakeyaml-1.28.jar:/workspace/BOOT-INF/lib/tomcat-embed-el-9.0.52.jar:/workspace/BOOT-INF/lib/hibernate-validator-6.2.0.Final.jar:
/workspace/BOOT-INF/lib/logback-classic-1.2.5.jar:/workspace/BOOT-INF/lib/log4j-to-slf4j-2.14.1.jar:/workspace/BOOT-INF/lib/jul-to-slf4j-1.7.32.jar:/workspace/BOOT-INF/lib/spring-jcl-5.3.9.jar:
/workspace/BOOT-INF/lib/jakarta.validation-api-2.0.2.jar:/workspace/BOOT-INF/lib/jboss-logging-3.4.2.Final.jar:/workspace/BOOT-INF/lib/classmate-1.5.1.jar:
/workspace/BOOT-INF/lib/jackson-datatype-jsr310-2.12.4.jar:/workspace/BOOT-INF/lib/jackson-module-parameter-names-2.12.4.jar:/workspace/BOOT-INF/lib/jackson-annotations-2.12.4.jar:
/workspace/BOOT-INF/lib/jackson-core-2.12.4.jar:/workspace/BOOT-INF/lib/jackson-datatype-jdk8-2.12.4.jar:/workspace/BOOT-INF/lib/jackson-databind-2.12.4.jar:
/workspace/BOOT-INF/lib/tomcat-embed-websocket-9.0.52.jar:/workspace/BOOT-INF/lib/tomcat-embed-core-9.0.52.jar:/workspace/BOOT-INF/lib/logback-core-1.2.5.jar:
/workspace/BOOT-INF/lib/slf4j-api-1.7.32.jar:/workspace/BOOT-INF/lib/log4j-api-2.14.1.jar
com.rjm.showtime.aws.stratospheric.todoapp.backend.BackendApp

