import java.util.Scanner;

public class sieve {

    void sieve(int n){
        boolean prime[]=new boolean[n+1];

        for(int i=0;i<=n;i++)
            prime[i]=true;

        for(int p=2;p*p<=n;p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        for(int i=2;i<=n;i++){
            if(prime[i]==true)
                System.out.println(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("num: ");
        int n=sc.nextInt();
        sieve primes=new sieve();
        primes.sieve(n);
    }
}
