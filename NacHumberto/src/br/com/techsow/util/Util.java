package br.com.techsow.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

	
	static public boolean stringContainsNumber( String s )
	{
	    Pattern p = Pattern.compile( "[0-9]" );
	    Matcher m = p.matcher( s );

	    return m.find();
	}
	
}
