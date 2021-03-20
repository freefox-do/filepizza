variable "name" {
  description = "name of repository"
  type = string
  default = "docker-devops"
}

variable "package_type" {
  description = "type of packge in repository"
  type = string
  default = "docker"
}

variable "layout" {
  description = "repo layout"
  type = string
  default = "simple-default"
}

variable "description" {
  type = string
  default = "this is docker repo for devops study"
}
