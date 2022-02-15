/*
  Ödev
  N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li 
  kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

  Java ile kombinasyon hesaplayan program yazınız.

  Kombinasyon formülü:
    C(n,r) = n! / (r! * (n-r)!)
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n, r;
        int nFac = 1, rFac = 1, nrFac = 1;
        
        System.out.print("n: ");
        n = input.nextInt();
        
        System.out.print("r: ");
        r = input.nextInt();
        
        for(int i=1; i<=n; i++) {
            nFac *= i;
        }
        
        for(int i=1; i<=r; i++) {
            rFac *= i;
        }
        
        for(int i=1; i<=(n - r); i++) {
            nrFac *= i;
        }
        
        int comb = nFac / (rFac * nrFac);
        
        System.out.print("Combination: " + comb);
        
    }
}
