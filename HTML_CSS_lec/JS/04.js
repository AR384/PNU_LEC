function hello(){
    alert("Description");
}
//화살표 함수 const는 바뀌지 않는것

const hello2 = 1;//값을 받는 형태
const hello3 = (msg) => {
    alert("hello "+msg);
}//익명 함수를 받는 형태

const hi = () =>{
    document.getElementById("font").innerHTML = "element" ;
}
