package com.rjm.showtime.aws.stratospheric.todoapp.cdk_commons;

import software.amazon.awscdk.core.App;
import software.amazon.awscdk.core.Environment;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.StackProps;

public class DockerRepositoryStackBuilder extends BaseStackBuilder<DockerRepositoryBuiltObjects> {

    @Override
    protected DockerRepositoryBuiltObjects doBuild(App app,
                                                   Environment awsEnvironment,
                                                   AppContextReader appContextReader,
                                                   String projectName) {
        final var serviceName = appContextReader.serviceName();

        final var stackName = projectName + "-" + serviceName + "-" + StackType.DockerRepository;

        final var stackProps = StackProps.builder().env(awsEnvironment).stackName(stackName).build();

        final var stack = new Stack(app, "TheOnlyStackInTheCdkApp", stackProps);

        return new DockerRepositoryBuiltObjects(app, awsEnvironment, stack);
    }

}
