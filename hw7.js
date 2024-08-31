

b = document.getElementById("c")
console.log("a")

function fn()
{
if(b.textContent=="I am Learning JavaScript")
{
    b.textContent="I Love Java Programming.."
}
else
{
    b.textContent="I am Learning JavaScript"
}
}

y = document.getElementById("d")

function kr() 
{
    switch(y.style.backgroundColor) 
    {
        case "white":

            y.style.backgroundColor = "orange";
            break;

        case "orange":

            y.style.backgroundColor = "lime";
            break;

        case "lime":

            y.style.backgroundColor = "yellow";
            break;

        case "yellow":

            y.style.backgroundColor = "black";
            break;

        default:
            y.style.backgroundColor = "white";
    }
}





console.log(b)




