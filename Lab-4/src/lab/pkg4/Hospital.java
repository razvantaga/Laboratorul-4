/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4;

/**
 *
 * @author User
 */
import java.util.*;
public class Hospital {
    private String nume;
    private String adress;
    public Hospital(){
        this.nume=null;
    }
    public Hospital(String nume){
        this.nume=nume;
    }
    public String setNume(String nume){
        return nume;
    }
    public String toString(){
        return nume;
    }
}
