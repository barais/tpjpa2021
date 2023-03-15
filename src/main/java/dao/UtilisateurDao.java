package dao;

import models.Utilisateur;

public class UtilisateurDao extends AbstractJpaDao<Long, Utilisateur> {
    public UtilisateurDao() {
        setClazz(Utilisateur.class);
    }
}
