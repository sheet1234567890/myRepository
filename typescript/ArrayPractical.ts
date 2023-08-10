/**Array Practise........ */
function Demo()
{
    let course:string[]=['c','java','pythen','php'];
    console.log(course[0]);
    console.log(course);
}
//Demo();

/**Tuppel Practise...... */

function TuppleDemo()
{
    let dateOfBirth:[number,string,number]=[10,"july",2023];
    console.log(dateOfBirth);
    for(let item of dateOfBirth)
    console.log(item);
   
}
//TuppleDemo();

/**Create Object (Key and value)  */

function CreateObject()
{
    let emp={
        empId:101,
        emapName:"Sheetal Patidar",
        empSalary:180000,
        Courses:["java","c++","python","php","TypeScript"],
        ratings:{
            java:7,
            python:8,
            TypeScript:10,
            Angular:2
        }

    };
    console.log(emp.ratings.python);
    console.log(emp);
    let employees=[
        {
        empId:1,
        emapName:"Sheetal Patidar",
        empSalary:180000,
        Courses:["java","c++","python","php","TypeScript"],
        ratings:{
            java:7,
            python:8,
            TypeScript:10,
            Angular:2
        }

    },
    {
        empId:2,
        emapName:"Sheetal Patidar",
        empSalary:180000,
        Courses:["java","c++","python","php","TypeScript"],
        ratings:{
            java:7,
            python:8,
            TypeScript:10,
            Angular:2
        }

    },
    {
        empId:3,
        emapName:"Sheetal Patidar",
        empSalary:180000,
        Courses:["java","c++","python","php","TypeScript"],
        ratings:{
            java:7,
            python:8,
            TypeScript:10,
            Angular:2
        }

    },
    {
        empId:4,
        emapName:"Sheetal Patidar",
        empSalary:180000,
        Courses:["java","c++","python","php","TypeScript"],
        ratings:{
            java:7,
            python:8,
            TypeScript:10,
            Angular:2
        }

    }
];
console.log(employees);
for(let c of employees )
console.log(c);

}
CreateObject();

