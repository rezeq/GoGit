/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rezeq_Elewa;

/**
 *
 * @author Rezeq
 */
public class StateTest {
    public static void main(String[] args) {
        ITStudent it = new ITStudent();
        EngStudent eng = new EngStudent();
        
        Student s1 = new Student();
        Student s2 = new Student();
        
        it.setState(s1);
        eng.setState(s2);
        
        System.out.println(s1.getState());
        System.out.println(s2.getState());
    }
}
