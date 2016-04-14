package com.library

class Student {

String name

String email

String studentId

String course

String toString(){"$name, $studentId, $email"}

    static constraints = {

name()

email()

studentId()

course()

    }
}
