package com.library

class Library {

 String location

 String openingHours

 String book

 String student

 String librarian

 String toString(){"$location, $librarian, $openingHours"}

    static constraints = {

location()

openingHours()

book()

student()

librarian()
    }
}
