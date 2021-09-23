package com.rjm.showtime.aws.stratospheric.todoapp.service_cdk;

import com.rjm.showtime.aws.stratospheric.todoapp.cdk_commons.ServiceStackBuilder;
import dev.stratospheric.cdk.ApplicationEnvironment;
import dev.stratospheric.cdk.Network;
import dev.stratospheric.cdk.Service;

import java.util.HashMap;
import java.util.Map;

public class ServiceCdkApp {

    public static void main(String... args){

        final var stackBuilder = new ServiceStackBuilder();

        final var builtObjects = stackBuilder.build();

        final var environmentVariables = environmentVariables(builtObjects.getSpringProfile());

        new Service(
                builtObjects.getStack(),
                "TheOnlyServiceInThisCdkApp",
                builtObjects.getAwsEnvironment(),
                new ApplicationEnvironment(builtObjects.getServiceName(), builtObjects.getEnvironmentName()),
                new Service.ServiceInputParameters(new Service.DockerImageSource(builtObjects.getDockerImageUrl()), environmentVariables).withHealthCheckIntervalSeconds(30),
                Network.getOutputParametersFromParameterStore(builtObjects.getStack(), builtObjects.getEnvironmentName())
        );

        builtObjects.getApp().synth();
    }

    private static Map<String, String> environmentVariables(String springProfile) {
        Map<String, String> vars = new HashMap<>();
        vars.put("SPRING_PROFILES_ACTIVE", springProfile);
        return vars;
    }

}
