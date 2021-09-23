package com.rjm.showtime.aws.stratospheric.todoapp.cdk_commons;

import lombok.Getter;
import software.amazon.awscdk.core.App;
import software.amazon.awscdk.core.Environment;
import software.amazon.awscdk.core.Stack;

@Getter
public class ServiceBuiltObjects extends BuiltObjects {

    private final String environmentName;
    private final String serviceName;
    private final String springProfile;
    private final String dockerImageUrl;

    public ServiceBuiltObjects(App app,
                               Environment environment,
                               Stack stack,
                               String environmentName,
                               String serviceName,
                               String springProfile,
                               String dockerImageUrl) {
        super(app, environment, stack);
        this.environmentName = environmentName;
        this.serviceName = serviceName;
        this.springProfile = springProfile;
        this.dockerImageUrl = dockerImageUrl;
    }
}
