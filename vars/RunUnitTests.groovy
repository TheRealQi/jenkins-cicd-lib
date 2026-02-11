def call(String workdir) {
    dir(workdir) {
        echo 'Running unit tests with Maven'
        sh 'mvn test'
        echo 'Unit tests completed successfully'
    }
}