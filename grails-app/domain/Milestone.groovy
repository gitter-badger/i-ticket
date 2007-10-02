class Milestone extends ValueList { 
	Date due
	Date closed

	static constraints = {
		due(min:new Date())
		closed(min:new Date())
	}
}	
