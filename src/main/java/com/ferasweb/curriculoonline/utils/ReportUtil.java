/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Andressa
 */
public class ReportUtil {

    JasperPrint print;
    private static Map<String, Object> map;
    /**
     * Metodo reponsavel pela construção do objeto print(Jasper Print) e com as
     * informações de como será exportado para pdf
     *
     * @param inputStream local do arquivo jasper
     * @param parametros paremetros que o relatório precise ou não para poder
     * ser gerado
     * @param dataSource fonte de dados no qual o relatório será preenchido
     * nesse caso um JRDataSource
     */
    private void openPDFDataSource(InputStream inputStream,
            Map parametros,
            JRDataSource dataSource) {

        ServletOutputStream responseStream = null;
        try {
            this.print = JasperFillManager.fillReport(inputStream, parametros, dataSource);
            HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
            response.addHeader("Content-disposition", "inline;filename=relatorio.pdf");
            response.setHeader("RELATÓRIO", "public");
            response.setContentType("application/pdf");
            responseStream = response.getOutputStream();
            JasperExportManager.exportReportToPdfStream(print, responseStream);
            FacesContext.getCurrentInstance().responseComplete();
            responseStream.close();

        } catch (IOException | JRException ex) {
            FacesContext.getCurrentInstance().responseComplete();
        }
    }

    /**
     * Metodo reponsavel pela construção do objeto print(Jasper Print) e com as
     * informações de como será exportado para pdf
     *
     * @param inputStream local do arquivo jasper
     * @param parametros paremetros que o relatório precise ou não para poder
     * ser gerado
     * @param conn fonte de dados no qual o relatório será preenchido nesse caso
     * uma Conexão com o Banco
     */
    private void openPDFConnection(InputStream inputStream,
            Map parametros,
            Connection conn) {

        ServletOutputStream responseStream = null;
        try {
            this.print = JasperFillManager.fillReport(inputStream, parametros, conn);
            HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
            response.addHeader("Content-disposition", "inline;filename=relatorio.pdf");
            response.setContentType("application/pdf");
            responseStream = response.getOutputStream();
            JasperExportManager.exportReportToPdfStream(print, responseStream);
            FacesContext.getCurrentInstance().responseComplete();
            responseStream.close();

        } catch (IOException | JRException ex) {
            FacesContext.getCurrentInstance().responseComplete();
        }
    }
    
    public static Map getParams(){
        map = new HashMap<>();
        return map; 
    }
}
