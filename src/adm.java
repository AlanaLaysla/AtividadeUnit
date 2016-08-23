/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Esta classe será de restrita utilização do dono do sistema para que ele possa
 * fazer alterações sobre as contas de seus clientes
 * 
 * @author Alana Laysla
 */
public class adm {

    /**
     *
     * @return retornará se pode visualizar os dados de um cliente 
     */
    public boolean isVisualizarContaUsu() {
        return visualizarContaUsu;
    }

    /**
     *
     * @param visualizarContaUsu boolean dirar de pode visualizar ou não os dados do usuario
     */
    public void setVisualizarContaUsu(boolean visualizarContaUsu) {
        this.visualizarContaUsu = visualizarContaUsu;
    }

    /**
     *
     * @return retornará a edição dos dados do usuario
     */
    public boolean isAlterarConta() {
        return alterarConta;
    }

    /**
     *
     * @param alterarConta irá informar de pode ou não editar os dados do usuario pelo boolean
     */
    public void setAlterarConta(boolean alterarConta) {
        this.alterarConta = alterarConta;
    }

    /**
     *
     * @return retornará a confirmação da exclusão do usuario
     */
    public boolean isDeletarConta() {
        return deletarConta;
    }

    /**
     *
     * @param deletarConta irá informar se pode ou não ser excluida a conta do usuario
     */
    public void setDeletarConta(boolean deletarConta) {
        this.deletarConta = deletarConta;
    }
    
    /**
     *
     */
    public boolean visualizarContaUsu;
    
    /**
     *
     */
    public boolean alterarConta;
    
    /**
     *
     */
    public boolean deletarConta;
    
}
