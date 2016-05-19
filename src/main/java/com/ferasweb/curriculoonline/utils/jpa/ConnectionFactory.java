/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.utils.jpa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.internal.SessionImpl;

/**
 *
 * @author Andressa
 */
public class ConnectionFactory {

    @PersistenceContext(unitName = "curriculoPU")
    private EntityManager em;

    public Connection getConnection(String user, String pass) {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost/curriculo", "root", "1234");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public Connection getConnectionOpen() {
        return getConnection("root", "1234");
    }

    /**
     * Define a conexão a partir do EntityManager.
     *
     * @return Connection
     */
    public Connection getConnection() {
        Connection con = em.unwrap(Connection.class);
        return con;
    }
}
