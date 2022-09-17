

function validaLogin(){

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

function loginAprovado(user){
    
    document.getElementById("user").innerHTML = `${user.nome} <br> ${user.cpf} ` ;
    document.getElementById("imgUser").innerHTML = `<img src ="${user.linkFoto}">`;
    document.getElementById("idLogado").value = user.id;
    
}


function obterChamados(){
    let radioAtendido = document.getElementById("radioAtendidos");
    let id = document.getElementById("idLogado").value;
    let consulta;
    

    if(radioAtendido.checked){
        consulta = "http://localhost:8080/chamado/atendidos/" + id;
    }else{
        consulta = "http://localhost:8080/chamado/pendentes/" + id;
    }
/*     console.log(consulta);
    debugger; */
    fetch(consulta)
    .then(res => res.json())
    .then(result => preencheRespostaTecnico(result));
}


function filtrar(){
    let atividade = document.getElementById("sel_atividades");
    let atividadeId = atividade[atividade.selectedIndex].value; 

    fetch("http://localhost:8080/atividade/"+atividadeId)
    .then(res => res.json())
    .then(result => preencheRespostaTecnico(result));
}

function preencheRespostaTecnico(resposta){
    let atividades = '<table class = "table"> <tr> <th>#chamado</th> <th>descrição</th> <th>data</th> <th>horas</th> <th>usuario</th> <th>status</th> </tr>';
    
    let btnStatusOff = '<button class="btn btn-sm btn-secondary">Atendido</button>'

    for (let index = 0; index < resposta.length; index++) {
        let btnStatusOn = `<button class="btn btn-sm btn-primary" onclick="atender(${resposta[index].numChamado})">Atender</button>`;

        atividades = atividades + `<tr> <td> ${resposta[index].numChamado} </td> 
                                  <td> ${resposta[index].descricao} </td>
                                  <td> ${resposta[index].dataAgendamento} </td>
                                  <td> ${resposta[index].horasGastas} </td> 
                                  <td> ${resposta[index].usuario.nome} </td> 
                                  <td> ${resposta[index].status == 0? btnStatusOn
                                    :btnStatusOff} </td>
                                  </tr>`;
    }

    atividades = atividades + '</table>';

    document.getElementById("tableResposta").innerHTML = atividades;
}

function atender(numChamado) {

    window.location = "atendimento.html?numChamado="+numChamado;
}