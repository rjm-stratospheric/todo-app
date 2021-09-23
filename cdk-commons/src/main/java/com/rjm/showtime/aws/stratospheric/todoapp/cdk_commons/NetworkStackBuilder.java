package com.rjm.showtime.aws.stratospheric.todoapp.cdk_commons;

import software.amazon.awscdk.core.App;
import software.amazon.awscdk.core.Environment;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.StackProps;

public class NetworkStackBuilder extends BaseStackBuilder<NetworkBuiltObjects> {

    @Override
    protected NetworkBuiltObjects doBuild(App app,
                                          Environment awsEnvironment,
                                          AppContextReader appContextReader,
                                          String projectName) {

        var environmentName = appContextReader.environmentName();

        var stackName = projectName + "-" + environmentName + "-" + StackType.Network;

        var stackProps = StackProps.builder().env(awsEnvironment).stackName(stackName).build();

        var stack = new Stack(app, "TheOnlyStackInTheCdkApp", stackProps);

        return new NetworkBuiltObjects(app, awsEnvironment, stack, environmentName, appContextReader.sslCertificateArn());
    }

}
