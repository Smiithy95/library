package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
        when: "A Student has name, studentId and email"
        def student = new Student(name: 'Will Smith',
                             studentId: 'b4025516',
                                 email: 'will@student.com')
        then: "the to String method will merge them. "
        student.toString()== 'Will Smith, b4025516, will@student.com'
    }
}
