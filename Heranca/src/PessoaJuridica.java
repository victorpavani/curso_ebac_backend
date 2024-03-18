class PessoaJuridica extends Pessoa {
    private long cnpj;

    public PessoaJuridica(String nome, long cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public long getCnpj() {
        return cnpj;
    }

    @Override
    public long getIdentificador() {
        return cnpj;
    }
}
