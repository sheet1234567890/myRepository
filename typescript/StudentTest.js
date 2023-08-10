"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var StudentInterfaceImpl_1 = require("./StudentInterfaceImpl");
var StudentManagmentSystem_1 = require("./StudentManagmentSystem");
/**Student Add  */
var si = new StudentInterfaceImpl_1.StudentImpl();
var student = si.addStudent(new StudentManagmentSystem_1.Student(1, "surbhi", "00000"));
var student1 = si.addStudent(new StudentManagmentSystem_1.Student(2, "sheetal", "00000"));
var student2 = si.addStudent(new StudentManagmentSystem_1.Student(3, "ishh", "00000"));
var a1 = [student, student1, student2];
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
