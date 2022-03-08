/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08.pkg03;

/**
 *
 * @author züleyha
 */
public class Main {
    public static void function(int [] array){
        int toplam=0;
        for(int i=0; i<array.length-2; i++){
            int x= (int) (((int) (100* Math.pow((array[i+1]- (Math.pow(array[i], 2))),2))) + Math.pow(1-array[i],2));
            toplam =toplam+x;
            System.out.println(toplam);
         
        }
        System.out.println("genel toplam = " + toplam);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int [] array={2,5,-2,-4,3};
        function(array);
       
        
    }
    
}
