class Project { 
	String name
	String description
	
	User owner
	Date created = new Date()
	
	static belongsTo = User
	static hasMany = [tickets:Ticket, operators:User, severities:Severity, priorities:Priority, components:Component, types:Type, versions:Version, states:State]
	
	static constraints = {
		name(unique:true, maxLength:50)
		description(maxLength:512)
	}
}	
