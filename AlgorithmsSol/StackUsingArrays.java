package AlgorithmsSol;
/*

Monk's Love for Food

Our monk loves food. Hence,he took up position of a manager at Sagar,a restaurant that serves people with delicious food packages. It is a very famous place and people are always queuing up to have one of those packages. Each package has a cost associated with it. The packages are kept as a pile. The job of a manager is very difficult. He needs to handle two types of queries:

1) Customer Query:
When a customer demands a package, the food package on the top of the pile is given and the customer is charged according to the cost of the package. This reduces the height of the pile by 1.
In case the pile is empty, the customer goes away empty-handed.

2) Chef Query:
The chef prepares a food package and adds it on top of the pile. And reports the cost of the package to the Manager.
Help him manage the process.

Input:
First line contains an integer Q, the number of queries. Q lines follow.
A Type-1 ( Customer) Query, is indicated by a single integer 1 in the line.
A Type-2 ( Chef) Query, is indicated by two space separated integers 2 and C (cost of the package prepared) .

Output:
For each Type-1 Query, output the price that customer has to pay i.e. cost of the package given to the customer in a new line. If the pile is empty, print "No Food" (without the quotes).

Constraints:
1 = Q = 105
1 = C = 107


*/
import java.util.Scanner;
class StackUsingArrays {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []array = new int[n];
        int top = -1;
        for(int i = 0;i<n;i++){
            int q = scanner.nextInt();
            int cost = 0;
            if(q==2){
                cost = scanner.nextInt();
            }
            if(q==1){
                if(top==-1)
                    System.out.println("No Food");
                else{
                    System.out.println(array[top--]);
                }
            }else if(q==2){
                array[++top] = cost; 
            }
        }
    }
}
