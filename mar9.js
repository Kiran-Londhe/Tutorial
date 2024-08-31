let page = document.getElementById("a")
console.log(page)

function dayNight()
{
    page.classList.toggle('night')
    page.style.transition = '2s'
}

let line = document.getElementById("h")
console.log(line)

// line.style.visibility = "hidden"
// line.style.display = "none"

function hide()
{

 if (line.style.visibility == "visible")

 {
    line.style.visibility = "hidden"
 }

 else

 {
    line.style.visibility = "visible"
 }

}
