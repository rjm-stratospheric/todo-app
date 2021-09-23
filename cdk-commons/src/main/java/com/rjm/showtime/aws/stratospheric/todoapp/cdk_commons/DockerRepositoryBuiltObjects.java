package com.rjm.showtime.aws.stratospheric.todoapp.cdk_commons;

import software.amazon.awscdk.core.App;
import software.amazon.awscdk.core.Environment;
import software.amazon.awscdk.core.Stack;

public class DockerRepositoryBuiltObjects extends BuiltObjects {

    public DockerRepositoryBuiltObjects(App app, Environment environment, Stack stack) {
        super(app, environment, stack);
    }
}
