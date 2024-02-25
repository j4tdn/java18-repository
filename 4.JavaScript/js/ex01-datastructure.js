/*
 -Về cấu trúc dữ liệu  --> có 2 loại
    1 static type
    + vd: Java,C,C++
    Định nghĩa:
    + Khi khai báo 1 biến thì biến đó cần khai báo kiểu dữ liệu gì lúc compile
    + Giá trị cho phép của biến đó phụ thuộc vào ràng buộc của kiểu dữ liệu
     VD: int a --> a chỉ cho phép trong phạm vi của int(số nguyên,4 bytes) 
               --> Kho thể gán 1 chuỗi, giá trị k phải là 1 số nguyên cho a
    +Nếu trong đa hình đối tượng có hỗ trọ KDL cha, có thể lấy giá trị con gán vào
    nhưng bản chất t hì nó vẫn là KDL static type
    VD: Item extends BaseItem
    BaseItem b1 = new BaseItem();
    BaseItem b2 = new Item();

    Thuận lợi: Hỗ trợ bắt lỗi tại compile
    Hạn chế: được phép ép kiểu qua về trong phạm vi cha con

    2 dynamic type :(Loosly type)
    + vd: JavaScript
    +Khi khai báo 1 biến thì biến đó chưa cần khai báo kiểu dữ liệu gì lúc compile
    +KDL sẽ được xác định lúc runtime dựa vào giá trị đang gán cho biến hay là giá trị mà biến đang trỏ đến

    JS keywords: var/let/const --> được gọi là scope 
    let:block scope
    var:function scope
    const:block scope
          immutable --> catch error at runtime 

    VD: var a; -->chưa biết a là KDL gì và giá trị mặc định là undefined
    
    Gán a = 5 -->runtime a là KDL number

    Gán a = new Date() -->runtime a là KDL Date

    Thuận lợi: Tiện lúc compile dễ chuyển đổi qua về
    Hạn chế: Dẽ bị lỗi lúc runtime

    --> JS -->TypeScript
 -Kiểu dữ liệu trong JavaScript
    +Primitive Type
    +Object Type
    --> 100% cơ chế giống Java -->Stack,Heap
    Prototype,Protocol
*/
console.log("=== Ex01.JS DataStructure ===");
let v;
console.log('v1===>'+v + '===> '+ typeof(v))
v = 33747
console.log('v2===>'+v + '===> '+ typeof(v))
v = 'test'
console.log('v3===>'+v + '===> '+ typeof(v))  
v = null
console.log('v4===>'+v + '===> '+ typeof(v))  

v = new Date()
console.log('v5===>'+v + '===> '+ typeof(v))  



// undefined chưa khởi tạo ô nhớ, null đã khởi tạo ô nhớ nhưng nhận giá trị null


