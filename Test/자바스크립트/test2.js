
function setAvgAge(){
  //클래스가 ageTd인 태그 전부 선택
  const tds = document.querySelectorAll('.ageTd');

  //위에서 선택한 태그들의 개수만큼 반복

  //첫번째 매개변수 : 반복되는 데이터에서 데이터 하니씩을 부르는 이름
  let sum=0;
  tds.forEach(function(tdTag, i){
   sum=sum+ Number(tdTag.textContent);
  });
  console.log(sum/3);
 let avg= sum/3;
const avgTd=document.querySelector('#resultTd');
 avgTd.innerHTML=avg;
}

