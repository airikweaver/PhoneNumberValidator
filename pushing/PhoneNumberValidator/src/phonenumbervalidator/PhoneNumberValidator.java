/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonenumbervalidator;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author aweaver
 */
public class PhoneNumberValidator {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    ArrayList<String> phoneNumbers = new ArrayList<String>();//creates array list
    phoneNumbers.add("(419)123-4567");//assigns all phone numbers into array list
    phoneNumbers.add("(419) 123-4567");
    phoneNumbers.add("419-123-4567");
    phoneNumbers.add("419.123.4567");
    phoneNumbers.add("419_123_4567");
    phoneNumbers.add("(419)123-456");
    phoneNumbers.add("4191234567");
    phoneNumbers.add("419123456");

    Pattern p = Pattern.compile("[(]?([0-9]{3})[)]?[-| |.|]?([0-9]{3})[-| |.|]([0-9]{4})");//creates pattern for array
    Matcher m;//creates matcher for pattern
    for (int i = 0; i < 8; i++)
    {
        m = p.matcher(phoneNumbers.get(i));//tries to match with pattern in for loop
        if (m.matches())
        {
            System.out.println(phoneNumbers.get(i) + " Changed to - " + "(" + m.group(1) + ") " + m.group(2) + "-" + m.group(3));
        }
        else
        {
            System.out.println(phoneNumbers.get(i) + " Not Accepted");
        }
    }
    }
}
