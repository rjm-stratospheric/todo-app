#!/bin/bash

REQUIRE_APPROVAL=${7:-any-change}

export AWS_ACCESS_KEY_ID=${1}
export AWS_SECRET_ACCESS_KEY=${2}

cdk deploy \
  --require-approval $REQUIRE_APPROVAL \
  -c accountId=${3} \
  -c region=${4} \
  -c projectName=${5} \
  -c environmentName=${6} #\
  # -c sslCertificateArn=${6}
