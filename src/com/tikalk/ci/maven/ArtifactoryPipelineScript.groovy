package com.tikalk.ci.maven

import com.tikalk.utils.Library

@Library('tikal-advanced-pipeline') _

/**
 * Created by ccohen on 7/6/17.
 */
node() {
    var1 = 'chen1'
    def pipeline = new ArtifactoryPipeline(this)

    pipeline.artifactoryName = 'artifactory'
    pipeline.mavenName = 'mvn350'

    pipeline.snapshotRepo = 'libs-snapshot-local'
    pipeline.releaseRepo = 'libs-release-local'
    pipeline.vSnapshotRepo = 'libs-snapshot'
    pipeline.vReleaseRepo = 'libs-release'

    pipeline.gitRepoUrl = 'https://github.com/tikalk/tikal-advanced-pipeline.git'
    pipeline.gitCredentialsId = '24a699e5-61d4-4d5c-a7ca-38d3f1e50866'

    pipeline.release = this.params.release
    pipeline.releaseVersion = this.params.releaseVersion
    pipeline.developmentVersion = this.params.developmentVersion

    pipeline.run()
}

return this