<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta name="layout" content="loadfoo" />
		<title>Login User</title>
	</head>
	<body>
		<g:if test="${flash.message || user}">
			<div id="errors">
				${flash.message}
				<g:hasErrors bean="${user}">
					<g:renderErrors bean="${user}" as="list"/>
				</g:hasErrors>
			</div>
		</g:if>
		<p>Enter your details below to register for Your Ticket.</p>
		<form action="handleRegistration">
			<fieldset>
				<legend>Registration</legend>
				<div>
					<label for="login">Login:</label>
					<input type="text" name="login" value="${user?.login}" />
				</div>
				<div>
					<label for="password">Password:</label>
					<input type="password" name="password" />
				</div>
				<div>
					<label for="confirm">Confirm Password:</label>
					<input type="password" name="confirm" />
				</div>
				<div>
					<label for="firstName">First Name:</label>
					<input type="text" name="firstName" value="${user?.firstName}" />
				</div>
				<div>
					<label for="lastName">Last Name:</label>
					<input type="text" name="lastName" value="${user?.lastName}" />
				</div>
				<div>
					<label for="email">Email:</label>
					<input type="text" name="email" value="${user?.email}" />
				</div>
				<input class="submit" type="submit" value="Register" />
			</fieldset>
		</form>
	</body>
</html>
