var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var emp = /** @class */ (function () {
    function emp(id, name, contect) {
        this.empid = id;
        this.empName = name;
        this.empContect = contect;
    }
    emp.prototype.Display = function () {
        console.log("employee id:->".concat(this.empid, "\n employee name:->").concat(this.empName, "\n employee contect:->").concat(this.empContect));
    };
    return emp;
}());
var trainer = /** @class */ (function (_super) {
    __extends(trainer, _super);
    function trainer(id, sub, e) {
        var _this = _super.call(this, e.empid, e.empName, e.empContect) || this;
        _this.trinerid = id;
        _this.trainersubject = sub;
        return _this;
    }
    trainer.prototype.Display = function () {
        console.log("employee id:->".concat(this.empid, "\nemployee name:->").concat(this.empName, "\nemployee contect:->").concat(this.empContect));
        console.log("trainer id:->".concat(this.trinerid, "\ntrainer subject:->").concat(this.trainersubject));
    };
    return trainer;
}(emp));
var e1 = new emp(1, "sheetal", "7067576774");
var t1 = new trainer(1, "english", e1);
t1.Display();
var e2 = new emp(2, "surbhi", "7067576774");
var t2 = new trainer(2, "maths", e2);
t2.Display();
var e3 = new emp(3, "minakshi", "7067576774");
var t3 = new trainer(3, "physics", e3);
t3.Display();
var e4 = new emp(4, "ishwari", "7067576774");
var t4 = new trainer(4, "maths", e4);
t4.Display();
var e5 = new emp(5, "vandana", "7067576774");
e5.Display();
var e6 = new emp(6, "khushboo", "7067576774");
e6.Display();
var e7 = new emp(7, "shivi", "7067576774");
e7.Display();
var e8 = new emp(8, "krishna", "7067576774");
e8.Display();
var e9 = new emp(9, "aaditi", "7067576774");
e9.Display();
var e10 = new emp(10, "rupali", "7067576774");
e10.Display();
