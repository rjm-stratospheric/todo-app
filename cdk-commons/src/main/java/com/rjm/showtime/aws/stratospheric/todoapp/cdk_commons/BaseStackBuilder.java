package com.rjm.showtime.aws.stratospheric.todoapp.cdk_commons;

import software.amazon.awscdk.core.App;
import software.amazon.awscdk.core.Environment;

public abstract class BaseStackBuilder<BO extends BuiltObjects> implements StackBuilder<BO> {

    @Override
    public BO build() {
        final var app = new App();

        final var appContextReader = new AppContextReader(app);

        final var accountId = appContextReader.accountId();

        final var region = appContextReader.region();

        final var awsEnvironment =  Environment.builder().account(accountId).region(region).build();

        final var projectName = appContextReader.projectName();

        return doBuild(app, awsEnvironment, appContextReader, projectName);
    }

    protected abstract BO doBuild(App app,
                                  Environment awsEnvironment,
                                  AppContextReader appContextReader,
                                  String projectName);
}
