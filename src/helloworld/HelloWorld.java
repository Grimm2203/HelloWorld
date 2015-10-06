package helloworld;

public class HelloWorld
{

    public static void main(String[] args)
    {
        //Initialization
        int age =13;

        //Output
      
        System.out.println("Hello World");
        System.out.println("What is your age?");
        
        //Go get users age

        //If-then example
        if (age >= 21)

        {
            //True Side
            System.out.println(age + "?" + " Okay to buy beer!");
        }

        //If-else example
        if (age >= 18)
        //True side
        {
            System.out.println(age + "?" + " Okay to vote!");
        } else
        //False side
        {
            System.out.println(age + "?" + " Go home...");
        }

        //Loop example
        while (age <= 21)
        {
            System.out.println(age);
            age++;
            
        }

    } //End of Main
} //End of Class

