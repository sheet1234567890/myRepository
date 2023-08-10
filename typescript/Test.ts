
/**First Class Work And HomeWork........10 program c->typescript */

var abc:string="sheetal"
//console.log(abc);
function Demo()
{
    const url:string="sheetal.com";
    console.log(url);
    var marks:number=32;
    let rst :string="Pass";
   
    if(marks>=33){
    let rst:string="fail";
    console.log(rst+":->inner");
    }

    console.log(rst+":->outer");
}
//Demo();

function Demo2()
{
    enum Colours
    {
        Red=111,
        pink=222,
        blue=333,
        black=444
    }
    console.log(Colours.Red);
    console.log(Colours[111]);
}
//Demo2();
// 1.fectorial
function fect(n:number)
{
    var fact :number=1  ,i;
    for(i=1;i<=n;i++)
    {
        fact = fact*i;
    }
    return fact;
   // console.log(fact);
}
//fect();

//2.odd Even
function oddEven()
{
    var n:number=1;
    if(n%2==0)
    {
        console.log("no is even");
    }
    else
    {
        console.log("no is odd");
    }
}
//oddEven();

//3.prime

 function isPrime(n:number)
{
    var i:number=2,f=0;
    for(i=2;i<=n/2;i++)
    {
        if(n%i==0)
        {
            f=1;
           
             console.log("no is not prime  : "+n);
            break;
            
        }
       
    }
    if(f==0)
    {
       console.log("no is prime : "+n);
        
    }
}

function prime()
{
    var n:number=100,i;
    for(i=1;i<=n;i++)
    {
       isPrime(i);
    }
    
}
//prime();
//4. reverse number...

function reverse()
{
    var n :number=2345,s=0,r;
   while(n!=0)
   {
       r=Math.floor(n%10);
       s=s*10+r;
       n=Math.floor(n/10); 
    }
    console.log(s);
}
//reverse();

//5. palindrom..

function palindrom()
{
    let n:number=12281,t=n,s=0,r;
    while(n!=0)
    {
        r=Math.floor(n%10);
        s=s*10+r;
        n=Math.floor(n/10); 
     }
     if(s==t){
     console.log("number is palindrom : "+s);
     }
     else
     {
        console.log("number is not palindrom : "+t);
     }
    
}
//palindrom();

//6.Perfect number....

function Perfect()
{
    let n:number=61,t=n,s=0,i;
    for(i=1;i<=n/2;i++)
    {
        if(n%i==0)
        {
            s=s+i;
        }
    }
    if(s==t)
    {
        console.log("number is perfect :"+t)
    }
    else
    {
        console.log("number is not perfect :"+t);
    }

}
//Perfect();

//7.  Strong number....

function strong(n:number)
{
    let i:number,temp=n,r,sum=0;
    while(n!=0)
    {
        r=Math.floor(n%10);
        sum= sum+fect(r);
        n=Math.floor(n/10)
    }
    if(sum==temp)
    {
        console.log("number is strong : "+temp);
    }
    else
    {
        console.log("number is not strong : "+temp);
    }
}
//strong(145);

//8. Armstrong..
function count(n:number)
{
    let c:number=0;
    while(n!=0)
    {
        c++;
        n=Math.floor(n/10);
        
    }
    return c;
}


function takedigit(n:number)
{
    var r :number=0;
    while(n!=0)
    {
      r = Math.floor(n%10);
      n=Math.floor(n/10);
      return r;
    }
   
  
}


function Pow(digit:number,count:number)
{
    var n :number=1,i;
    for(i=1;i<=count;i++)
    {
        n=n*digit;
    }
    return n;
}
function isArmstrong(n:number)
{ 
    var digit:number ,sum=0,t=n,p;
    p=count(n);
    while(n!=0)
    {
        
       digit = takedigit(n);
       sum = sum+Pow(digit,p);
       n =Math.floor( n/10);
    }
    if(sum==t)
    {
        console.log("number is Armstrong : "+t);
    }
    else
    {
        console.log("number is not arm : "+t);
    }
}
isArmstrong(1530);

//9. sumofNumber

function  sumofNumber(n:number)
{
   var sum:number=0 ,r=0;
    while(n!=0)
    {
       r=Math.floor(n%10);
       sum=sum+r;
       n=Math.floor(n/10) 
    }
    console.log(sum);
}
//sumofNumber(123);

//10. swapping two no without using third variable...

function swap(n1:number,n2:number)
{
    console.log("n1:->"+n1+" n2:->"+n2);
    n1=n1+n2-(n2=n1);
    console.log("n1:->"+n1+" n2:->"+n2);
}
// swap(2,3);


/**Practise time... */

let empname:string="sheetal";
let empdep:string="it";
let output1:string=empname+"work in the" +empdep;
console.log(output1);
let output2 = `${empname}work in the ${empdep}`;
console.log(output2);