// Powered by Infostretch 

timestamps {

node () {

	stage ('Sky - Checkout') {
 	 checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'github', url: 'https://github.com/abdulgmohd/moon.git']]]) 
	}
	stage ('Sky - Build') {
 			// Shell build step
sh """ 
./gradlew test 
 """
		// TestNG Results
		step([$class: 'Publisher', escapeExceptionMsg: true, escapeTestDescp: true, failureOnFailedTestConfig: false, reportFilenamePattern: '**/testng-results.xml', showFailedBuilds: false, thresholdMode: 2, unstableSkips: 100, failedSkips: 100, unstableFails: 0, failedFails: 100]) 
	}
}
}