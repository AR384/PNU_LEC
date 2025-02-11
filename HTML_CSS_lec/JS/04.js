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


const show = (m ) =>{
    document.getElementById('txt2').value = m
}

function check2(){
    //1. 문자열 가져오기
    let s = document.getElementById("txt1").value;
    //2. 문자열 뒤집어진 문자열 생성
    let sr = " ";
    for (let i = s.length-1; i >=0; i--) {
        sr = sr + s[i]
    }
    console.log(s,sr)
    //3.입력문자 비교
    if (s===sr) {
        show("d")
    }
    else{
        show("rl")
    }
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

