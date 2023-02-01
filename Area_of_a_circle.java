import java.io.*;
class area
{
    public static void main(String args[])throws Exception
    {
        int a;
        double pi=3.14,area;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(br.readLine());
        area=pi*a*a;
        System.out.format("%.2f",area);
    }
}