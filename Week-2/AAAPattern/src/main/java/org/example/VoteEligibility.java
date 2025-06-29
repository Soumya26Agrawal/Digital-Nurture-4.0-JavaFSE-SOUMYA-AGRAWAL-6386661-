package org.example;

public class VoteEligibility {

    public boolean isEligible(int age, String nationality){
        if(age>=18 && nationality.equalsIgnoreCase("Indian"))  return true;
        return false;
    }
}
