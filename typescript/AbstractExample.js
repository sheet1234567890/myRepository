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
var AbstractExample = /** @class */ (function () {
    function AbstractExample(id, name, sal) {
        this.empid = 1;
        this.empName = "sheetal";
        this.empsalary = 1000.00;
        this.empid = id;
        this.empName = name;
        this.empsalary = sal;
    }
    return AbstractExample;
}());
var Trainer = /** @class */ (function (_super) {
    __extends(Trainer, _super);
    function Trainer() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Trainer.prototype.callSalary = function (hrs) {
        var totalsalary = this.empsalary + (hrs * 200);
        console.log(totalsalary);
    };
    Trainer.prototype.Greet = function () {
        return "hey welcome " + this.empName;
    };
    return Trainer;
}(AbstractExample));
var t = new Trainer(101, "sheetal", 1000);
//console.log(t.Greet());
//t.callSalary(5);
var Sheet = /** @class */ (function (_super) {
    __extends(Sheet, _super);
    function Sheet() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Sheet.prototype.callSalary = function (hrs) {
        console.log("sheetal" + hrs);
    };
    Sheet.prototype.Greet = function (name) {
        return "sheetal";
    };
    return Sheet;
}(AbstractExample));
var b = new Sheet(101, "sheetal", 2000);
console.log(b.Greet("sheetal"));
b.callSalary(3);
