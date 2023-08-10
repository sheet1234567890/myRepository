class emp
{
    empid:number;
     empName:string;
     empContect:string;

     constructor(id:number,name:string,contect:string)
     {
        this.empid=id;
        this.empName=name;
        this.empContect=contect;
     }

     Display():void
     {
      console.log(`employee id:->${this.empid}\n employee name:->${this.empName}\n employee contect:->${this.empContect}`);
     }

}


class trainer extends emp
{
    trinerid:number;
    trainersubject:string;
   constructor(id:number,sub:string,e:emp)
   {
      super(e.empid,e.empName,e.empContect);
      this.trinerid=id;
      this.trainersubject=sub;
   }
   Display()
   {
    console.log(`employee id:->${this.empid}\nemployee name:->${this.empName}\nemployee contect:->${this.empContect}`);
    console.log(`trainer id:->${this.trinerid}\ntrainer subject:->${this.trainersubject}`);
   }
}

let e1:emp=new emp(1,"sheetal","7067576774");
let t1:trainer=new trainer(1,"english",e1);
t1.Display();
let e2:emp=new emp(2,"surbhi","7067576774");
let t2:trainer=new trainer(2,"maths",e2);
t2.Display();
let e3:emp=new emp(3,"minakshi","7067576774");
let t3:trainer=new trainer(3,"physics",e3);
t3.Display();
let e4:emp=new emp(4,"ishwari","7067576774");
let t4:trainer=new trainer(4,"maths",e4);
t4.Display();
let e5:emp=new emp(5,"vandana","7067576774");
e5.Display();
let e6:emp=new emp(6,"khushboo","7067576774");
e6.Display();
let e7:emp=new emp(7,"shivi","7067576774");
e7.Display();
let e8:emp=new emp(8,"krishna","7067576774");
e8.Display();
let e9:emp=new emp(9,"aaditi","7067576774");
e9.Display();
let e10:emp=new emp(10,"rupali","7067576774");
e10.Display();




