Array.prototype.add =function(index,element){
    this.splice(index,0,element);
}

let months = ['MAR','APR','MAY','JUNE'];

//add
months.unshift('FEB'); //===> unshift(item)= add(0,item)
//expect -->['FEB','MAR','APR','MAY','JUNE']

months.push('AUG'); //push(item)= add(length-1,item)
//expect -->['FEB','MAR','APR','MAY','JUNE','AUG];

//months.splice(5,0,'JUL'); //splice(index,deleteCount,items)
months.add(5,'JUL'); 
//delete count =0==>add
//deleteCount >0==remove
//splice(index,0,items)==>addAll(index,items)





// //remove
// months.shift(); //shift(item)= remove(0,item)
// months.pop(); //pop(item)= remove(length-1,item)
//replace
console.log(months);

//Inheritance && Composition
//prototype là 1 nguyên mẫu của cấu trúc dữ liệu bên trong js là 1 object ,mặc định bên trong prototype đã có 1 số function có sẵn