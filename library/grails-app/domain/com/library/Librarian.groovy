package com.library

class Librarian {

String name

String email

String username

String password

String telephone


String toString(){"$name, $email, $telephone"}

static constraints = {

name()

email()

username()

password()

telephone()

}

}

