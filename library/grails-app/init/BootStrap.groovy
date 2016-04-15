import com.library.*

class BootStrap {

    def init = { servletContext ->

   def librarian1 = new Librarian( name: 'Andy',
                                  email: 'andy@library.com',
                               username: 'andy123',
                               password: 'kingandy1',
                              telephone: '0114 2778976').save()

   def librarian2 = new Librarian( name: 'Sarah',
                                  email: 'sarah@library.com',
                               username: 'sarah_30',
                               password: 'sarah101',
                              telephone: '0114 2732576').save()

   def librarian3 = new Librarian( name: 'Matt',
                                  email: 'matt@library.com',
                               username: 'matty21',
                               password: 'Matt01',
                              telephone: '0114 2932572').save()

   def course1 = new Course(      title: 'Computing',
                                  tutor: 'Stephen Lofthouse',
                                   code: 'Com123',
                             department: 'ACES',
                            description: 'Variety of modules to enhance your technical ability!').save()

   def course2 = new Course(      title: 'History',
                                  tutor: 'Tom Oxspring',
                                   code: 'His123',
                             department: 'Arts',
                            description: 'In-depth study of eras to enhance your historical knowledge!').save()

   def course3 = new Course(      title: 'Physics',
                                  tutor: 'Alex Swinden',
                                   code: 'Phy123',
                             department: 'Sciences',
                            description: 'Mind blowing practicals in top quality labs!').save()

   def student1 = new Student(     name: 'Will',
                                  email: 'will@student.com',
                              studentId: 'b4025516',
                                 course:  course3).save()

   def student2 = new Student(     name: 'Harry',
                                  email: 'Harry@student.com',
                              studentId: 'b4037745',
                                 course:  course1).save()

   def student3 = new Student(     name: 'James',
                                  email: 'james@student.com',
                              studentId: 'b4061532',
                                 course:  course2).save()

   def book1 = new Book(          title: 'Lord of The Flies',
                                 author: 'William Golding',
                                   isbn: '0-3234-3267-7',
                           dateBorrowed:  new Date('10/01/2016'),
                             returnDate:  new Date('17/01/2016'),
                                student: 'Will').save()

   def book2 = new Book(          title: 'Advanced PHP',
                                 author: 'Gerry Form',
                                   isbn: '0-5733-7934-5',
                           dateBorrowed:  new Date('02/12/2015'),
                             returnDate:  new Date('14/01/2016'),
                                student: 'James').save()

   def book3 = new Book(          title: 'Hogwarts: A History',
                                 author: 'Albus Dumbledore',
                                   isbn: '0-6398-2865-3',
                           dateBorrowed:  new Date('29/02/2016'),
                             returnDate:  new Date('06/03/2016'),
                                student: 'Harry').save()

   def library1 = new Library( location: 'Adsetts',
                           openingHours: '24/7',
                                   book:  book3,
                                student:  student3,
                              librarian:  librarian3).save()

   def library2 = new Library( location: 'Collegiate',
                           openingHours: '24/7',
                                   book:  book1,
                                student:  student1,
                              librarian:  librarian1).save()

   def library3 = new Library( location: 'Owen',
                           openingHours: '24/7',
                                   book:  book2,
                                student:  student2,
                              librarian:  librarian2).save()

                           library1.addToLibrarians(librarian3)
                           library2.addToLibrarians(librarian1)
                           library3.addToLibrarians(librarian2)

                           library1.addToStudents(student3)
                           library2.addToStudents(student1)
                           library3.addToStudents(student2)

                           library1.addToBooks(book3)
                           library2.addToBooks(book1)
                           library3.addToBooks(book2)

    }
    def destroy = {
    }
}
