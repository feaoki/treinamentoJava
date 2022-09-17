function validaLogin(){

    let userTxt = localStorage.getItem("userLogged");

    if(!userTxt){
        window.location = "index.html";
    }

    let jsonUser = JSON.parse(userTxt);
    if(jsonUser.perfil == 0){
        loginAprovado(jsonUser);
    }else{
        window.location = "index.html";
    }
}

function loginAprovado(user){
    
    document.getElementById("user").innerHTML = `${user.nome} <br> ${user.cpf} ` ;
    document.getElementById("imgUser").innerHTML = `<img src ="${user.linkFoto}">`;
    obterAtividades();
}

function obterAtividades() {
    fetch("http://localhost:8080/atividades")
        .then(res => res.json())
        .then(result => preencheAtividades(result));
}

function preencheAtividades(resposta) {
    let atividades = '';

    for (let index = 0; index < resposta.length; index++) {
        atividades = atividades + `<option value = ${resposta[index].id}> ${resposta[index].descricao} </option>`;
    }

    document.getElementById("sel_atividades").innerHTML = atividades;
}


function filtrar(){
    let status = document.getElementById("sel_atividades");
    let atividadeId = status[status.selectedIndex].value; 
    let link;

    fetch("http://localhost:8080/atividade/" + atividadeId)
    .then(res => res.json())
    .then(result => preencheRespostaGestor(result));
}

function preencheRespostaGestor(resposta){
    console.log(resposta);
    let chamados = '<table class = "table"> <tr> <th>#chamado</th> <th>descrição</th> <th>data</th> <th>Técnico</th> <th>status</th> </tr>';

    for (let index = 0; index < resposta.chamados.length; index++) {
        chamados = chamados + `<tr> <td> ${resposta.chamados[index].numChamado} </td> 
                                  <td> ${resposta.chamados[index].descricao} </td>
                                  <td> ${resposta.chamados[index].dataAgendamento} </td>
                                  <td> ${resposta.chamados[index].usuario.nome} </td> 
                                  <td> ${resposta.chamados[index].status ==0?'Pendente':'Atendido'} </td> 
                                  </tr>`;
    }

    chamados = chamados + '</table>';

    document.getElementById("tableResposta").innerHTML = chamados;
}

