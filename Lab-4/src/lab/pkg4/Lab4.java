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
import java.util.stream.IntStream;
public class Lab4 {
    public static void main(String[] args) {
        Residence r0 = new Residence("R0");
        Residence r1 = new Residence("R1");
        Residence r2 = new Residence("R2");
        Residence r3 = new Residence("R3");
        
        List<Residence> residentList = new ArrayList<>();
        residentList.add(r0);
        residentList.add(r1);
        residentList.add(r2);
        residentList.add(r3);
        Collections.sort(residentList);
        
        Hospital h0 = new Hospital("H0");
        Hospital h1 = new Hospital("H1");
        Hospital h2 = new Hospital("H2");

        
        Map<Residence, List<Hospital>> resPrefMap = new HashMap<>();
        List<Hospital> prefList = new ArrayList<>();

        prefList.add(h0);
        prefList.add(h1);
        prefList.add(h2);
        
        var r = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new Residence("R" + i))
                .toArray(Residence[]::new);

        resPrefMap.put(r[0], Arrays.asList(h0, h1, h2));
        resPrefMap.put(r[1], Arrays.asList(h0, h1, h2));
        resPrefMap.put(r[2], Arrays.asList(h0, h1));
        resPrefMap.put(r[3], Arrays.asList(h0, h2));
        System.out.println(resPrefMap);
    
}
