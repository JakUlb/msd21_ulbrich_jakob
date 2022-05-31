#Exercise 6 - Documentation

## What is necessary to generate maven site documentation?
To generate maven site documentation the following block has to be added to pom.xml
Should you get the error "plugin not found" try to add a group id similar to the ones in the example below, change the version numbers, and execute Lifecycle/site
```
<reporting>
        <plugins>
            <!--  maven site for documentation  -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-project-info-reports-plugin</artifactId>
                <version>3.0.0</version>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-site-plugin</artifactId>
                <version>3.7.1</version>
            </plugin>
            <!--  Java Doc within Maven Site Documentation -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-javadoc-plugin</artifactId>
                <version>3.2.0</version>
                <configuration>
                    <doclint>-html,-syntax,-accessibility,-missing</doclint>
                    <failOnError>false</failOnError>
                    <quiet>true</quiet>
                </configuration>
            </plugin>
            <!--  Test Coverage from JaCoCo Plugin integration in Maven Site Documentation  -->
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <configuration>
                    <dataFile>${jacoco.execution.data.file}</dataFile>
                </configuration>
                <reportSets>
                    <reportSet>
                        <reports>
                            <report>report</report>
                        </reports>
                    </reportSet>
                </reportSets>
            </plugin>
        </plugins>
    </reporting>
```


