package Sesion01;

import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n1,n2,sum,res,mul,div;
        
        System.out.print("Digite un numeros: ");
        n1 = entrada.nextFloat();
        System.out.print("Digite un numeros: ");
        n2 = entrada.nextFloat();
        
        sum=n1+n2;
        res=n1-n2;
        mul=n1*n2;
        div=n1/n2;
        
        System.out.println("la suma es: "+sum);
        System.out.println("la resta es: "+res);
        System.out.println("la multiplicacion es: "+mul);
        System.out.println("la division es: "+div);
        
        
        
        
       
    }
    
}
