/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarypasswordsearch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mgeiger
 */
public class BinaryPasswordSearch {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String[] passwords = new String[1000];
        if (args.length != 0)
        {
            ReadListOfPasswords(passwords);
            SortArray(passwords);
            BinarySearch(passwords, args[0]);
        }
        else
        {
            ReadListOfPasswords(passwords);
            SortArray(passwords);
            BinarySearch(passwords, "");
        }
    }//performs a binary search comparing the target string with the list string in a while loop until the file is done
    static public void BinarySearch(String[] passwords, String phrase){
        int low = 0;
        int high = passwords.length - 1;
        while(high >= low)
        {
            int middle = (low + high)/2; // Middle index
            if(passwords[middle].compareTo(phrase) == 0)
            {//The value was found
                System.out.println("The password "+ phrase + " is at position "
                + middle + " in the list");
                return;
            }//endif
            if(passwords[middle].compareTo(phrase) < 0){
                low = middle + 1;
            }//endif
            if(passwords[middle].compareTo(phrase) > 0){
                high = middle - 1;
            }//endif
        }//endwhile //The value was not found
        System.out.println("The password "+ phrase + " is not in the list");
    }//end method binarySearch
    //Reads the list of passwords into memory from the file specified, also handles all exceptions given by the program
    public static String[] ReadListOfPasswords(String[] passwords)
    {
        
        try(BufferedReader br = new BufferedReader(new FileReader("passwords.txt")))
        {
            String line = br.readLine();
            int i = 0;
            while (line != null)
            {
                passwords[i] = line;
                line = br.readLine();
                i++;
            }
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(ex);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex);
        } 
        catch (IOException ex)
        {
            System.out.println(ex);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        return passwords;
    }//sorts the array using a for loop and 
    public static String[] SortArray(String[] passwords)
    {
        int indexMin = 0; //the index of the smallest number
        for(int i = 0; i< passwords.length; i++){
            indexMin = i;
                for(int j = i + 1; j < passwords.length; j++){
                    if(passwords[j].compareTo(passwords[indexMin]) < 0 ){
                        indexMin = j; //set it as the min
                    }//endif
                }//endfor
                
            //we have the index of the smallest int and can swap the values
            String temp = passwords[i]; //use temp to store the value
            passwords[i] = passwords[indexMin];
            passwords[indexMin] = temp;
        }//endfor
        return passwords;
    }
    
}
