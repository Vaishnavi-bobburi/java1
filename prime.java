class prime
{
public static void main(String args[])
{
int i,count,j,n;

for(i=1;i<=99;i++)
{
count=0;
{
for(j=1;j<=i;j++)
{
if(i%j==0)
count++;
}
}
if (count==2)
System.out.println(i);
}
}
}