function dropFunc() {
	
	var elements = document.getElementsByTagName('select')
	document.getElementById("id2").style.color = "red";
	var count = 0;	
for(var i = 0;i<elements.length;i++)
{
	if(elements[i].selected)
		count++;
	
		
}
if(count==0)
{
	
document.getElementById("id2").innerHTML =	"Select one option";
	return false;
}
else
{document.getElementById("id2").innerHTML = "";
    return true;
}}
	
	
	
function myfunc(){
	
	
var elements = document.getElementsByName("gender");
document.getElementById("id1").style.color = "red";
var count = 0;	
for(var i = 0;i<elements.length;i++)
{
	if(elements[i].checked)
		count++;
	
		
}
if(count==0)
{
	document.getElementById("id1").innerHTML = "Select one radio button";
	return false;
}
else
{document.getElementById("id1").innerHTML = "";
    return true;
}}


function submitForm() {
	var x =  dropFunc();
	var y = myfunc();
	if(x && y)
		return true;
	else
		return false;
}