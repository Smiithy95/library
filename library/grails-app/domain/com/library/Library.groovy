package com.library

class Library {

 String location

 String openingHours

 Book book

 Student student

 Librarian librarian

 static hasMany=[librarians: Librarian, students: Student, books: Book]

 String toString(){"$location, $librarian, $openingHours"}

    static constraints = {

location()

openingHours()

book()

student()

librarian()
    }
}
