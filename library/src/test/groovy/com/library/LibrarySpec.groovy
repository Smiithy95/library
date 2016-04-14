package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Library)
class LibrarySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
        when: "A Library has location, librarian and openingHours"
        def library = new Library(location: 'Adsetts',
                                 librarian: 'Andy',
                              openingHours: 'Mon - Fri')
        then: "the to String method will merge them. "
        library.toString()== 'Adsetts, Andy, Mon - Fri'
    }
}
