class Teleprompter{
	// Telepromter text
    // Given a string full of slang terms, return a clean string of no
	// slang with the slang text replaced by the dictionary which is a hash
	// of the slang word and replacement values
	def translate(text, dictionary)
	{
		
		for( row in dictionary)
		{
			def value = row[0]
			text = text.replaceAll("\\\$${value}\\\$", row[1])
		}
		return text
	}
}