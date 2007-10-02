class ValueList { 
	String code
	String name
	String description
	
	static constraints = {
		code(blank: false, maxLength: 5)
		name(blank: false, maxLength: 20)
		description(maxLength: 200)
	}
}	
