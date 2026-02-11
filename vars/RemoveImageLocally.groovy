def call(String workdir, String imageRepo, String imageName, String imageTag) {
    dir(workdir) {
        echo "Removing Docker image ${IMAGE_REPO}/${IMAGE_NAME}:${IMAGE_TAG} locally"
        sh "docker rmi ${IMAGE_REPO}/${IMAGE_NAME}:${IMAGE_TAG} || true"
        echo "Docker image ${IMAGE_REPO}/${IMAGE_NAME}:${IMAGE_TAG} removed locally"
    }
}

