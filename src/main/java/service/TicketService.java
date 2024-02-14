package service;

import busi.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.util.List;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
public class TicketService {
    private EntityManager manager;

    public TicketService() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("example");
        manager = factory.createEntityManager();
    }
/*
    // Créer un nouveau ticket
    public void createTicket(Ticket ticket) {
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        manager.persist(ticket);
        transaction.commit();
    }

    // Mettre à jour un ticket existant
    public void updateTicket(Ticket ticket) {
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        manager.merge(ticket);
        transaction.commit();
    }

    // Supprimer un ticket existant
    public void deleteTicket(Long ticketId) {
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        Ticket ticket = manager.find(Ticket.class, ticketId);
        manager.remove(ticket);
        transaction.commit();
    }

    // Récupérer un ticket par son identifiant
    public Ticket getTicketById(Long ticketId) {
        return manager.find(Ticket.class, ticketId);
    }

    // Récupérer tous les tickets
    public List<Ticket> getAllTickets() {
        return manager.createQuery("SELECT t FROM Ticket t", Ticket.class).getResultList();
    }

    // Récupérer tous les tickets d'une certaine priorité
    public List<Ticket> getTicketsByPriority(Priorite priorite) {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Ticket> query = builder.createQuery(Ticket.class);
        Root<Ticket> root = query.from(Ticket.class);
        query.select(root)
                .where(builder.equal(root.get("priorite"), priorite));

        return manager.createQuery(query).getResultList();
    }

    // Récupérer les tickets par utilisateur
    public List<Ticket> getTicketsByUser(Utilisateur user) {
        return manager.createQuery("SELECT t FROM Ticket t WHERE t.utilisateur = :user", Ticket.class)
                .setParameter("user", user)
                .getResultList();
    }*/
}
