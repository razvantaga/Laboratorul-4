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
public class Residence {
    private String name;
    public Residence(){
        this.name=null;
    }
    public Residence(String name){
        this.name=name;
    }
    public String setName(String name){
        return name;
    }
    public String toString(){
        return name;
    }
}
