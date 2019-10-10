import java.util.*;
class hackerearth1{
    public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
     int t=Sc.nextInt(),len,i,c,r,flag=0;
     String s,s1="";int k=1;
        while(t-->0)
        {
            len=Sc.nextInt();
            s=Sc.nextLine();
            for(i=0;i<s.length();i++)
            {
                c=(int)(s.charAt(i));
                r=c;
                if(isprime(c)==0)
                {
                    s1=s1+(char)c;
                }
                else
                {
                    while(isprime(c-k)!=0)
                    {
                        if(isprime(c+k)==0)
                        {r=c+k;
                        flag=1;
                        break;
                        }
                        k++;
                    }
                    if(flag==0)
                        r=c-k;
                    s1=s1+(char)r;
                }
            }
            System.out.println(s1);
            
        }
    }
  public static int isprime(int c){
        int count=0;
        for(int i=1;i<=c;i++)
        {
            if(c%i==0)
                count++;
        }
        if(count==2)
            return 1;
        else
            return 0;
    }
}