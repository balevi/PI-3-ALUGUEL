package br.fvc.pi3.dao;

import br.fvc.pi3.model.Usuario;
import br.fvc.pi3.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author Silas Souza
 */
public class UsuarioDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvar(Usuario usuario) {
        try {
            this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
            this.transacao = this.sessao.beginTransaction();
            this.sessao.save(usuario);
            this.transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível inserir usuário! Erro: " + e.getMessage());
        } finally {
            try {
                if (this.sessao.isOpen()) {
                    this.sessao.close();
                }
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de inserção. Mensagem: " + e.getMessage());
            }
        }
    }
}
