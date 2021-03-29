package grails.angular

import com.djamware.Customer
import com.djamware.Authority
import com.djamware.User
import com.djamware.UserAuthority

class BootStrap {

    def init = { servletContext ->
        new Customer(phone:"999999999", address:"R&iacute;o Alto", postalCode:"11111", name:"DiegoD&aacute; Canales", city:"Totana").save()
        new Customer(phone:"987654321", address:"R&iacute;o Bajo", postalCode:"55555", name:"Mar&iacute;a L&oacute;pez", city:"Pinto").save()
        def role1 = new Authority(authority:"ROLE_USER").save()
        def user1 = new User(username:"user1",password:"pwd1").save()
        // UserAuthority.create(user1,role1)
        new UserAuthority(user: user1, authority: role1).save()

    }
    def destroy = {
    }
}