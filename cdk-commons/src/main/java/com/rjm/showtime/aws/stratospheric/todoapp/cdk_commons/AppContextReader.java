package com.rjm.showtime.aws.stratospheric.todoapp.cdk_commons;

import lombok.RequiredArgsConstructor;
import software.amazon.awscdk.core.App;

import java.util.Optional;

import static java.util.Objects.requireNonNull;


@RequiredArgsConstructor
class AppContextReader {

    private final App app;

    public String accountId() { return read(ContextVariable.accountId); }

    public String region() {
        return read(ContextVariable.region);
    }

    public String projectName() {
        return read(ContextVariable.projectName);
    }

    public String serviceName() {
        return read(ContextVariable.serviceName);
    }

    public String springProfile() {
        return read(ContextVariable.springProfile);
    }

    public String dockerImageUrl() {
        return read(ContextVariable.dockerImageUrl);
    }

    public String environmentName() { return read(ContextVariable.environmentName); }

    public Optional<String> sslCertificateArn() { return readOptional(ContextVariable.sslCertificateArn); }

    private String read(ContextVariable contextVariable) {
        final var value = (String) this.app.getNode().tryGetContext(contextVariable.toString());

        requireNonNull(value, "context variable '" + contextVariable + "' must not be null");

        if(value.isEmpty() || value.isBlank()){
            throw new IllegalArgumentException("context variable '" + contextVariable + "' must not be empty nor white space only");
        }

        return value;
    }

    private Optional<String> readOptional(ContextVariable contextVariable) {
        return Optional.ofNullable((String)this.app.getNode().tryGetContext(contextVariable.toString()));
    }

}
