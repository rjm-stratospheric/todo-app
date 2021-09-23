package com.rjm.showtime.aws.stratospheric.todoapp.docker_repo_cdk;

import com.rjm.showtime.aws.stratospheric.todoapp.cdk_commons.DockerRepositoryStackBuilder;
import dev.stratospheric.cdk.DockerRepository;

public class DockerRepoCdkApp {

    public static void main(String... args){

        final var stackBuilder = new DockerRepositoryStackBuilder();

        final var builtObjects = stackBuilder.build();

        new DockerRepository(
                builtObjects.getStack(),
                "TheOnlyDockerRepositoryInThisCdkApp",
                builtObjects.getAwsEnvironment(),
                new DockerRepository.DockerRepositoryInputParameters(builtObjects.getStack().getStackName().toLowerCase(), builtObjects.getAwsEnvironment().getAccount(), 10, false));

        builtObjects.getApp().synth();
    }

}
