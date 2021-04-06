 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.le.genie.exercicejava;

import java.util.Scanner;

/**
 *
 * @author ester maria
 */
public class Exercice1 {
    public static void main(String [] args)
    {
        int NmbrDeVal;
        int [][] t;
        System.out.println("Donner le nombre de valeur: ");
        Scanner sc = new Scanner (System.in);
        NmbrDeVal = sc.nextInt();
        t = new int[NmbrDeVal][2];
        for (int i= 0; i < NmbrDeVal; i++)
        {
            t[i][0] = 2 * i + 1;
            t[i][1] = t[i][0] * t[i][0];
        }
        for (int i =0; i<NmbrDeVal; i++)
        {
            System.out.println(t[i][0]+" à pour careé "+t[i][1]);
        }
    }
    
}
