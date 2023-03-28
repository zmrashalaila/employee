/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inherintance;

/**
 *
 * @author moklet
 */
public class run {
    
    public static void main(String[] args) {
        babyboss boss = new babyboss();
        manager manage = new manager();
        officeboy ob = new officeboy();
        OJT ojt = new OJT();
        
        boss.setnip(777);
        boss.setname("Shim Jaeyun");
        boss.setjk("male");
        boss.setmarry("not married");
        boss.setjobdesk("presedir");
        boss.setworkingHours(9);
        boss.hitungGaji();
        boss.gajiHitung();
        boss.print();
        
        manage.setnip(141);
        manage.setname("Go Yonjung");
        manage.setjk("female");
        manage.setmarry("not married");
        manage.setjobdesk("general manager");
        manage.setworkingHours(8);
        manage.hitungGaji();
        manage.gajiHitung();
        manage.print();
        
        ob.setnip(233);
        ob.setname("Jay");
        ob.setjk("male");
        ob.setmarry("married");
        ob.setjobdesk("Office Boy");
        ob.setworkingHours(8);
        ob.hitungGaji();
        ob.gajiHitung();
        ob.print();
        
        ojt.setnip(100);
        ojt.setname("Shalaila W");
        ojt.setjk("female");
        ojt.setmarry("not married");
        ojt.setjobdesk("On the Job Training");
        ojt.setworkingHours(6);
        ojt.hitungGaji();
        ojt.gajiHitung();
        ojt.print();
    }
    
}

