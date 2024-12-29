import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String conn=new String();

        System.out.println(
                "1. Sum of Digits\n" +
                        "2. Reverse a Number\n" +
                        "3. Armstrong Number\n" +
                        "4. Palindrome Number\n" +
                        "5. Greatest Common Divisor (GCD)\n" +
                        "6. Factorial\n" +
                        "7. Perfect Number\n" +
                        "8. Prime Number\n" +
                        "9. Find the nth Fibonacci Number\n" +
                        "10. Sum of First N Natural Numbers\n" +
                        "11. Sum of Squares of Digits\n" +
                        "12. LCM (Least Common Multiple)\n" +
                        "13. Divisors of a Number\n" +
                        "14. Sum of Digits Until Single Digit\n" +
                        "15. Check if a Number is Even or Odd\n" +
                        "16. Product of Digits\n" +
                        "17. HCF (Highest Common Factor) of Three Numbers\n" +
                        "18. Check if a Number is a Power of Two\n" +
                        "19. Sum of Digits at Odd and Even Positions\n" +
                        "20. Count the Number of Digits\n" +
                        "21. Sum of Prime Numbers in a Range\n" +
                        "22. Find the Nth Prime Number\n" +
                        "23. Find the Largest Prime Factor of a Number\n" +
                        "24. Check if a Number is Deficient, Perfect, or Abundant\n" +
                        "25. Power of a Number\n" +
                        "26. Number of Trailing Zeros in Factorial\n" +
                        "27. Find the Digital Root\n" +
                        "28. Calculate the Square Root of a Number\n" +
                        "29. Find the Number of Factors of a Number\n" +
                        "30. Check if a Number is a Strong Number"
        );
        System.out.println("Which operation do you want to perform");
        int opt=sc.nextByte();
        sc.nextLine();
        do {
            switch (opt) {
                case 1:
                    sum_of_digits sum=new sum_of_digits();
                    sum.sumofdijit();
                    break;
                case 2:
                    Reverse_a_number rev=new Reverse_a_number();
                    rev.reverse();
                    break;
                case 3:
                    Armstrong_number am=new Armstrong_number();
                    am.armstrong();
                    break;
                case 4:
                    Palindrome_number pal=new Palindrome_number();
                    pal.palindrome();
                    break;
                case 5:
                    GCD gcd=new GCD();
                    gcd.FindGCD();
                    break;
                case 6:
                    Factorial fact=new Factorial();
                    fact.factorial();
                    break;
                case 7:
                    Perfect_number pn=new Perfect_number();
                    pn.PerfectNo();
                    break;
                case 8:
                    Prime_no pr=new Prime_no();
                    pr.prime();
                    break;
                case 9:
                    nth_fibonacci fibo=new nth_fibonacci();
                    fibo.finbonacci();
                    break;
                case 10:
                    Sum_of_firstn_natural natur=new Sum_of_firstn_natural();
                    natur.sum_of_natural();
                    break;
                case 11:
                    Sum_of_square_of_digit squ=new Sum_of_square_of_digit();
                    squ.sumOfSquare();
                    break;
                case 12:
                    LCM lcm=new LCM();
                    lcm.lcm();
                    break;
                case 13:
                    Division_of_a_number div=new Division_of_a_number();
                    div.division();
                    break;
                case 14:
                    SumofDigitsUntilSingleDigit lastdig=new SumofDigitsUntilSingleDigit();
                    lastdig.sod();
                    break;
                case 15:
                    evenOrOdd odd=new evenOrOdd();
                    odd.oddEven();
                    break;
                case 16:
                    productOfDigit product = new productOfDigit();
                    product.product();
                    break;
                case 17:
                    HCF hcf=new HCF();
                    hcf.hcf();
                    break;
                case 18:
                    powerOfTwo pow=new powerOfTwo();
                    pow.powerOf2();
                    break;
                case 19:
                    oddAndEvenSum oddeve=new oddAndEvenSum();
                    oddeve.oddEvenSum();
                    break;
                case 20:
                    countNumberOfDigit cd=new countNumberOfDigit();
                    cd.countDigit();
                    break;
                case 21:
                    sumOfPrimeNumberInRange sumP=new sumOfPrimeNumberInRange();
                    sumP.primeNumberRange();
                    break;
                case 22:
                    nthPrime np=new nthPrime();
                    np.nthp();
                    System.out.println();
                    break;
                case 23:
                    LargestPrimeNumber lpm=new LargestPrimeNumber();
                    lpm.largestPrime();
                    break;
                case 24:
                    DeficientPerfectAbundant def=new DeficientPerfectAbundant();
                    def.defecient_perfect_ambudant();
                    break;
                case 25:
                    PowerofNumber po=new PowerofNumber();
                    po.power();
                    break;
                case 26:
                    Trailing tr=new Trailing();
                    tr.trailing();
                    break;
                case 27:
                    FindingDigitalRoot droot=new FindingDigitalRoot();
                    droot.digitalRoot();
                    break;
                case 28:
                    System.out.println("unknown");
                    break;
                case 29:
                    NumberOfFactors numfact=new NumberOfFactors();
                    numfact.numberOfFactors();
                    break;
                case 30:
                    StrongNumber strong_no=new StrongNumber();
                    strong_no.strongNumber();
                    break;
                default:
                    System.out.println("invalid");
            }
            System.out.println("perform another option  Y/N");
            conn=sc.nextLine();
        }while (conn.equalsIgnoreCase("y"));

    }

}