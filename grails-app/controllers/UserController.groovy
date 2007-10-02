class UserController {
	
	def defaultAction = 'login'
	
	def login = {
		if(session.user) {
			redirect(uri: '/')
		}
	}

	def logout = {
		if(session.user) {
			session.user = null
		}
		redirect(action: 'login')
	}

	def register = {
	}
	
	def handleLogin = {
		def user = User.findByLogin(params.login)
		if(user) {
			if(user.password == params.password) {
				session.user = user
				redirect(controller:'project', action:'list')
			} else {
				flash.message = "Incorrect password for ${params.login}"
				redirect(action:login)
			}
		} else {
			flash.message = "User not found for login ${params.login}"
			redirect(action:login)
		}
	}

	def handleRegistration = {
		def user = new User(params)
		user.role = Role.findByCode(Role.ROLE_USER)
		if(!user.validate()) {
			user.errors.each {
				println it
			}
		}
		
		if (params.password != params.confirm) {
			user.errors.reject("confirm", "The two passwords you entered don't match!")
			render(view:'register', model:[user:user])
		} else {
			if (user.save()) {
				redirect(uri:'/')
			} else {
				render(view:'register', model:[user:user])
			}
		}
	}
}
