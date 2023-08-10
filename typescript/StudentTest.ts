import { StuInterface } from "./StudentInterface"
import { StudentImpl } from "./StudentInterfaceImpl"
import { Student } from "./StudentManagmentSystem"
/**Student Add  */
 let   si:StudentImpl=new StudentImpl();

let  student:Student=si.addStudent(new Student(1,"surbhi","00000"));
let  student1:Student=si.addStudent(new Student(2,"sheetal","00000"));
let  student2:Student=si.addStudent(new Student(3,"ishh","00000"));

var a1:Array<Student> = [student,student1,student2];
//console.log(a1);
 /**Student View */
si.viewStudent(a1);
/**update Student.... */
//console.log(si.updateStudent(student));
//si.viewStudent(a1);
/**Delete Student.... */
a1.indexOf(student);
//si.deleteStudent(2,a1);
si.viewStudent(a1);



