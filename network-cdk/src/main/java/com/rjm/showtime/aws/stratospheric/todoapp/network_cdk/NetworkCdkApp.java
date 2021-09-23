package com.rjm.showtime.aws.stratospheric.todoapp.network_cdk;

import com.rjm.showtime.aws.stratospheric.todoapp.cdk_commons.NetworkStackBuilder;
import dev.stratospheric.cdk.Network;

public class NetworkCdkApp {

    public static void main(String... args){

        final var stackBuilder = new NetworkStackBuilder();

        final var builtObjects = stackBuilder.build();

        final var optionalSslCertificateArn = builtObjects.getSslCertificateArn();

        if(optionalSslCertificateArn.isEmpty()){
            new Network(builtObjects.getStack(),
                    "TheOnlyNetworkInThisCdkApp",
                    builtObjects.getAwsEnvironment(),
                    builtObjects.getEnvironmentName(),
                    new Network.NetworkInputParameters());
        }else {
            new Network(builtObjects.getStack(),
                    "TheOnlyNetworkInThisCdkApp",
                    builtObjects.getAwsEnvironment(),
                    builtObjects.getEnvironmentName(),
                    new Network.NetworkInputParameters(optionalSslCertificateArn.get()));
        }

        builtObjects.getApp().synth();
    }

}
