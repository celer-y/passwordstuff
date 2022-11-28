
package com.mycompany.test1;


import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

public class Test1 {
     
      public static void main(String[] args) {
      CharacterRule alphabets = new CharacterRule(EnglishCharacterData.Alphabetical);
      CharacterRule digits = new CharacterRule(EnglishCharacterData.Digit);
      CharacterRule special = new CharacterRule(EnglishCharacterData.Special);

      PasswordGenerator passwordGenerator = new PasswordGenerator();
      String password = passwordGenerator.generatePassword(16, alphabets, digits, special);
      System.out.println(password);
   
   }
}


