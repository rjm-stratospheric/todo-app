#!/bin/bash

docker tag backend:1.0 obi300/todo-app-backend:1.0

docker login docker.io -u obi300 -p nanayss091XA_

docker push obi300/todo-app-backend:1.0