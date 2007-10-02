class Version extends ValueList {
	Date due
	Date closed
	
	static hasMany = [milestones:Milestone]
	
	static constraints = {
		due(min:new Date())
		closed(min:new Date())
	}
}	
