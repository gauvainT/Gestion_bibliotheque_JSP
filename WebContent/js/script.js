'use strict'

function deleteRow(r) {
	
	
	var XHR;
	
	if(window.XMLHttpRequest){
		XHR = new XMLHttpRequest();
	}
	else {
		XHR = new ActiveXObject("Microsoft.XMLHTTP");
	}
	// fonction de test dans le open
	XHR.onreadystatechange = function (){
		if( XHR.readyState === 4 && XHR.status === 200){
			
			console.log("youpi !")

		}
	}

	XHR.open("GET", "livreGestion?idLivreToDelete=" + r.value, true);
	XHR.send();
	
}