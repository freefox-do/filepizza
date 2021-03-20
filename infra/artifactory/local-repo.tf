resource "artifactory_local_repository" "local" {
  key             = var.name
  package_type    = var.package_type
  repo_layout_ref = var.layout
  description     = var.description

/*
  lifecycle {
    prevent_destroy = true
  }
*/
}
