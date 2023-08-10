"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Student = void 0;
var Student = /** @class */ (function () {
    function Student(id, name, mob) {
        this.sId = id;
        this.sName = name;
        this.sMob = mob;
    }
    Student.prototype.setId = function (id) {
        this.sId = id;
    };
    Student.prototype.setName = function (name) {
        this.sName = name;
    };
    Student.prototype.setMob = function (mob) {
        this.sMob = mob;
    };
    Student.prototype.getId = function () {
        return this.sId;
    };
    Student.prototype.getName = function () {
        return this.sName;
    };
    Student.prototype.getMob = function () {
        return this.sMob;
    };
    return Student;
}());
exports.Student = Student;
