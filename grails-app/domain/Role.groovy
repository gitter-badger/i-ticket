class Role extends ValueList {
	public static String ROLE_USER = 'USR' 
	
	static hasMany = [access:AccessControl]
}	
