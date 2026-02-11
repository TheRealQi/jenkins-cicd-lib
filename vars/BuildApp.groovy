def call(String workdir) {
    dir(workdir) {
        echo 'Building application in ${workdir}'
        sh 'mvn clean package -DskipTests'
        echo 'Application built successfully in ${workdir}'
    }
}
