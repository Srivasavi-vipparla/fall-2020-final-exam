/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

/**
 *
 * @author Sri vasavi Vipparla
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fruit fruit = new GoldenDelicious();
        Orange orange = new Orange();
        if(fruit instanceof Fruit){ 
            System.out.println("true");
        }else{
            System.out.println("false");
        }
         if(fruit instanceof Orange){ 
            System.out.println("true");
        }else{
            System.out.println("false");
        }
       
          if(fruit instanceof Apple){ 
            System.out.println("true");
        }else{
            System.out.println("false");
        }
       
           if(fruit instanceof GoldenDelicious){ 
            System.out.println("true");
        }else{
            System.out.println("false");
        }
       
            if(fruit instanceof McIntosh){ 
            System.out.println("true");
        }else{
            System.out.println("false");
        }
       
             if(orange instanceof Orange){ 
            System.out.println("true");
        }else{
            System.out.println("false");
        }
       
              if(orange instanceof Fruit){ 
            System.out.println("true");
        }else{
            System.out.println("false");
        }
       
//               if(orange instanceof Apple){ 
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
       ((GoldenDelicious)fruit).makeAppleCider();
       //orange.makeAppleCider();
       //Orange p=new Apple();
      Apple p=new McIntosh();
     //  McIntosh p=(McIntosh)new Apple();
        orange.makeOrangeJuice();
        //fruit.makeOrangeJuice();
    }
}
