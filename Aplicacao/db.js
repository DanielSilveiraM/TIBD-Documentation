function leDados() {
    let strDados = localStorage.getItem('db');
    let objDados = {};

    if (strDados) {
        objDados = JSON.parse(strDados);
    }
    else {
        objDados = {
            usuarioLogado: null,

            usuarioPessoa: [
                {
                    idUsuarioPessoa: "1",
                    email: "leonardo@gmail.com", senha: "1234",
                    cpf: "99.999.999/0001-99", foto: "",
                    nome_completo: "Leonardo Barbosa Brandão", telefone_pessoal: "+55(12)98162-1585", idade: "20",
                    cep: "31000-000", cidade: "Belo Horizonte",
                    endereco: { bairro: "Santa Efigênia", rua: "Alameda Ezequiel Dias", numero: "321", complemento: "" },
                    tipo_sanguineo: ["B-"],
                    tipos_sanguineos_compativeis_receber: [ "B-", "O-" ], 
                    necessiadade_especial: "Não",
                    idAgendamento: "3"
                },

                {
                    idUsuarioPessoa: "2",
                    email: "bernardo_souza@outlook.com", senha: "1234",
                    cpf: "99.999.999/0001-99", foto: "",
                    nome_completo: "Bernardo Souza", telefone_pessoal: "+55(31)98782-1241", idade: "20",
                    cep: "31000-000", cidade: "Belo Horizonte",
                    endereco: { bairro: "Santa Efigênia", rua: "Alameda Ezequiel Dias", numero: "321", complemento: "" },
                    tipo_sanguineo: ["B-"],
                    tipos_sanguineos_compativeis_receber: [ "B-", "O-" ], 
                    necessiadade_especial: "Não",
                    idAgendamento: "1"
                },

                {
                    idUsuarioPessoa: "3",
                    email: "daniel_dasilveira@outlook.com", senha: "1234",
                    cpf: "99.999.999/0001-99", foto: "",
                    nome_completo: "Daniel da Silveira", telefone_pessoal: "+55(31)97717-5529", idade: "20",
                    cep: "31000-000", cidade: "Belo Horizonte",
                    endereco: { bairro: "Santa Efigênia", rua: "Alameda Ezequiel Dias", numero: "321", complemento: "" },
                    tipo_sanguineo: ["B-"],
                    tipos_sanguineos_compativeis_receber: [ "B-", "O-" ], 
                    necessiadade_especial: "Não",
                    idAgendamento: "2"
                }
            ] 
        }
    }

    return objDados;
}

function salvaDados(dados) {
    localStorage.setItem('db', JSON.stringify(dados));
}