package br.fvc.pi3.controller;

import br.fvc.pi3.dao.UsuarioDAO;
import br.fvc.pi3.model.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author Silas Souza
 */
@ManagedBean
@SessionScoped
public class UsuarioBean implements Serializable {

    private Usuario usuario;
    private List<Usuario> listaUsuario;
    private UsuarioDAO usuarioDAO;
    private boolean editar = false;

    public UsuarioBean() {
         usuario = new Usuario();
         listaUsuario = new ArrayList<>();
         usuarioDAO = new UsuarioDAO();
    }

    public String novo() {
        usuario = new Usuario();
        editar = false;
        return "";
    }

    public void excluir() {
        listaUsuario.remove(usuario);
    }

    public String editar() {
        editar = true;
        return "";
    }

    public String salvar() {
        usuarioDAO.salvar(usuario);
        usuario = new Usuario();

        /*if (editar) {
            listaUsuario.set(listaUsuario.indexOf(usuario), usuario);
        } else {
           
            listaUsuario.add(usuario);
        }*/
        return "";
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }
}
