pipelineJob('appdevPipelineJob') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/SimonaEsy/appdev.git')
                    }
                    branches('main')
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
}
