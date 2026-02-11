def call(String workdir, String imageRepo, String imageName, String imageTag) {
    dir(workdir) {
        sh """
        echo 'Deploying application to Kubernetes cluster'
        sed -i 's|image:.*|image: ${imageRepo}/${imageName}:${imageTag}|g' app-deployment.yaml
        kubectl --server=$K8S_API_SERVER --token=$BEARER_TOKEN --insecure-skip-tls-verify apply -f app-deployment.yaml
        echo 'Application deployed successfully'
        """
    }
}
