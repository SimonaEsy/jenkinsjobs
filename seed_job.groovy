job('super-seed') {
  scm {
    git {
      remote {
        url ('https://github.com/SimonaEsy/jenkinsjobs.git')
      }
    }
  }
  steps {
    dsl {
      external('/**/*.groovy')
      removeAction('DELETE')
    }
  }
}
