/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inherintance;

/**
 *
 * @author moklet
 */
public class officeboy extends employez {
    
    public void print () {
        System.out.println(
                "Name           : "+name+"\n"
                +"JK             : "+JK+"\n"
                +"NIP            : "+nip+"\n"
                +"Marital Status : "+marry+"\n"
                +"Jobdesk        : "+jobdesk+"\n"
                +"Working Hours  : "+workingHours+"\n"
                +"Salary         : "+salary+"\n");
    }
    
    public void hitungGaji (){
        if (marry.equalsIgnoreCase("married")){
            bonus+=100000;
        } else {
            bonus+=0;
        }
        
        if (workingHours<8) {
            int hours = 8-workingHours;
            hours *= 50000;
            salarycuts += hours;
        } else {
            salarycuts+=0;
        }
    }
    
    public void gajiHitung () {
        salary+=bonus;
        salary-=salarycuts;
    }
    
}

