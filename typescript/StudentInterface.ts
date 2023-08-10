import {Student} from "./StudentManagmentSystem";
export interface StuInterface{
    addStudent(student:Student):Student;
    viewStudent(s:Array<Student>);
    deleteStudent(stdid:number,s:Array<Student>);
    updateStudent(student:Student):Student;
}