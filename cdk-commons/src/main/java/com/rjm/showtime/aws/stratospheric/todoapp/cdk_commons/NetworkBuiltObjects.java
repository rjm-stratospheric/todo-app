package com.rjm.showtime.aws.stratospheric.todoapp.cdk_commons;

import lombok.Getter;
import software.amazon.awscdk.core.App;
import software.amazon.awscdk.core.Environment;
import software.amazon.awscdk.core.Stack;

import java.util.Optional;

@Getter
public class NetworkBuiltObjects extends BuiltObjects {

    private final String environmentName;
    private final Optional<String> sslCertificateArn;

    public NetworkBuiltObjects(App app,
                               Environment environment,
                               Stack stack,
                               String environmentName,
                               Optional<String> sslCertificateArn) {
        super(app, environment, stack);
        this.environmentName = environmentName;
        this.sslCertificateArn = sslCertificateArn;
    }
}
