
/**Class Object......Practicle */
class Employee
{
     empid:number=1;
     empName:string="sheetal";
     empContect:String="7067576774";
     protected empsalary:number=1000.00
    
     Display():void
{
   console.log(`employee ID -> ${this.empid}\nemployee Name ->${this.empName}\nemployee COntect ->${this.empContect}`);
}
}
let e:Employee=new Employee();
//e.Display();

/**Constuctor....Example */

class Category
{
    Categoryid:number;                //data member....
    Categoryname:string;

     constructor(id1:number,name1:string)
     {
        this.Categoryid=id1;
        this.Categoryname=name1;
     } 
}

class Product
{
    productid:number;
    productName:string;
    productPrice:number;
    productStock:boolean;
    category?:Category;
    constructor(id:number,name:string,price:number,stock:boolean,c:Category)
    {
      this.productid=id;
      this.productName=name;
      this.productPrice=price;
      this.productStock=stock;
      this.category=c;

    }
    Display()
    {
        console.log(`Categoryid:${this.category?.Categoryid }and  categoryname:${this.category?.Categoryname}\n`);
        console.log( `product id: ${this.productid}\n product name:${this.productName}\nproduct Stock:${this.productStock}\n product name:${this.productPrice}`);
    }
}

let c:Category=new Category(10,"Electronics");
let prod:Product= new Product(1,"fan",2000,true,c);
prod.Display();
let prod1:Product= new Product(1,"fan",2000,true,c);
prod1.Display();


/** Inheritence.... */


