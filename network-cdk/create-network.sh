#!/bin/bash

AWS_ACCESS_KEY_ID=${1}
AWS_SECRET_ACCESS_KEY=${2}
AWS_DEFAULT_REGION=${3}

cdk deploy \
  -c accountId=${4} \
  -c projectName=${5} \
  -c environmentName=${6} #\
  # -c sslCertificateArn=${6}
