package com.rjm.showtime.aws.stratospheric.todoapp.cdk_commons;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import software.amazon.awscdk.core.App;
import software.amazon.awscdk.core.Environment;
import software.amazon.awscdk.core.Stack;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class BuiltObjects {

    private final App app;
    private final Environment awsEnvironment;
    private final Stack stack;
}
