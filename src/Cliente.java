/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Classe com um conjunto de metodos que irá compor as funções do sistema do administrador
 * 
 * @author ALANA LAYSLA
 */
public class Cliente {
     public String Nome;

    
    public int Cpf;

    
    public String senha;

    /**
     *
     * @return o nome do cliente
     */
    public String getNome() {
        return Nome;
    }

    /**
     *
     * @param Nome pega o valor que será o nome do cliente
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     *
     * @return retorna o valor atribuido ao nome
     */
    public int getCpf() {
        return Cpf;
    }

    /**
     *
     * @param Cpf pega o valor atribuido ao cpf do cliente
     */
    public void setCpf(int Cpf) {
        this.Cpf = Cpf;
    }

    /**
     *
     * @return o valor que foi atribuido ao cpf do cliente
     */
    public String getSenha() {
        return senha;
    }

    /**
     *
     * @param senha pega a senha atribuida ao cliente
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
   
    
}
