## Micronaut Kubernetes Spike

Make sure that the docker desktop is running and the kubernetes is enabled

- Build a docker image for the app
    ```json
    ./gradlew dockerBuild
    ```

- Create a config map from the yml file
    ```json
     kubectl create configmap dev-config --from-file dev-config.yaml
    ```

- Create a secret my.city
    ```json
    kubectl create secret generic my-secret \
      --from-literal=my.city=London
    ```

- Create a kubernetes service
    ```json
    kubectl apply -f service.yml
    ```

- Create a kubernetes deployment
    ```json
    kubectl apply -f deployment.yml
    ```

- Port forward on the service
    ```json
    kubectl port-forward svc/my-service 8080:80
    ```
