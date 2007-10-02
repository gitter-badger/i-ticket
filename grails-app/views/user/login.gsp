<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta name="layout" content="loadfoo" />
		<title>Login User</title>
	</head>
	<body>
		<g:if test="${flash.message}">
			<div id="message">${flash.message}</div>
		</g:if>
		<p>
			Welcome to Your Tickets. Login below or
			<g:link action="register">register here</g:link>
			.
		</p>
		<form action="handleLogin">
			<fieldset>
				<legend>Login</legend>
				<div>
					<label for="login">Login:</label>
					<input type="text" name="login" />
				</div>
				<div>
					<label for="password">Password:</label>
					<input type="password" name="password" />
				</div>
				<input class="submit" type="submit" value="Login" />
			</fieldset>
		</form>
	</body>
</html>
