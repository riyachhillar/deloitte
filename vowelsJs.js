function countVowels()
{
 var ee = document.getElementById("txt").value;
 
 var a = 0;
 var e = 0;
 var i = 0;
 var o = 0;
 var u = 0;
 
 for(var j =0; j<ee.length;j++){
  if((ee[j] == 'a'))
	a++;
   if( ee[j] == 'e')
	e++;
   if(ee[j] == 'i')
	i++;
  if(ee[j] == 'o')
	o++;
   if(ee[j] == 'u')
	u++;
    
 }
 document.getElementById("sp1").innerHTML = "a = " + a;
  document.getElementById("sp2").innerHTML = "e = " + e;
   document.getElementById("sp3").innerHTML = "i = " + i;
    document.getElementById("sp4").innerHTML = "o = " + o;
	 document.getElementById("sp5").innerHTML = "u = " + u;

 }