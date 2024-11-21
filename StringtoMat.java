import java.io.*;
import java.util.*;
class StringtoMat
{
   
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter string and keyorder");
        String msg=in.nextLine();
        int key=in.nextInt();
        int[][] result=StrtoMat(msg,key);
        for(int[] row:result)
        {
            for(int num:row)
            {
                System.out.print(num+" ");
            }
            System.out.println();
        }
        

    }
    private static int[][] StrtoMat(String mess,int k)
    {
        String ALPHABET="abcdefghijklmnopqrstuvwxyz";
        char c;
        int ch;
        int index=0;
        int filler=ALPHABET.indexOf('x');
        int col=(int)Math.ceil((double)mess.length()/k);
        int mat[][]=new int[k][col];
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<col;j++)
            { 
                if(index<mess.length())
                {
                    c=mess.charAt(index);
                    ch=ALPHABET.indexOf(c);
                    if(ch!=-1)
                    {
                        mat[i][j]=ch;
                    }
                    else{
                        mat[i][j]=filler;
                    }
                }
                else
                { 
                    mat[i][j]=filler;
                }
                index++;
            }
        }
        return mat;
    }
}