$(document).ready(function(){

    $("#salvar_limpar").click(function(){ //função ao clicar no salvar

        if ($("#form_nome").val() == "") {       
            $("#form_nome").removeClass("formulario").addClass("error"); //Remove a cor padrão e deixa a borda vermelha
            alert ("Todos os campos são obrigatórios."); //alerta caso o Nome não seja preenchido
        
        } else if ($("#form_sobrenome").val() =="") {
            $("#form_sobrenome").removeClass("formulario").addClass("error"); //Remove a cor padrão e deixa a borda vermelha
            alert ("Todos os campos são obrigatórios."); //alerta caso o Sobrenome não seja preenchido
            
        } else if ($("#form_email").val() =="") {
            $("#form_email").removeClass("formulario").addClass("error"); //Remove a cor padrão e deixa a borda vermelha
            alert ("Todos os campos são obrigatórios."); //alerta caso o e-mail não seja preenchido

        } else if ($("#form_matricula").val() =="") {
            $("#form_matricula").removeClass("formulario").addClass("error"); //Remove a cor padrão e deixa a borda vermelha
            alert ("Todos os campos são obrigatórios."); //alerta caso a matricula não seja preenchida

        } else if ($("#form_usuario").val() =="") {
            $("#form_usuario").removeClass("formulario").addClass("error"); //Remove a cor padrão e deixa a borda vermelha
            alert ("Todos os campos são obrigatórios."); //alerta caso o usuário não seja preenchido

        } else if ($("#form_senha").val() =="") {
            $("#form_senha").removeClass("formulario").addClass("error"); //Remove a cor padrão e deixa a borda vermelha
            alert ("Todos os campos são obrigatórios."); //alerta caso a senha não seja preenchida

        } else if ($("#form_confirmsenha").val() =="") {
            $("#form_confirmsenha").removeClass("formulario").addClass("error"); //Remove a cor padrão e deixa a borda vermelha
            alert ("Todos os campos são obrigatórios."); //alerta caso o confirmar senha não seja preenchid

        } else if ($("#form_senha").val() != ($("#form_confirmsenha").val())) {
            $("#form_senha").removeClass("formulario").addClass("error"); //Remove a cor padrão e deixa a borda vermelha
            $("#form_confirmsenha").removeClass("formulario").addClass("error");
            alert ("A senha e a confirmação de senha não estão iguais.");  //alerta caso o a senha e o confirmar senha sejam diferentes
            
        } else { //alerta de cadastro realizado e limpeza de todos os campos
            alert ("Cadastro realizado!") 
            $("#form_nome").removeClass("error").addClass("formulario").val("");
            $("#form_sobrenome").removeClass("error").addClass("formulario").val("");
            $("#form_email").removeClass("error").addClass("formulario").val("");
            $("#form_matricula").removeClass("error").addClass("formulario").val("");
            $("#form_usuario").removeClass("error").addClass("formulario").val("");
            $("#form_senha").removeClass("error").addClass("formulario").val("");
            $("#form_confirmsenha").removeClass("error").addClass("formulario").val("");

            $("#form_nome").focus(); //Foco no primeiro campo da página ao salvar
        }
        
    })

})
