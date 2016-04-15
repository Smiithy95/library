package com.library

class Book {

String title

String author

String isbn

Date dateBorrowed

Date returnDate

Student student

String toString(){"$title, $author"}

    static constraints = {

title()

author()

isbn()

dateBorrowed()

returnDate()

student()

    }
}
