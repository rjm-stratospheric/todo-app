#!/bin/bash

cdk destroy \
  --profile ${1} \
  -c accountId=${2} \
  -c region=${3} \
  -c projectName=${4} \
  -c serviceName=${5}
