/**Class Object......Practicle */
var Employee = /** @class */ (function () {
    function Employee() {
        this.empid = 1;
        this.empName = "sheetal";
        this.empContect = "7067576774";
    }
    Employee.prototype.Display = function () {
        console.log("employee ID -> ".concat(this.empid, "\nemployee Name ->").concat(this.empName, "\nemployee COntect ->").concat(this.empContect));
    };
    return Employee;
}());
var e = new Employee();
//e.Display();
/**Constuctor....Example */
var Category = /** @class */ (function () {
    function Category(id1, name1) {
        this.Categoryid = id1;
        this.Categoryname = name1;
    }
    return Category;
}());
var Product = /** @class */ (function () {
    function Product(id, name, price, stock, c) {
        this.productid = id;
        this.productName = name;
        this.productPrice = price;
        this.productStock = stock;
        this.category = c;
    }
    Product.prototype.Display = function () {
        var _a, _b;
        console.log("Categoryid:".concat((_a = this.category) === null || _a === void 0 ? void 0 : _a.Categoryid, "and  categoryname:").concat((_b = this.category) === null || _b === void 0 ? void 0 : _b.Categoryname, "\n"));
        console.log("product id: ".concat(this.productid, "\n product name:").concat(this.productName, "\nproduct Stock:").concat(this.productStock, "\n product name:").concat(this.productPrice));
    };
    return Product;
}());
var c = new Category(10, "Electronics");
var prod = new Product(1, "fan", 2000, true, c);
prod.Display();
