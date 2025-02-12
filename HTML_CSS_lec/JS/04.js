function hello(){
    alert("Description");
}
// const는 바뀌지 않는것

const hello2 = 1;//값을 받는 형태
//화살표 함수
const hello3 = (msg) => {
    alert("hello "+msg);
}//익명 함수를 받는 형태

const hi = () =>{
    document.getElementById("msg").innerHTML = "Hello <span>" + msg + "</span>!!" ;
}

console.log("hi")

console.log(x);
var x = 1 ;
console.log(x);
                
console.log("hi")

// console.log(y); let은 할당후 시작전 까지 사용하지 않음
let y 
y=1; 
console.log(y);

function snd(){
    let s = document.getElementById("txt1").value;
    //let s2 = document.getElementById("txt12").value;
    document.getElementById("txt2").value = s;
}

function snd2(){
    let s = document.getElementById("txt1").value;
    //문자열 출력력
    console.log(s);
    //문자열 한줄씩 출력
    for (let i = 0; i < s.length; i++) {
        console.log(s[i])
    }
    for (let c of s) {
        console.log(c)
    }
    let r = s.concat(c);
    console.log(r)

}


class Input_ {
    constructor(parameters) {}
    show(i ,s){
        document.getElementById('txt'+i).value = s
    }

}

let Input_s = new Input_();



function check2(){
    //1. 문자열 가져오기
    let s = String(document.getElementById("txt1").value);
    //2. 문자열 뒤집어진 문자열 생성
    let sr = s;
    let ssr = ' ';
    let abe = [...s,...ssr];
    ssr = s.replaceAll(" ","").split('').reverse().join('').replace();
    for (let i = s.length-1; i >=0; i--) {
        sr = sr + s[i]
    }
    console.log(s,sr)
    Input_s.show(2,s)
    Input_s.show(3,sr)
    Input_s.show(4,abe)
    
    
}
const check3 = () =>{
    let s = document.getElementById("txt1").value;
    
    let sum = 0;
    for (let c of s) {
        if (! isNaN(c) ) {
            sum = sum+parseInt(c);
        }
    }
    document.getElementById('txt2').value = sum
}

function check4(){
    let ran = [];
    while (ran.length < 7) {
        let n = Math.floor(Math.random()*45+1)+1
        ran[n]
    }
    Input_s.show(5,ran);
}
