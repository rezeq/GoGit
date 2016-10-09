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
public class ITStudent implements State{

    @Override
    public void setState(Student std) {
        std.setState(this);
    }

    @Override
    public String toString() {
        return "IT Student..";
    }
    
}
