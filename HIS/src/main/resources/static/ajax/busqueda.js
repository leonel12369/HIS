function enviar(){
	var departamento=document.getElementById("Sdepartamento").value;
	var provincia = $("#provincia").val();
	var distrito = $("#distrito").val();
	var tipoDoc = $("#tipDoc").val();
	var mes = $("#mes").val();
	var check_error = $("#check_error").val();
	
	console.log(departamento);
	console.log(provincia);
	console.log(distrito);
	console.log(tipoDoc);
	console.log(mes);
	console.log(check_error);
	
	
}

function check(){
	var check_error = document.getElementById("check_error");
	 if (check_error.checked == true) {
		 var check_error = $("#check_error").val(true);
         alert("Encontrar errores Activado");
     } else {
    	 var check_error = $("#check_error").val(false);
         alert("Encontrar errores Desactivado");
     }
}

