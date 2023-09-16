# Simple minikube app

Requires:
- Docker
- Kubectl
- Minikube
- Java

Build a JAR from Program.java.
2. Use minikube to create a docker image inside of minikube from the JAR file.
3. Start a container using the image.
4. Check the logs of the container

Build a JAR-file from Program.java, and use minikube to create a docker image from the JAR-file, so that it is added to the image repository.
``sh
javac *.java &&
jar cfe Program.jar Program *.class && 
minikube image build -t program-image:latest .
``

Run the image 
``sh
kubectl run program-container --image=program-image --image-pull-policy=Never --restart=Never
``

When checking the logs, you should see the program running inside minikube and that it has started printing.
``sh
kubectl logs program-container
``
