public class Diamond{
public static void main(String []args){
int i, j, k;
for(i=1;i<4;i++)
{
for(j=i;j<3;j++)
{
System.out.print(" ");
}
for(k=1;k<(i*2);k++)
{
System.out.print("*");
}
System.out.println();
}
for(i=2;i>=1;i--)
{
for(j=3;j>i;j--)
{
System.out.print(" ");
}
for(k=1;k<(i*2);k++)
{
System.out.print("*");
}
System.out.println();
}   
}
}
