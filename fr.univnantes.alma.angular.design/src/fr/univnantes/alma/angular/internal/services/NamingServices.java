package fr.univnantes.alma.angular.internal.services;

import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;

public class NamingServices {
	public String toCamelCase(EObject eObject, String word) {
	    if (word != null) {
	        StringBuffer buffer = new StringBuffer(word.length());
	        for (String part : Splitter.on(CharMatcher.WHITESPACE).trimResults().split(word)) {
	            buffer.append(toU1Case(part));
	        }
	        return buffer.toString();
	    }
	    return word;
	}
	private String toU1Case(String word) {
	    if (word != null && word.length() > 0) {
	        return new StringBuilder(word.length()).append(Ascii.toUpperCase(word.charAt(0))).append(
	                word.substring(1)).toString();
	    }
	    return word;
	}	
}
