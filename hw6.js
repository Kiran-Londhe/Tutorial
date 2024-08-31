console.log("Abc")

a = document.getElementById("p")

function fn()
{
    
    if( a.textContent == "Status....")
{
    a.textContent = "Updated"
}

else
{
    a.textContent = "Status...."
}

}

console.log("bcd")
q = document.getElementById("v")

function kr()
{
 var currentColor = q.style.backgroundColor;

 if(currentColor == "pink")
 {
    q.style.backgroundColor="red"
 }
 else if(currentColor == "red")
 {
    q.style.backgroundColor="blue"
 }
 else if(q.style.backgroundColor="blue")
 {
    q.style.backgroundColor="pink"
 }
}



console.log(q)



console.log(a)