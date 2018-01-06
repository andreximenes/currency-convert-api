$(document).ready(function () {
    $("#calc-form").submit(function (event) {
        event.preventDefault();
		var mo = $('#moedaOrigem').val();
		var md = $('#moedaDestino').val();
		var val = $('#valor').val();

		if (validate(mo, md, val)){
			$.ajax({
			    url: 'https://currency-convert-api.herokuapp.com/api/v1/calc/'+val+'&'+mo+'-'+md ,
			    contentType: 'application/json',
			    dataType: 'json',
			    type: 'get',
			    success: function(resposta) {
			        console.log(resposta);
			        $('#valorConvertido').text('R$ ' +  mascaraValor(resposta.data.total));
			        $('#valorConvertido').focus();
			    }.bind(this),
			    error: function() {
			        console.log('erro');
			    }
			}); 
		}
    }); 

});

function validate(mo, md, val) {
	if(mo == '' || mo == '0'){
		alert ('Moeda Origem inválida');
		$('#moedaOrigem').focus();
		return false;
	}
	
	if(md == '' || md == '0'){
		alert ('Moeda Destino inválida');
		$('#moedaDestino').focus();
		return false;
	}
	
	if (val == ''|| val <= 0){
		alert('Digite um valor válido');
		$('#valor').focus();
		return false;
	}
	
	return true;
	
}

function mascaraValor(valorstr) {
	valor = parseFloat(valorstr).toFixed(2);
    valor = valor.toString().replace(/\D/g,"");
    valor = valor.toString().replace(/(\d)(\d{8})$/,"$1.$2");
    valor = valor.toString().replace(/(\d)(\d{5})$/,"$1.$2");
    valor = valor.toString().replace(/(\d)(\d{2})$/,"$1,$2");
    return valor                    
}