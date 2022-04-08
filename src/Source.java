package com.collection;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
class CompanyJobRepository {
    static String getJobPrediction(int age, String highestQualification) {
 
        try {
            if(age<19) {
                throw new NotEligibleException("You are underage for any job");
            }
 
            else if(age>=19 && age<21) {
                if(!highestQualification.equals("B.E") && !highestQualification.equals("M.S") && !highestQualification.equals("PhD")) {
                    throw new NotEligibleException("We do not have any job that matches your qualifications");
                }
                else {
                    return "Sorry we have no openings for now";
                }
            }
 
            else if(age>=21 && age<26) {
                if(highestQualification.equals("B.E")) {
                    return "We have openings for junior developer";
                }
                else {
                    return "Sorry we have no openings for now";
                }
            }
 
            else if(age>=26) {
                if(highestQualification.equals("M.S") ||highestQualification.equals("PhD")){
                    return "We have openings for senior developer";
                }
                else {
                    return "Sorry we have no openings for now";
                }
            }
 
            else {
                return "Sorry we have no openings for now";
            }
        } catch(Exception e) {
            return e.getMessage();
        }
 
    }
}
 
public class Source {
 
    public String searchForJob(int age, String highestQualification) {
        String ans;
        try {
            if(age<=0 || age>=200) {
                throw new NotEligibleException("The age entered is not typical for a human being");
            }
            else {
                    ans = CompanyJobRepository.getJobPrediction(age, highestQualification);
                    return ans;
                }
        } catch(NotEligibleException e) {
            return e.getMessage();
        }
    }
 
    public static void main(String args[] )  {

        Source s = new Source();
        System.out.println(s.searchForJob(26, "B.E"));

    }
}
class NotEligibleException extends Exception {
    public NotEligibleException(String e) {
        super(e);
    }
}