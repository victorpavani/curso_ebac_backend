class PessoaFisica extends Pessoa {
    private long cpf;

    public PessoaFisica(String nome, long cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }

    @Override
    public long getIdentificador() {
        return cpf;
    }
}