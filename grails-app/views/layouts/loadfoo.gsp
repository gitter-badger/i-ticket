<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
	<head>
		<title>
			<g:layoutTitle default="Grails" />
		</title>
		<link rel="stylesheet" href="${createLinkTo(dir:'css/LoadFoO',file:'style.css')}"></link>
		<g:layoutHead />
		<g:javascript library="application" />
	</head>
	<body>
		<div id="wrap">
			<!--	TOP MENU START	-->
			<div id="top">
				<h2>
					<a href="#" title="Back to main page">Ticket</a>
				</h2>

				<!--	TOP MENU ITEMS START	-->
				<div id="menu">
					<ul>
						<li>
							<a href="#" class="current">home</a>
						</li>
						<li>
							<a href="#">about</a>
						</li>
						<li>
							<a href="#">portofolio</a>
						</li>
						<li>
							<a href="#">contact</a>
						</li>
					</ul>
				</div>
				<!--	TOP MENU ITEMS END	-->
			</div>
			<!--	TOP MENU END	-->

			<!--	MAIN CONTENT AREA START	-->
			<div id="content">
				<!--	LEFT SIDE - ALL CONTENT GOES HERE - START	-->
				<div id="left">
					<g:layoutBody />
				</div>
				<!--	LEFT SIDE - ALL CONTENT GOES HERE - END	-->

				<div id="right">
					<ul id="nav">
						<g:if test="${!session?.user}">
							<li>
								<g:link controller="user" action="login">Login</g:link>
							</li>
						</g:if>
						<g:if test="${session?.user}">
						<li>
							<g:link controller="user" action="logout">Logout</g:link>
						</li>
						</g:if>
						<g:if test="${!session?.user}">
							<li>
								<g:link controller="user" action="register">Register</g:link>
							</li>
						</g:if>
					</ul>
				</div>

				<div id="clear"></div>
			</div>

			<!--	FOOTER START	-->
			<div id="footer">
				<p>
					Copyright 2006 LoadFoO [V1]. Designed by
					<a href="http://loadfoo.org/" rel="external">LoadFoO</a>
					. Valid
					<a href="http://jigsaw.w3.org/css-validator/check/referer" rel="external">CSS</a>
					&amp;
					<a href="http://validator.w3.org/check?uri=referer" rel="external">XHTML</a>
				</p>
			</div>
			<!--	FOOTER END	-->
		</div>
	</body>
</html>