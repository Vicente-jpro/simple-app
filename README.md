### AWS JSON
It stil need to be fixed.

```sh
aws sts get-caller-identity
```

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
