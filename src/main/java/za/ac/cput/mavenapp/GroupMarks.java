/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.mavenapp;

/**
 *
 * Cameron Rose 220263159
 * 
 * Create a GroupMarks class
 */
public class GroupMarks {
    private String groupA ,groupB;
    
    public GroupMarks(){

}

    public String getGroupA() {
        return groupA;
    }

    public String getGroupB() {
        return groupB;
    }

    public void setGroupA(String groupA) {
        this.groupA = groupA;
    }

    public void setGroupB(String groupB) {
        this.groupB = groupB;
    }

    @Override
    public String toString() {
        return "Child{" + "age=" + groupA + ", grade=" + groupB + '}';
    }

}
    
