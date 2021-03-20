data "aws_ssm_parameter" "artifactory_username" {
  name = "/devops/artifactory/artifactory-username"
}

data "aws_ssm_parameter" "artifactory_password" {
  name = "/devops/artifactory/artifactory-password"
}
