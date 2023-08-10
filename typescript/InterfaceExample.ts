interface InterfaceExample
{
    iempid:number;
    iempname:string;

    greet();
}
class s implements InterfaceExample
{
    greet() {
       console.log("greet welcome");
    }
    iempid: number=10
    iempname: string="sheetal"

}

let q:InterfaceExample=new s();
q.greet();
console.log(`${q.iempid} ${q.iempname}`);