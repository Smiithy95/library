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

    }
    def destroy = {
    }
}
