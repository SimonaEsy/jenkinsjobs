pipelineJob('MyDeclarativePipelineJob') {
    definition {
        cps {
            script("""
pipeline {
    agent any
    stages {
        stage('Hello World') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
""")
        }
    }
}
