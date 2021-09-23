package com.rjm.showtime.aws.stratospheric.todoapp.cdk_commons;

import software.amazon.awscdk.core.App;
import software.amazon.awscdk.core.Environment;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.StackProps;

public class ServiceStackBuilder extends BaseStackBuilder<ServiceBuiltObjects> {

    @Override
    protected ServiceBuiltObjects doBuild(App app,
                                          Environment awsEnvironment,
                                          AppContextReader appContextReader,
                                          String projectName) {

        var environmentName = appContextReader.environmentName();

        var serviceName = appContextReader.serviceName();

        var stackName = projectName + "-" + environmentName + "-" + serviceName + "-" + StackType.Service;

        var stackProps = StackProps.builder().env(awsEnvironment).stackName(stackName).build();

        var stack = new Stack(app, "TheOnlyStackInTheCdkApp", stackProps);

        var springProfile = appContextReader.springProfile();

        var dockerImageUrl = appContextReader.dockerImageUrl();

        return new ServiceBuiltObjects(app, awsEnvironment, stack, environmentName, serviceName, springProfile, dockerImageUrl);
    }

}
