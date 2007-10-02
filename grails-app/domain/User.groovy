class User {
	String login
	String password
	String firstName
	String lastName
	String email
	Role role
	
	static hasMany = [projects:Project]
	static mappedBy = [projects:"owner"]
	
	static constraints = {
		login(unique:true, size:6..20)
		password(size:6..20, validator:{val, obj ->
			if(val?.equalsIgnoreCase(obj.login)) {
				return false
			}
		})
		firstName(maxLength: 50)
		lastName(maxLength: 50)
		email(email:true)
	}
}	
