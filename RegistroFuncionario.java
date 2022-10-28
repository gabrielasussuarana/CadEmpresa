public class RegistroFuncionario {
    private int idFuncionario;
    private String nomeFuncionario;
    private boolean concluiuFundamental;
    private String nomeEscolaFundamental;
    private boolean concluiuMedio;
    private String nomeEscolaMedio;
    private boolean concluiuFaculdade;
    private String nomeFaculdade;

    public RegistroFuncionario(int idFuncionario, String nomeFuncionario) {
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;

    }

    public RegistroFuncionario(int idFuncionario, String nomeFuncionario, boolean concluiuFundamental, String nomeEscolaFundamental) {
        this(idFuncionario, nomeFuncionario);
        this.concluiuFundamental = concluiuFundamental;
        this.nomeEscolaFundamental = nomeEscolaFundamental;
    }

    public RegistroFuncionario(int idFuncionario, String nomeFuncionario, boolean concluiuFundamental, String nomeEscolaFundamental, boolean concluiuMedio, String nomeEscolaMedio) {
        this(idFuncionario, nomeFuncionario, concluiuFundamental, nomeEscolaFundamental);
        this.concluiuMedio = concluiuMedio;
        this.nomeEscolaMedio = nomeEscolaMedio;
    }

    public RegistroFuncionario(int idFuncionario, String nomeFuncionario, boolean concluiuFundamental, String nomeEscolaFundamental, boolean concluiuMedio, String nomeEscolaMedio, boolean concluiuFaculdade, String nomeFaculdade) {
        this(idFuncionario, nomeFuncionario, concluiuFundamental, nomeEscolaFundamental, concluiuMedio, nomeEscolaMedio);
        this.concluiuFaculdade = concluiuFaculdade;
        this.nomeFaculdade = nomeFaculdade;
    }


    @Override
    public String toString() {
        if(concluiuFundamental == false && concluiuFaculdade == false)
            return "\nNome: " + nomeFuncionario + " Código: " + idFuncionario;
        if(nomeEscolaFundamental !=null && concluiuFundamental==true)
            return "\nNome: " + nomeFuncionario + " Código: " + idFuncionario + " Escola Fundamental: " + nomeEscolaFundamental;
        if(concluiuFundamental == true && concluiuMedio == true)
            return "\nNome: " + nomeFuncionario + " Código: " + idFuncionario + " Escola Fundamental: " + nomeEscolaFundamental + " Escola Médio: " + nomeEscolaMedio;
        else
            return "\nNome: " + nomeFuncionario + " Código: " + idFuncionario + " Escola Fundamental: " + nomeEscolaFundamental + " Escola Médio: " + nomeEscolaMedio + " Faculdade: " + nomeFaculdade;
    }
}
