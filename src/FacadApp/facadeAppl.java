/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadApp;

import Facade.studnetMaker;

/**
 *
 * @author aashgar
 */
public class facadeAppl {
    public static void main(String[] args) {
        studnetMaker aMaker = studnetMaker.getMaker();
        
        aMaker.viewITStudnet();
        aMaker.viewENGStudent();
    }
    
}
