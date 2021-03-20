terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "~> 3.27"
    }

    artifactory = {
      source  = "registry.terraform.io/jfrog/artifactory"
      version = "2.2.7"
    }
  }

  backend "s3" {
     profile  = "aws-devops"
     bucket   = "terraform-state-file-devops"
     region   = "ap-southeast-2"
     key      = "aws/artifactory/terraform.tfstate"
  }
}

provider "aws" {
  profile = "aws-devops"
  region  = "ap-southeast-2"
}

provider "artifactory" {
  url      = "https://freefox1.jfrog.io/"
  username = data.aws_ssm_parameter.artifactory_username.value
  password = data.aws_ssm_parameter.artifactory_password.value
}
