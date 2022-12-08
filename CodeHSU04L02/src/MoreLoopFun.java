public class MoreLoopFun {
    public static void main(String[] args) {
        /*
        for(initialization; boolean; update){
            what we want to do
        }
         */

        //a for loop that counts by ones from 1 to 5
        for(int start =1; start <= 5 ; start++){
            System.out.println(start);
        }

        //a for loop that prints the powers of two up to 100
        //can you have an infinite for loop?
        System.out.println("Powers of 2");
        for(int start = 1; start <= 100; start *= 2; ){
            System.out.println(start + " ");
        }

        //write a for loop that counts by 4s from 5 up to 50
        System.out.println("Counting by 4s");
        for(int i = 5; i <= 50; i += 4;){
            System.out.print(i + " ");
        }

        //write a for loop that sums the numbers from 1 to 10
        System.out.println("Counting the sum");
        int total = 0;
        for(int i = 1; i <= 10; i++;){
            total += 1;
        }
        System.out.println("The sum of integers 1 through 10 is: " + total);

        ////////////////////////////////////////////////////
        //for loops compared to while loops////////////////
        //////////////////////////////////////////////////
        String name = "Mr.Smith";
        for(int i = 0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
        String name = "Mr.Smith";
        int j = 0;
        while(j < name.length()){
            System.out.println(name.charAt(j));
        }
    }
}
