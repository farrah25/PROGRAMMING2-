public class CubeAndSquare{
public static void main(String[] args)
{
//#include<stdio.h>

    
{
    int x = 0;
    int sqr =0;
    int cube =0;
    
    /* Print column names */
    System.out.printf("Number\tSquare\tCube\n");
    System.out.printf("=========================\n");

    for(int i=0; i<=10; i++)
    {
        sqr = x*x;
        cube = x*x*x;
        System.out.printf("%5d%5d%5d\n", x, x*x, x*x*x);
        x++;}
    
}
}
}