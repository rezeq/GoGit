/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author aashgar
 */
public class studnetMaker {
    private static studnetMaker aStMaker;
    private Studnet itStudent;
    private Studnet engStudent;
    private studnetMaker(){
    itStudent = new ITStudent();
    engStudent = new ENGStudent();
    }
    public static studnetMaker getMaker(){
        if(aStMaker == null)
            aStMaker = new studnetMaker();
        return aStMaker;
    }
    
    public void viewITStudnet(){
        itStudent.show();
    }
    
    public void viewENGStudent(){
        engStudent.show();
    }
    
}
