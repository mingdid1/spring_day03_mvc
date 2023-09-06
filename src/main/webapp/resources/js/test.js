function test() {
	alert("test 클릭");
}

window.onload = () => {
		const btn = document.getElementById("btn")
		btn.addEventListener("click", test)
}