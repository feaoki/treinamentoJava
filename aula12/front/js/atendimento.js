
function validaLogin(){

    console.log("passou atendimento.js")
    let userTxt = localStorage.getItem("userLogged");

    if(!userTxt){
        window.location = "index.html";
    }

    let jsonUser = JSON.parse(userTxt);
    if(jsonUser.perfil == 1){
        loginAprovado(jsonUser);
    }else{
        window.location = "index.html";
    }
}

function loginAprovado(){
    const queryString = window.location.search;
    const urlParams = new URLSearchParams(queryString);
    const numChamado = urlParams.get('numChamado');
    
    fetch("http://localhost:8080/chamado/"+numChamado)
    .then(res => res.json())
    .then(result => preencheDados(result));

}

function preencheDados(resposta){
    document.getElementById("txtUser").value = resposta.usuario.id;
    document.getElementById("txtChamado").value = resposta.numChamado;
    document.getElementById("txtAtividade").value = resposta.atividade.descricao;
    document.getElementById("txtData").value = resposta.dataAgendamento;
    document.getElementById("txtAtividadeId").value = resposta.atividade.id;
}

function atualizarChamado(evento){

    evento.preventDefault();

    let objChamado = {
        numChamado: document.getElementById("txtChamado").value,
        descricao: document.getElementById("txtDescricao").value,
        dataAgendamento: document.getElementById("txtData").value,
        horasGastas:document.getElementById("txtHoras").value,
        troca: document.getElementById("radioTroca").checked ? 1:0,
        status:1,
        usuario:{
            id:document.getElementById("txtUser").value
        },
        atividade:{
            id:document.getElementById("txtAtividadeId").value
        }
    }

    let cabecalho = {
        method: 'POST',
        body: JSON.stringify(objChamado),
        headers:{
            'Content-type':'application/json'
        }
    }

    fetch("http://localhost:8080/chamado/update", cabecalho)
    .then(res => res.json())
    // .then(result => console.log(result));

    window.location = "atend_tecnico.html";
}


