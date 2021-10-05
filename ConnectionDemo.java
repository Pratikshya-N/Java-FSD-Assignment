package pratikshya.N;

class Connection
{
    int connId,customerId;
    String customerEmail;
    double balance;
    Connection(int connId,int customerId,String customerEmail,double balance)
    {
        this.connId=connId;
        this.customerId=customerId;
        this.customerEmail=customerEmail;
        this.balance=balance;
           
    }
}
public class ConnectionDemo {
    static double getAverageBalance(Connection arr[],int cid)
    {
        double sum=0,count=0;
        for(int i=0;i<3;i++)
        {
            if(arr[i].customerId==cid)
            {
                count++;
                sum+=arr[i].balance;
            }
        }
        return (sum/count);
    }
    
	public static void main(String[] args) {
		 Connection obj[]=new Connection[3];
         obj[0]=new Connection(1,101,"abc@gmail.com",1000.20);
         obj[1]=new Connection(2,101,"abcd@gmail.com",1050.20);
         obj[2]=new Connection(3,102,"abcde@gmail.com",1010.20);
         System.out.println("All the Customer details are created");
         System.out.println("Now We are printing the average balance of customers having cid as 101");
         System.out.println("The Average Balance is : "+getAverageBalance(obj,101));

	}

}
