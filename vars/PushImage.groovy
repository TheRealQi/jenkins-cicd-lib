def call(String imageRepo, String imageName, String imageTag) {
    sh """
        echo 'Pushing Docker image to Docker Hub'
        echo ${DOCKERHUB_PASS} | docker login -u ${DOCKERHUB_USER} --password-stdin
        docker push ${IMAGE_REPO}/${IMAGE_NAME}:${IMAGE_TAG}
        echo 'Docker image pushed successfully'
    """
}
