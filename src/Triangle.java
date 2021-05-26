import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.EmptyStackException;
import java.util.Scanner;

public class Triangle {
    public void calculate(float a, float b,float c){
        try {
            if(a+b>c & a+c>b & b+c>a){
                System.out.println("Độ dài ba cạnh: "+a+"; "+b+"; "+c+" là độ dài của một tam giác");
            }else{
                throw new ArithmeticException();
            }
        }catch (Exception e){
            System.out.println("Độ dài ba canh không là độ dài của tam giác");
        }

    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập độ dài ba cạnh tam giác");
        System.out.println("Nhập độ dài cạnh thứ nhất");
        float a=scanner.nextFloat();
        System.out.println("Nhập độ dài cạnh thứ hai");
        float b= scanner.nextFloat();
        System.out.println("Nhập độ dài cạnh thứ ba");
        float c= scanner.nextFloat();
        Triangle triangle=new Triangle();
        triangle.calculate(a,b,c);
    }
}
