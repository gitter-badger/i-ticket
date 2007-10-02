class Ticket { 
	String shortDescription
	String description
	Date created = new Date()
	
	Severity severity
	Priority priority
	Component component
	Type type
	Version appVersion
	Project project
	
	User owner
	User assignee
	
	static hasMany = [ticketStates:TicketState, comments:Comment]
}	
