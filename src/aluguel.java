/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Nessa classe o usuario terá que informar os dados do filme que deseja alugar
 * 
 * @author Alana Laysla
 */
public class aluguel {
    
    /**
     *
     */
    public String NomeDoFilme;
     
    /**
     *
     */
    public int AnoDoFilme;
     
    /**
     *
     */
    public String Categoria;

    /**
     *
     * @return execução da classe aluguel
     */
    public String getNomeDoFilme() {
        return NomeDoFilme;
    }

    /**
     *
     * @param NomeDoFilme - o valor atribuido para o nome do filme pelo cliente
     */
    public void setNomeDoFilme(String NomeDoFilme) {
        this.NomeDoFilme = NomeDoFilme;
    }

    /**
     *
     * @return retornará o nome do filme
     */
    public int getAnoDoFilme() {
        return AnoDoFilme;
    }

    /**
     *
     * @param AnoDoFilme - o valor atribuido do ano do filem pelo cliente
     */
    public void setAnoDoFilme(int AnoDoFilme) {
        this.AnoDoFilme = AnoDoFilme;
    }

    /**
     *
     * @return terornará o resultado do ano do filme atribuido
     */
    public String getCategoria() {
        return Categoria;
    }

    /**
     *
     * @param Categoria - o valor atribuido da categoria do filme pelo cliente
     */
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    
     
     
}
