package kalc;

public class Solution
{
    public static  int min(int a, int b)
    {int x = 0;
        
        if (a>b){
        	x=b;
                
            }if (a<b){ 
            	x=a;
        }
        return x;
        
        
        //Напишите тут ваш код

    }

    public static void main(String[] args) throws Exception
    {
        if (min(5, 8) != 5)
        {
            System.out.println("1) Неправильно для a"); //вывод=5
        }
        if (min(-2, -5) != -5)
        {
            System.out.println("2) Неправильно для отрицательных чисел"); //вывод=-5
        }
        if (min(10, 5) != 5)
        {
            System.out.println("3) Неправильно для b"); //вывод=5
        }
        if (min(5, 5) != 5)
        {
            System.out.println("4) Неправильно для всех равных чисел"); //вывод=5
        }
    }

}