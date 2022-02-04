import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

class Math{
    public static int math(String function){
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
        while((contents[position]>=48) && (contents[position]<=57 && position < contents.length)){
            second = second * 10 + contents[position] - 48;
            position++;
        }

        if(function.contains("Multiply")){
            return first*second;
        }
        else if(function.contains("Divide")){
            return first/second;
        }
        else if(function.contains("Subtract")){
            return first-second;
        }
        else if(function.contains("Add")){

            return first+second;
        }
        else throw new IllegalArgumentException("Please enter a calculation");
    }

    public static void main(String[] args) throws IOException{
        int answer = math(args[0]);
        System.out.println(answer);
    }

}
