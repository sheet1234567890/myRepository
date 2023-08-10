/**Array Practise........ */
function Demo() {
    var course = ['c', 'java', 'pythen', 'php'];
    console.log(course[0]);
    console.log(course);
}
//Demo();
/**Tuppel Practise...... */
function TuppleDemo() {
    var dateOfBirth = [10, "july", 2023];
    console.log(dateOfBirth);
    for (var _i = 0, dateOfBirth_1 = dateOfBirth; _i < dateOfBirth_1.length; _i++) {
        var item = dateOfBirth_1[_i];
        console.log(item);
    }
}
//TuppleDemo();
/**Create Object (Key and value)  */
function CreateObject() {
    var emp = {
        empId: 101,
        emapName: "Sheetal Patidar",
        empSalary: 180000,
        Courses: ["java", "c++", "python", "php", "TypeScript"],
        ratings: {
            java: 7,
            python: 8,
            TypeScript: 10,
            Angular: 2
        }
    };
    console.log(emp.ratings.python);
    console.log(emp);
    var employees = [
        {
            empId: 1,
            emapName: "Sheetal Patidar",
            empSalary: 180000,
            Courses: ["java", "c++", "python", "php", "TypeScript"],
            ratings: {
                java: 7,
                python: 8,
                TypeScript: 10,
                Angular: 2
            }
        },
        {
            empId: 2,
            emapName: "Sheetal Patidar",
            empSalary: 180000,
            Courses: ["java", "c++", "python", "php", "TypeScript"],
            ratings: {
                java: 7,
                python: 8,
                TypeScript: 10,
                Angular: 2
            }
        },
        {
            empId: 3,
            emapName: "Sheetal Patidar",
            empSalary: 180000,
            Courses: ["java", "c++", "python", "php", "TypeScript"],
            ratings: {
                java: 7,
                python: 8,
                TypeScript: 10,
                Angular: 2
            }
        },
        {
            empId: 4,
            emapName: "Sheetal Patidar",
            empSalary: 180000,
            Courses: ["java", "c++", "python", "php", "TypeScript"],
            ratings: {
                java: 7,
                python: 8,
                TypeScript: 10,
                Angular: 2
            }
        }
    ];
    console.log(employees);
    for (var _i = 0, employees_1 = employees; _i < employees_1.length; _i++) {
        var c = employees_1[_i];
        console.log(c);
    }
}
CreateObject();
