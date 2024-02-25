//timer repeat every 2 seconds
// timeout: Just 1 time
let counter = 0;
setTimeout(function(){
    console.log('timeout --> '+counter++)   
},2000)
//interval: Forever
let runner = setInterval(function(){
    console.log('interval --> '+counter++)  
    if(counter===10){
        clearInterval(runner);
    } 
},2000)