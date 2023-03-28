/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inherintance;

/**
 *
 * @author ay
 */
public class employez {

    int nip;
    String name;
    String JK;
    String marry;
    String jobdesk;
    double salary = 4000000;
    int workingHours;
    double bonus;
    double salarycuts = 50000*workingHours;
    
    public void setnip (int nip) {
        this.nip=nip;
    }
    
    public int getnip (){
        return nip;
    }
    
    public void setname (String name){
        this.name=name;
    }
    
    public String getname (){
        return name;
    }
    
    public void setjk (String JK){
        this.JK=JK;
    }
    
    public String getjk (){
        return JK;
    }
    
    public void setmarry (String marry){
        this.marry=marry;
    }
    
    public String marry (){
        return marry;
    }
    
    public void setjobdesk (String jobdesk){
        this.jobdesk=jobdesk;
    }
    
    public String getjobdesk (){
        return jobdesk;
    }
    
    public void setworkingHours (int workingHours){
        this.workingHours=workingHours;
    }
    
    public int getworkingHours (){
        return workingHours;
    }
}

