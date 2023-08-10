
import {StuInterface} from "./StudentInterface"
import { Student } from "./StudentManagmentSystem";
export class StudentImpl implements StuInterface
{
    addStudent(student: Student): Student {
        
     
     return student;
     
    }
    viewStudent(s:Array<Student>) {

       console.log(s);
    }
    deleteStudent(stdid: number,s:Array<Student>) {
      s.forEach((element,index)=>
      {
           if(element.getId()==stdid)s.splice(index,1)
      });
    }
    updateStudent(student: Student): Student {
        student.setName("surbhi patidar");
        return student;
    }

}