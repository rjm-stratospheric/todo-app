#!/bin/bash

cdk destroy \
  --profile ${1} \
  -c accountId=${2} \
  -c region=${3} \
  -c projectName=${4} \
  -c environmentName=${5} #\
  # -c sslCertificateArn=${6}
