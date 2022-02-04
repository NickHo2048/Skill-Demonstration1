import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

class Math{
    public static int math(String function){
        function = function.toLowerCase();
        char[] contents = function.toCharArray();
        int position = 0;
        //iterates through passed string until a number is found
        while((contents[position]<48)||(contents[position]>57)){
            int x = contents[position];
            position++;
            if(position == contents.length - 1){
                throw new IndexOutOfBoundsException("Please enter a number");
            }
        }
        //creates the first number
        int first = contents[position] - 48;
        position++;
        while((contents[position]>=48)&&(contents[position]<=57)){
            first = first * 10 + contents[position] - 48;
            position++;
            if(position == contents.length - 1){
                throw new IndexOutOfBoundsException("Please enter two numbers");
            }
        }

        //iterates through passed string until second number is found
        while((contents[position]<48)||(contents[position]>57)){
            position++;
            if(position == contents.length - 1){
                throw new IndexOutOfBoundsException("Please enter two numbers");
            }
        }
        //creates the second number
        int second = contents[position] - 48;
        position++;
        while(position < contents.length && (contents[position]>=48) && (contents[position]<=57)){
            second = second * 10 + contents[position] - 48;
            position++;
        }

        if(function.contains("mult") || function.contains("*")){
            return first*second;
        }
        else if(function.contains("div") || function.contains("/")){
            return first/second;
        }
        else if(function.contains("sub") || function.contains("-")){
            return first-second;
        }
        else if(function.contains("add") || function.contains("+")){

            return first+second;
        }
        else throw new IllegalArgumentException("Please enter a calculation");
    }

    public static void main(String[] args) throws IOException{
        int answer = math(args[0]);
        System.out.println(answer);
    }

}
