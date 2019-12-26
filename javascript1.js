function dropFunc() {
	
	var elements = document.getElementsByTagName('select')
	var count = 0;	
for(var i = 0;i<elements.length;i++)
{
	if(elements[i].selected)
		count++;
	
		
}
if(count==0)
{
	document.getElementById("id2").innerHTML = "Select one option";
	return false;
}
else
{document.getElementById("id2").innerHTML = "";
    return true;
}}
	
	
	
function myfunc(){
	
	
var elements = document.getElementsByName("gender");
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
	if(dropFunc() && myfunc())
		return true;
	else
		return false;
}
	


