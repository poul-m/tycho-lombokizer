# tycho-lombokizer
lombok patch for building eclipse plug-ins with maven tycho.

pm.lombokizer.test - demo plug-in with lombok annotations

0. clone repository<br>
   ```git clone https://github.com/poul-m/tycho-lombokizer.git```
1. Download patched lombok.jar (from [release](https://github.com/poul-m/tycho-lombokizer/releases) assets)
2. setup lombok.jar as javaagent for maven<br>
   ```export MAVEN_OPTS="-javaagent:<path to lombok.jar>"```
3. install parents<br>
   ```mvn install -f ./lombokizer-parent/pom.xml```<br>
   ```mvn install -f ./eclipse-artifacts-parent/pom.xml```
4. build all<br>
   ```mvn clean package```
