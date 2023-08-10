abstract class AbstractExample
{
     empid:number=1;
     empName:string="sheetal";
     protected empsalary:number=1000.00

     constructor(id:number,name:string,sal:number)
     {
        this.empid= id;
        this.empName=name;
        this.empsalary=sal;
     }
     abstract callSalary(hrs:number);
     abstract Greet(name:string):string;
    
}

class Trainer extends AbstractExample
{
    callSalary(hrs: number) {
       var totalsalary:number=this.empsalary+(hrs*200)
       console.log(totalsalary);
    }
    Greet() :string{

        return "hey welcome "+this.empName;
    }
    
}

let t:Trainer = new Trainer (101,"sheetal",1000);
//console.log(t.Greet());
//t.callSalary(5);

class Sheet extends AbstractExample
{
    callSalary(hrs: number) {
        console.log("sheetal"+hrs);
    }
    Greet(name: string): string {
      return "sheetal";
    }
     
}
let b : Sheet = new Sheet(101,"sheetal",2000);
console.log(b.Greet("sheetal"))
b.callSalary(3);