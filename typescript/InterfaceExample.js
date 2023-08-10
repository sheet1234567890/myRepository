var s = /** @class */ (function () {
    function s() {
        this.iempid = 10;
        this.iempname = "sheetal";
    }
    s.prototype.greet = function () {
        console.log("greet welcome");
    };
    return s;
}());
var q = new s();
q.greet();
console.log("".concat(q.iempid, " ").concat(q.iempname));
