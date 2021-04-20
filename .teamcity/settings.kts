import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.PullRequests
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.commitStatusPublisher
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.pullRequests
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.dockerSupport
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot
import com.kotlin.v2019_2.buildTypes.DockerBuild


version = "2020.2"


project {

    vcsRoot(VCSExample)


    buildType(DockerBuildsteve)

}

object DockerBuildsteve : DockerBuild({
    name = "docker build"

    vcs {
        root(VCSExample)
    }


    repository = "13.239.84.133:8082"
    imageName = "filepizza"
    tag = "v1.0.4"
    artusername = "admin"
    artpassword = "credentialsJSON:4365953f-8420-45b5-bebe-924c1243cd0a"

})


object VCSExample : GitVcsRoot({
    name = "VCSExample"
    url = "https://github.com/freefox-do/filepizza.git"
    branch = "refs/heads/main"
    authMethod = password {
        userName = "capnash"
        password = "d5bbe75793d3b650338fee279857bb1e90e8ea28"
    }
})
