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
        
        
        //�������� ��� ��� ���

    }

    public static void main(String[] args) throws Exception
    {
        if (min(5, 8) != 5)
        {
            System.out.println("1) ����������� ��� a"); //�����=5
        }
        if (min(-2, -5) != -5)
        {
            System.out.println("2) ����������� ��� ������������� �����"); //�����=-5
        }
        if (min(10, 5) != 5)
        {
            System.out.println("3) ����������� ��� b"); //�����=5
        }
        if (min(5, 5) != 5)
        {
            System.out.println("4) ����������� ��� ���� ������ �����"); //�����=5
        }
    }

}