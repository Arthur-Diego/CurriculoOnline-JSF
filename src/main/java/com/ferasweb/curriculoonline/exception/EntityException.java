/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.exception;

import javax.ejb.ApplicationException;

/**
 *
 * @author Aluno
 */
@ApplicationException(rollback = true)
public class EntityException extends BusinessException {

    /**
     * Construtor que recebe a mensagem e as variações.
     *
     * @param msg Chave da msg a ser recolhida em um arquivo de propriedades.
     * @param var Informações que são definidas dinâmicamente no aquivo de
     * propriedades, {0}, {1}...
     */
    public EntityException(String msg, String[] var) {
        super(msg, var);
    }

    /**
     * Construtor que recebe somente a mensagem como argumento, não são
     * necessários variações.
     *
     * @param msg Chave da msg a ser recolhida em um arquivo de propriedades.
     */
    public EntityException(final String msg) {
        super(msg);
    }
}
