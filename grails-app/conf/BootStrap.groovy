class BootStrap {

     def init = { servletContext ->
     	Role userRole = new Role(code:"USR", name:"User", description:"User role")
     	userRole.save()
     	Role adminRole = new Role(code:"ADM", name:"Administrator", description:"Administrator role")
     	adminRole.save()
     	
     	new User(firstName:"Maxim E.", lastName:"Matkin", login:"mmatkin", password:"password", email:"maxim@slovart.sk", role:userRole).save()
     	new User(firstName:"Administrator", lastName:"Administrator", login:"administrator", password:"password", email:"administrator@administrator.com", role:adminRole).save()
     	new User(firstName:"Michal", lastName:"Bocek", login:"mbocek", password:"password", email:"mbocek@ticket.com", role:adminRole).save()
     }
     def destroy = {
     }
} 