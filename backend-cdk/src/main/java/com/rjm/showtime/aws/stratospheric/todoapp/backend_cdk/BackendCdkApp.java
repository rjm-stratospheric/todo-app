package com.rjm.showtime.aws.stratospheric.todoapp.backend_cdk;

import dev.stratospheric.cdk.SpringBootApplicationStack;
import software.amazon.awscdk.core.App;
import software.amazon.awscdk.core.Environment;

import static java.util.Objects.requireNonNull;

public class BackendCdkApp {

    public static void main(String... args){

        var app = new App();

        var accountId = (String) app.getNode().tryGetContext("accountId");
        requireNonNull(accountId, "context variable 'accountId' must not be null");

        var region = (String) app.getNode().tryGetContext("region");
        requireNonNull(region, "context variable 'region' must not be null");

        new SpringBootApplicationStack(
                app,
                "todo-app-backend",
                Environment.builder().account(accountId).region(region).build(),
                "docker.io/obi300/todo-app-backend:1.0"
        );

        app.synth();
    }

}
