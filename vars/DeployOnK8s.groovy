def call(String IMAGE_REPO, String IMAGE_NAME, String IMAGE_TAG) {
    sh """
        echo 'Deploying application to Kubernetes cluster'
        sed -i 's|image:.*|image: ${IMAGE_REPO}/${IMAGE_NAME}:${IMAGE_TAG}|g' app-deployment.yaml
        kubectl --server=$K8S_API_SERVER --token=$BEARER_TOKEN --insecure-skip-tls-verify apply -f app-deployment.yaml
        echo 'Application deployed successfully'
    """
}
