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

   def library1 = new Library( location: 'Adsetts',
                           openingHours: '24/7',
                                   book: 'Lord of The Flies',
                                student: 'Will',
                              librarian: 'Andy').save()

   def library2 = new Library( location: 'Collegiate',
                           openingHours: '24/7',
                                   book: 'Advanced PHP',
                                student: 'James',
                              librarian: 'Sarah').save()

   def library3 = new Library( location: 'Owen',
                           openingHours: '24/7',
                                   book: 'Hogwarts: A History',
                                student: 'Harry',
                              librarian: 'Andy').save()

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



    }
    def destroy = {
    }
}
