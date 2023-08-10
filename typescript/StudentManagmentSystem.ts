export class Student 
{
   private sId:number;
   private sName:string;
   private sMob:string;

   constructor(id:number,name:string,mob:string)
   {
    this.sId=id;
    this.sName=name;
    this.sMob=mob;
   }

   public setId(id:number)
   {
     this.sId=id;
   }
public setName(name:string)
{
    this.sName=name;
}

public setMob (mob:string)
{
    this.sMob=mob;
}
   public  getId ():number
   {
    return this.sId;
   }

    public  getName ():string
   {
    return this.sName;
   }
   
   public  getMob ():string
   {
    return this.sMob;
   }

}
