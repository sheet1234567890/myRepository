"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.StudentImpl = void 0;
var StudentImpl = /** @class */ (function () {
    function StudentImpl() {
    }
    StudentImpl.prototype.addStudent = function (student) {
        return student;
    };
    StudentImpl.prototype.viewStudent = function (s) {
        console.log(s);
    };
    StudentImpl.prototype.deleteStudent = function (stdid, s) {
        s.forEach(function (element, index) {
            if (element.getId() == stdid)
                s.splice(index, 1);
        });
    };
    StudentImpl.prototype.updateStudent = function (student) {
        student.setName("surbhi patidar");
        return student;
    };
    return StudentImpl;
}());
exports.StudentImpl = StudentImpl;
