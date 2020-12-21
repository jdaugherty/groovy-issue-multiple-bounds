package org.example

import spock.lang.Specification

class FileUtilsSpec extends Specification {
    def "this will fail to compile"() {
        given:
	System.out.println("Test Me!")
        File file = File.createTempFile("please", "compile")

        and:
        FileReader reader = new FileReader(file)

        when:
        FileUtils.readAndWrite(reader)

        then:
        noExceptionThrown()
    }
}

