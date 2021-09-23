#!/bin/bash

cdk destroy \
  --profile ${1} \
  -c accountId=${2} \
  -c region=${3} \
  -c projectName=${4} \
  -c environmentName=${5} \
  -c serviceName=${6} \
  -c springProfile=${7} \
  -c dockerImageUrl=${8} #\
  # -c sslCertificateArn=${6}
