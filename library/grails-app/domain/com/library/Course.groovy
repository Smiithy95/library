package com.library

class Course {

String title

String tutor

String code

String department

String description

String toString(){"$title, $code, $department"}

    static constraints = {

title()

tutor()

code()

department()

description maxSize:100

    }
}
