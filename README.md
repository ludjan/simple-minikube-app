# Simple minikube app

I made this app just to understand Docker and Kuberenetes a bit better.

## Requirements
- Docker
- Kubectl
- Minikube
- Java

## Create image
Build a JAR-file from Program.java, and use minikube to create a docker image from the JAR-file, so that it is added to the image repository.

``` sh
javac *.java &&
jar cfe Program.jar Program *.class && 
minikube image build -t program-image:latest .
```

## Run it
Start a container based on the image 
```sh
kubectl run program-container --image=program-image --image-pull-policy=Never --restart=Never
```

## See logs
To verify your app is run in a container within minikube you can run the following command to see its logs.
```sh
kubectl logs program-container
```
