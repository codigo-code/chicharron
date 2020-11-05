pipeline {
  agent {
    dockerfile {
      filename 'dockerfile'
    }

  }
  stages {
    stage('build') {
      steps {
        sh 'mvn clean install'
      }
    }

    stage('generate image') {
      steps {
        sh 'docker build -t imagen/loca . '
      }
    }

    stage('deploy') {
      steps {
        sh 'docker run -p 8080:8080 imagen/loca'
      }
    }

  }
  environment {
    imagen = 'ccutn-image'
  }
}