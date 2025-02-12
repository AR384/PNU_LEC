//배열 선언 
let arr = []; 
let arr1 = [1,2,3,4];

let arr2 = new Array();

console.log(arr);
console.log(arr1);
//배열 추가
arr.push(10);
console.log(arr);

//배열 수정
arr[0] = 1;
console.log(arr);
//배열 삭제제
arr.pop();
console.log(arr);
//배열 순회
arr = [1,2,3,4,5];
for (let i = 0; i < arr.length; i++) {
    console.log(arr[i]);
}
console.log("forIn");
for (let i in arr) {
    console.log(arr[i]);    
}
console.log("forOf");
for (let i of arr) {
    console.log(i);
}
console.log("forEach");
for (let i of arr.entries()) {
    console.log(i);
}

for (let [i, item] of arr.entries()) {
    console.log(i,item);
}

console.log("forEach");
arr.forEach((item, i) => {
    console.log(i,item);
});

console.log("map1 ");
arr2 = arr.map(i => i*2);
console.log(arr2);

console.log("map2");
arr2 = arr.map((item,i) => i*2);
console.log(arr2);


console.log("map4");
arr2 = arr.map((item,i) =>i*5);
console.log(arr2);

console.log("map 3");
arr2 = arr.map((item) => {return item*2});
console.log(arr2);

console.log("filter");
arr2 =  arr.filter(i => i%2 ==0);
console.log(arr2);

console.log("filter2");
arr2 =  arr.filter((item,i,) => i%1==0);
console.log(arr2);

console.log("sort a-b");
arr2 =  arr.sort((a,b) => a -b);
console.log(arr2);

console.log("sort b-a");
arr2 =  arr.sort((a,b) => b -a);
console.log(arr2);

console.log("Mix");
arr2 =  arr.map(i => i*5).filter(item => item%2).sort((a,b) => b-a);
console.log(arr2);

console.log("Random");
let arr41 = new Array(8);
// for (let i = 0; i <8; i++) {
//     let ran = Math.floor(Math.random()*99)+1;
//     console.log(ran);
//     arr41.push(ran);
// }
console.log(arr41);

arr41  =arr41.map(item =>Math.floor(Math.random()*99+1)+1 )
console.log(arr41);

