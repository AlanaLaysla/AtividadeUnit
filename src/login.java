/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Esta classe é feita para que os usuarios possam logar com seus dados pessoais para que possam
 *visualizar filmes que ja foram alugados e poder alugar outros novamente
 * 
 * @author Alana Laysla
 */
public class login {

    /**
     *
     */
    public String usuario;
   
    /**
     *
     */
    public String categoria;
   
    /**
     *
     */
    public int cpf;
   
    /**
     *
     * @return execução da classe login
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     *
     * @param usuario - pega o nome atribuido pelo usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     *
     * @return retornará o nome que foi atribuido
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     *
     * @param categoria - pega a categoria atribuida pelo usuario
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     *
     * @return retornará a categoria atribuida pelo usuario
     */
    public int getCpf() {
        return cpf;
    }

    /**
     *
     * @param cpf - pega o numero do cpf atribuido pelo usuario 
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
   
   
   
}
