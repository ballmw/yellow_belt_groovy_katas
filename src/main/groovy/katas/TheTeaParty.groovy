class TheTeaParty{
	
	def welcome(String last_name, boolean is_woman, boolean is_sir)
	{
		if(is_woman)
		  return "Hello Ms. $last_name";
		else if (is_sir)
		  return "Hello Sir $last_name";
		else return "Hello Mr. $last_name";
	}
}