# tycho-lombokizer
lombok patch for building eclipse plug-ins with maven tycho.

pm.lombokizer.test - demo plug-in with lombok annotations

0. clone repository
   git clone https://github.com/poul-m/tycho-lombokizer.git
1. Download patched lombok.jar
2. setup lombok.jar as javaagent for maven
   export MAVEN_OPTS="-javaagent:<path to lombok.jar>"
3. build all
   mvn clean package
