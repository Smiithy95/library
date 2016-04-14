package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
        when: "A Book has title and author"
        def book = new Book(title: 'Advanced PHP',
                           author: 'Gerry Form')
        then: "the to String method will merge them. "
        book.toString()== 'Advanced PHP, Gerry Form'
    }
}
