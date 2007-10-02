class Comment extends ValueList {
	String comment
	User owner
	static hasMany = [replyes:Comment]
	
		static constraints = {
		comment(blank:false, maxLength:1000)
	}
}	
