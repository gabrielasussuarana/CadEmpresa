public class RendaFuncionario extends RegistroFuncionario{
    public RendaFuncionario(int idFuncionario, String nomeFuncionario) {
        super(idFuncionario, nomeFuncionario);
    }

    public RendaFuncionario(int idFuncionario, String nomeFuncionario, boolean concluiuFundamental, String nomeEscolaFundamental) {
        super(idFuncionario, nomeFuncionario, concluiuFundamental, nomeEscolaFundamental);
    }

    public RendaFuncionario(int idFuncionario, String nomeFuncionario, boolean concluiuFundamental, String nomeEscolaFundamental, boolean concluiuMedio, String nomeEscolaMedio) {
        super(idFuncionario, nomeFuncionario, concluiuFundamental, nomeEscolaFundamental, concluiuMedio, nomeEscolaMedio);
    }

    public RendaFuncionario(int idFuncionario, String nomeFuncionario, boolean concluiuFundamental, String nomeEscolaFundamental, boolean concluiuMedio, String nomeEscolaMedio, boolean concluiuFaculdade, String nomeFaculdade) {
        super(idFuncionario, nomeFuncionario, concluiuFundamental, nomeEscolaFundamental, concluiuMedio, nomeEscolaMedio, concluiuFaculdade, nomeFaculdade);
    }
}
