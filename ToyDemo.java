package pratikshya.N;

class Toy
{
    String name;
    String Category;
    double price,discount;
     Toy(String name,String Category,double price,double discount)
     {
         this.name=name;
         this.Category=Category;
         this.price=price;
         this.discount=discount;
         discount=100-discount;
         price=(price*discount)/100;
         this.price=price;
     }
     
}
public class ToyDemo {
    static void display(Toy obj1,Toy obj2,Toy obj3,Toy obj4,String Cat)
    {
        if(obj1.Category==Cat ||obj2.Category==Cat||obj3.Category==Cat||obj4.Category==Cat)
        {
              if(Cat==obj1.Category && Cat==obj2.Category)
            {
                if(obj1.price> obj2.price)
                {
                    System.out.println("Least Price toy is "+obj2.name+" and price is: "+obj2.price);
                }
                else
                {
                    System.out.println("Least Price toy is "+obj1.name+" and price is: "+obj1.price);
                }
            }
            else
            {
                  if(obj3.price> obj4.price)
                {
                    System.out.println("Least Price toy is "+obj4.name+" and price is: "+obj4.price);
                }
                else
                {
                    System.out.println("Least Price toy is "+obj3.name+" and price is: "+obj3.price);
                }
            }
        }
        else
        {
            System.out.println("Category Not Found");
        }
    }
	public static void main(String[] args) {
		Toy obj1=new Toy("apple","fruits",40,2);
        Toy obj2=new Toy("banana","fruits",20,2);
        Toy obj3=new Toy("tiger","animal",100,5);
        Toy obj4=new Toy("lion","animal",120,3);
        
        System.out.println("Now Showing the Least price toy");
        display(obj1,obj2,obj3,obj4,"animal");
	}

}
