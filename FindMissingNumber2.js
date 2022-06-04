var prompt = require('prompt-sync')();
/* Get Length of Array */
let range = parseInt(prompt("Enter the range : "));

let fNum = parseInt(prompt("Enter the First Number of Sequence : "));
let lNum = parseInt(prompt("Enter the Last Number of Sequence: "));

/* Get the array values */
let arr = [];
for (let i = 0; i< range-1 ; i++){
let num = parseInt(prompt("Enter the numbers :"));

if(num >= fNum && num <= lNum){
arr.push(num);
}

else{
	 console.log("Please enter the numbers between first number and last number you given" ); 
	 break;
}

}

if(arr.length == range-1){
	
console.log("");  
console.log("Given sequence :" );  
console.log(arr);
console.log(""); 

missingNum = (arr)=> {
	
/* Sorting array using bubble sort */
for(let i = 0 ; i < arr.length ; i++){
	for(let j = 0 ; j <(arr.length-i-1); j++){
		if(arr[j] > arr[j+1]){
			let temp = arr[j]
			arr[j]=arr[j+1]
			arr[j+1] = temp

		}
	}
}

/* console.log(arr); */

let miss = [];
let result = false;

for(let x = fNum ; x <= lNum; x++){
	result= false;
		for(let y = 0 ; y < arr.length; y++){
			if(arr[y] == x){  
			result= true;
			break;
			}	
		}
	if(!result){
		miss.push(x);
	}
	
}

return miss;

}
console.log("Missing Number of given Sequence :" );
console.log( missingNum(arr));
}
