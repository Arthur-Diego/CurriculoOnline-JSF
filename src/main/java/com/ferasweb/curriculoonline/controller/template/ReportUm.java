/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.controller.template;

import com.ferasweb.curriculoonline.model.entity.Perfil;
import com.ferasweb.curriculoonline.utils.ReportUtil;
import com.ferasweb.curriculoonline.utils.jpa.ConnectionFactory;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;

/**
 *
 * @author Andressa
 */
public class ReportUm implements Serializable {

    @Inject
    private ReportUtil reportUtil;
    @Inject
    private ConnectionFactory conn;

    private final String PATHREPORT = "/reports/curriculo1/TESTE.jasper";
    private final String PATHIMAGE = "/reports/curriculo1/";
    private final String PATHSUBREPORTS = "/reports/curriculo1/";

    public void generateReportUm(Perfil perfil) {
        Map map = ReportUtil.getParams();

    }

    public void generateCurriculoUm(Perfil perfil) {
        Map params = ReportUtil.getParams();

        InputStream reportMaster = getClass().getResourceAsStream(PATHREPORT);
        URL icon = getClass().getResource(PATHIMAGE);
        URL subreports = getClass().getResource(PATHSUBREPORTS);
        params.put("nome", perfil.getNome());
        params.put("objetivo", perfil.getConhecimento().getObjetivo());
        params.put("estCivil_Idade", perfil.getEstadoCivil().getLabel() + ", " + perfil.getIdade() + " anos");
        params.put("ruaNumero", perfil.getEndereco().getRua() + " - " + perfil.getEndereco().getNumero());
        params.put("bairroCidadeUf", perfil.getEndereco().getBairro() + " - " + perfil.getEndereco().getCidade() + " - " + perfil.getEndereco().getEstado());
        params.put("telefoneEmail", perfil.getTelefone() + "/" + perfil.getEmail());
        params.put("Perfil_Cod", perfil.getPerfilCod());
        params.put("conhecimento_cod", perfil.getConhecimento().getConhecimentoCod());
        if (!perfil.isCurriculoComOuSemFoto()) {

        } else {
            params.put("foto", perfil.getFoto());
        }
        params.put("SUBREPORT_DIR", subreports.toString());
        params.put("IMAGE_DIR", icon.toString());

        reportUtil.generateCurriculo(reportMaster, params, conn.getConnection("", ""));
    }

}
