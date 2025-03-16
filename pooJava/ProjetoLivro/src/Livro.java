public class Livro implements Publicação {
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(p > this.getTotPaginas()) {
            p = this.getTotPaginas();
        }
        this.setPagAtual(p);
    }

    @Override
    public void avancarPag() {
        if(this.getPagAtual() == this.getTotPaginas()) {
            this.setPagAtual(0);
        }
        this.setPagAtual(this.getPagAtual()+1);
    }

    @Override
    public void voltarPag() {
        if(this.getPagAtual() == 0) {
            this.setPagAtual(this.getTotPaginas());
        }
        this.setPagAtual(this.getPagAtual()-1);
    }

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" + '\n' +
                "\ttitulo='" + titulo + '\'' + '\n' +
                "\tautor='" + autor + '\'' + '\n' +
                "\ttotPaginas=" + totPaginas + '\n' +
                "\tpagAtual=" + pagAtual + '\n' +
                "\taberto=" + aberto + '\n' +
                "\tleitor=" + leitor.getNome() + '\n' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}
