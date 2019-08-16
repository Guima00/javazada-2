/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alomundo;

/**
 *
 * @author ice
 */
import java.util.Scanner;
public class Aula03 {
    public static void main(String[] args) {
        float vet1[],vet2[],vet3[];
        vet1=new float [2];
        vet2=new float [2];
        vet3=new float [3];
        Scanner teclado= new Scanner(System.in);
        vet1[0]=teclado.nextFloat();
        vet1[1]=teclado.nextFloat();
        vet2[0]=teclado.nextFloat();
        vet2[1]=teclado.nextFloat();
        vet3[0]=teclado.nextFloat();
        vet3[1]=teclado.nextFloat();
        float dis1,dis2,dis3;
        dis1=(float) Math.sqrt(Math.pow((vet1[0]-vet2[0]),2)+Math.pow((vet1[1]-vet2[1]),2));
        dis2=(float) Math.sqrt(Math.pow((vet2[0]-vet3[0]),2)+Math.pow((vet2[1]-vet3[1]),2));
        dis3=(float) Math.sqrt(Math.pow((vet1[0]-vet3[0]),2)+Math.pow((vet1[1]-vet3[1]),2));
        if(dis1==dis2 && dis2==dis3)
        {
            System.out.println("equilátero");
        }     
        else if((dis1==dis2 && dis1!=dis3 && dis3!=dis2) || (dis2==dis3 && dis1!=dis2 && dis1!=dis3) || (dis1==dis3 && dis1!=dis2 && dis2!=dis3) ){
            System.out.println("isósceles");
        }
            else if(dis1!=dis2 && dis2!=dis3 && dis1!=dis3){
                    System.out.println("escaleno");
                    }
        }
        
    }
    
}
