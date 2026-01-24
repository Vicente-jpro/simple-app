### AWS JSON
It stil need to be fixed.

```sh
aws sts get-caller-identity
```

### Set enviroment variable for github actions

```sh
AWS_ACCESS_KEY_ID = change_me
```

```sh
AWS_SECRET_ACCESS_KEY = change_me
```
```sh
AWS_DEFAULT_REGION = change_me
```

```sh
ECR_REGISTERY = change_me
```

```sh
ECR_REPOSITORY
```

```sh
IMAGE_REPO_URL = change_me
```

```sh
CLUSTER_NAME = change_me
```

```sh
SERVICE_NAME = change_me
```

```sh
TASK_DEFINITION_NAME = change_me
```

```sh
CONTAINER_NAME = change_me
```````````````````



```json
{
    "family": "task01",
    "containerDefinitions": [
        {
            "name": "simple-app-container",
            "image": "docker.io/vicentesimao/simple-app:latest",
            "cpu": 1024,
            "portMappings": [
                {
                    "name": "simple-app-80-tcp",
                    "containerPort": 8080,
                    "hostPort": 8080,
                    "protocol": "tcp",
                    "appProtocol": "http"
                }
            ],
            "essential": true,
            "environment": [],
            "mountPoints": [],
            "volumesFrom": [],
            "logConfiguration": {
                "logDriver": "awslogs",
                "options": {
                    "awslogs-group": "/ecs/task01",
                    "awslogs-create-group": "true",
                    "awslogs-region": "us-east-1",
                    "awslogs-stream-prefix": "ecs"
                }
            },
            "systemControls": []
        }
    ],
    "executionRoleArn": "arn:aws:iam::176276968564:role/ecsTaskExecutionRole",
    "networkMode": "awsvpc",
    "volumes": [],
    "placementConstraints": [],
    "requiresCompatibilities": [
        "FARGATE"
    ],
    "cpu": "1024",
    "memory": "3072",
    "runtimePlatform": {
        "cpuArchitecture": "X86_64",
        "operatingSystemFamily": "LINUX"
    },
    "enableFaultInjection": false
}
```
