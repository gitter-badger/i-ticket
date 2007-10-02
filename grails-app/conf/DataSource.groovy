dataSource {
	pooled = false
	driverClassName = "org.hsqldb.jdbcDriver"
	username = "sa"
	password = ""
}
// environment specific settings
environments {
	development {
		dataSource {
			dbCreate = "create-drop" // one of 'create', 'create-drop','update'
//			url = "jdbc:hsqldb:mem:testDb"
/*			driverClassName = "org.postgresql.Driver"
			url = "jdbc:postgresql:postgres"
			username = "ticket"
			password = "ticket"*/			
			driverClassName = "com.mysql.jdbc.Driver"
			url = "jdbc:mysql://localhost/ticket"
			username = "ticket"
			password = "ticket"
		}
	}
	test {
		dataSource {
			dbCreate = "update"
			url = "jdbc:hsqldb:mem:testDb"
		}
	}
	production {
		dataSource {
			dbCreate = "update"
			url = "jdbc:hsqldb:file:prodDb;shutdown=true"
		}
	}
}