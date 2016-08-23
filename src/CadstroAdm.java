/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Essa classe faz com que o adminstrador possa fazer seu próprio cadastro do seu próprio sistema
 * 
 * @author Alana Laysla
 */
public class CadstroAdm {
    
    /**
     *
     */
    public String nome;
    
    /**
     *
     */
    public int senha;
    
    /**
     *
     */
    public int cpf;

    /**
     *
     * @return execução da classe cadastro do usuario
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome - pega o nome atribuido pelo usuario
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return retorna o nome atribuido pelo usuario 
     */
    public int getSenha() {
        return senha;
    }

    /**
     *
     * @param senha - pega a senha que o usuario atribuiu
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }

    /**
     *
     * @return retorna senha atribuida
     */
    public int getCpf() {
        return cpf;
    }

    /**
     *
     * @param cpf pega o cpf que foi atribuido pelo usuario
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    
}
