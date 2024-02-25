/*
*** Về cấu trúc dữ liệu sẽ có 2 loại:

1. Static Data Type
VD: Java, C, C++
Định nghĩa: 
+ Khi khai báo 1 biến, biến đó cần khai báo KDL gì lúc compile
+ Giá trị cho phép của biến đó sẽ phụ thuộc vào ràng buộc của KDL
  VD: int a => a chỉ cho phép trong phạm vi của int (số nguyên, 4 bytes)
            => ko thể gán 1 chuỗi, giá trị không phải số nguyên cho a
+ Nếu trong đa hình trong đối tượng, có hỗ trợ biến KDL Cha, có thể lấy giá trị con gán vào
nhưng bản chất thì nó vẫn là KDL static type
  VD: Item extends BaseItem
      BaseItem bi = new BaseItem();
      BaseItem bi = new Item();

  Thuận lợi: hỗ trợ bắt lỗi tại compile
  Hạn chế: Được phép ép kiểu qua về trong phạm vi Cha - Con (Đa hình trong đối tượng) 

2. Dynamic Type - Losely Type
VD: JavaScript
+ Khi khai báo 1 biến, biến đó chưa cần khai báo KDL gì lúc compile
+ KDL sẽ được xác định lúc runtime dựa vào giá trị đang gán cho biến hay là giá trị mà biến đang trỏ đến
  
  JS keywords: var/let/const => variable scope
  let: block scope
  var: function scope
  const: block scope
         immutable --> catch error at runtime

  VD: var a; => chưa biết a là KDL gì, giá t  rị mặc định là undefined
  Gán a = 5; --> runtime a là KDL number
  Gán a = newDate(); --> runtime a là KDL Date

  Thuận lợi: tiện lúc compile dễ chuyển đổi qua về
  Hạn chế: Dễ bị lỗi lúc runtime

  --> JS --> TypeScript (để cải thiện điểm hạn chế của JS - biến nó thành Static Type)

*** Kiểu dữ liệu trong JavaScript
    + Primitive Type
    + Object Type 
    --> 100% cơ chế giống JAVA (về Heap, Stack,...)
*/

console.log("=== Ex01. JS Data Structure ===");

let v;

console.log('v1 --> ' + v + " --> " + (typeof v)); // C1 // typeof --> getClass
// console.log(`v1 --> ${v}`); --> C2 - string template

v = 123456;
console.log('v2 = 123456 --> ' + v + " --> " + (typeof v));

v = "text";
console.log('v3 = text --> ' + v + " --> " + (typeof v));

v = null;
console.log('v4 = null --> ' + v + " --> " + (typeof v));

v = new Date();
console.log('v5 = new Date() --> ' + v + " --> " + (typeof v));