package com.ipd;

public class StringReverseUsingRecursion {
	
	    /* Function to print reverse of the passed string */
	    void reverse(String str)
	    {
	        if ((str==null)||(str.length() <= 1))
	           System.out.println(str);
	        else
	        {
	        	// length()-1 indicates last character, 0 indicates first character
	            System.out.print(str.charAt(str.length()-1));
	            reverse(str.substring(0,str.length()-1));
	        }
	    }
	     
	    public static void main(String[] args)
	    {
	        String str = "Geeks for Geeks";
	        StringReverseUsingRecursion obj = new StringReverseUsingRecursion();
	        obj.reverse(str);
	    }   
	
}
