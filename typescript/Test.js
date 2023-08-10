/**First Class Work And HomeWork........10 program c->typescript */
var abc = "sheetal";
//console.log(abc);
function Demo() {
    var url = "sheetal.com";
    console.log(url);
    var marks = 32;
    var rst = "Pass";
    if (marks >= 33) {
        var rst_1 = "fail";
        console.log(rst_1 + ":->inner");
    }
    console.log(rst + ":->outer");
}
//Demo();
function Demo2() {
    var Colours;
    (function (Colours) {
        Colours[Colours["Red"] = 111] = "Red";
        Colours[Colours["pink"] = 222] = "pink";
        Colours[Colours["blue"] = 333] = "blue";
        Colours[Colours["black"] = 444] = "black";
    })(Colours || (Colours = {}));
    console.log(Colours.Red);
    console.log(Colours[111]);
}
//Demo2();
// 1.fectorial
function fect(n) {
    var fact = 1, i;
    for (i = 1; i <= n; i++) {
        fact = fact * i;
    }
    return fact;
    // console.log(fact);
}
//fect();
//2.odd Even
function oddEven() {
    var n = 1;
    if (n % 2 == 0) {
        console.log("no is even");
    }
    else {
        console.log("no is odd");
    }
}
//oddEven();
//3.prime
function isPrime(n) {
    var i = 2, f = 0;
    for (i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
            f = 1;
            console.log("no is not prime  : " + n);
            break;
        }
    }
    if (f == 0) {
        console.log("no is prime : " + n);
    }
}
function prime() {
    var n = 100, i;
    for (i = 1; i <= n; i++) {
        isPrime(i);
    }
}
//prime();
//4. reverse number...
function reverse() {
    var n = 2345, s = 0, r;
    while (n != 0) {
        r = Math.floor(n % 10);
        s = s * 10 + r;
        n = Math.floor(n / 10);
    }
    console.log(s);
}
//reverse();
//5. palindrom..
function palindrom() {
    var n = 12281, t = n, s = 0, r;
    while (n != 0) {
        r = Math.floor(n % 10);
        s = s * 10 + r;
        n = Math.floor(n / 10);
    }
    if (s == t) {
        console.log("number is palindrom : " + s);
    }
    else {
        console.log("number is not palindrom : " + t);
    }
}
//palindrom();
//6.Perfect number....
function Perfect() {
    var n = 61, t = n, s = 0, i;
    for (i = 1; i <= n / 2; i++) {
        if (n % i == 0) {
            s = s + i;
        }
    }
    if (s == t) {
        console.log("number is perfect :" + t);
    }
    else {
        console.log("number is not perfect :" + t);
    }
}
//Perfect();
//7.  Strong number....
function strong(n) {
    var i, temp = n, r, sum = 0;
    while (n != 0) {
        r = Math.floor(n % 10);
        sum = sum + fect(r);
        n = Math.floor(n / 10);
    }
    if (sum == temp) {
        console.log("number is strong : " + temp);
    }
    else {
        console.log("number is not strong : " + temp);
    }
}
//strong(145);
//8. Armstrong..
function count(n) {
    var c = 0;
    while (n != 0) {
        c++;
        n = Math.floor(n / 10);
    }
    return c;
}
function takedigit(n) {
    var r = 0;
    while (n != 0) {
        r = Math.floor(n % 10);
        n = Math.floor(n / 10);
        return r;
    }
}
function Pow(digit, count) {
    var n = 1, i;
    for (i = 1; i <= count; i++) {
        n = n * digit;
    }
    return n;
}
function isArmstrong(n) {
    var digit = 0, sum = 0, t = n, p;
    p = count(n);
    while (n != 0) {
        digit = takedigit(n);
        sum = sum + Pow(digit, p);
        n = Math.floor(n / 10);
    }
    if (sum == t) {
        console.log("number is Armstrong : " + t);
    }
    else {
        console.log("number is not arm : " + t);
    }
}
isArmstrong(1530);
//9. sumofNumber
function sumofNumber(n) {
    var sum = 0, r = 0;
    while (n != 0) {
        r = Math.floor(n % 10);
        sum = sum + r;
        n = Math.floor(n / 10);
    }
    console.log(sum);
}
//sumofNumber(123);
//10. swapping two no without using third variable...
function swap(n1, n2) {
    console.log("n1:->" + n1 + " n2:->" + n2);
    n1 = n1 + n2 - (n2 = n1);
    console.log("n1:->" + n1 + " n2:->" + n2);
}
// swap(2,3);
/**Practise time... */
var empname = "sheetal";
var empdep = undefined;
empdep = null;
empdep = 123;
var output1 = empname + "work in the " + empdep;
console.log(output1);
var output2 = "".concat(empname, "work in the ").concat(empdep);
console.log(output2);
